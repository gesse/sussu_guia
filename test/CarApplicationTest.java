import models.Car;

import org.junit.Test;

import play.data.Form;
import play.libs.WS;
import play.mvc.Content;
import play.mvc.Result;
import play.test.FakeRequest;

import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;

// todo: not using the right spring context when using fakeApplication()
public class CarApplicationTest {

    @Test
    public void indexTemplate() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Form<Car> form = Form.form(Car.class);
                Content html = views.html.car.render(form);
                assertThat(contentType(html)).isEqualTo("text/html");
                assertThat(contentAsString(html)).contains("Welcome");
            }
        });
    }

    @Test
    public void callIndex() {
        Result result = callAction(controllers.routes.ref.CarApplication.index());
        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentType(result)).isEqualTo("text/html");
        assertThat(charset(result)).isEqualTo("utf-8");
        assertThat(contentAsString(result)).contains("Welcome");
    }

    @Test
    public void callAddCar() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Map<String, String> formParams = new HashMap<String, String>();
                formParams.put("name", "foo");
                
                FakeRequest fakeRequest = fakeRequest().withFormUrlEncodedBody(formParams);
                
                Result result = callAction(controllers.routes.ref.CarApplication.addCar(), fakeRequest);
                assertThat(status(result)).isEqualTo(SEE_OTHER);
            }
        });
    }

    @Test
    public void callListCars() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Map<String, String> formParams = new HashMap<String, String>();
                formParams.put("name", "foo");

                FakeRequest fakeRequest = fakeRequest().withFormUrlEncodedBody(formParams);

                callAction(controllers.routes.ref.CarApplication.addCar(), fakeRequest);
                
                Result result = callAction(controllers.routes.ref.CarApplication.listCars());
                assertThat(status(result)).isEqualTo(OK);
                assertThat(contentType(result)).isEqualTo("application/json");
                assertThat(contentAsString(result)).startsWith("[");
                assertThat(contentAsString(result)).contains("foo");
            }
        });
    }

    @Test
    public void carsRoute() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Result result = route(fakeRequest(GET, "/cars"));
                assertThat(result).isNotNull();
            }
        });
    }

    @Test
    public void realCarsRequest() {
        running(testServer(3333), new Runnable() {
            @SuppressWarnings("deprecation")
			public void run() {
                assertThat(WS.url("http://localhost:3333/cars").get().get().getStatus()).isEqualTo(OK);
            }
        });
    }

}
