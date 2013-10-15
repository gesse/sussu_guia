import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import models.Car;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import services.CarBO;
import configs.AppConfig;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class CarServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CarBO carService;

    @Test
    public void createCar() {
        Car car = new Car();
        car.name = "foo";
        carService.add(car);
        assertThat(car.id).isNotNull();
    }

    @Test
    public void getCars() {
        createCar();
        List<Car> cars = carService.getAll();
        assertThat(cars.size()).isEqualTo(1);
    }

}