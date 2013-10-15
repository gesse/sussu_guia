import configs.AppConfig;
import models.Car;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static org.fest.assertions.Assertions.assertThat;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class CarTest extends AbstractTransactionalJUnit4SpringContextTests {
 
    @Test
    public void setBarName() {
        Car car = new Car();
        car.name = "foo";
        assertThat(car.name).isEqualTo("foo");
    }

}
