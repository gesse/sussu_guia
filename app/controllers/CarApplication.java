package controllers;


import models.Car;

import org.springframework.beans.factory.annotation.Autowired;

import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import services.CarBO;
import views.html.*;

@org.springframework.stereotype.Controller
public class CarApplication {

    @Autowired
    private CarBO carService; 

    public Result index() {
        return play.mvc.Controller.ok(car.render(Form.form(Car.class)));
    }

    public Result addCar() {
        Form<Car> form = Form.form(Car.class).bindFromRequest();
        Car car = form.get();
        carService.add(car);
        return play.mvc.Controller.redirect(controllers.routes.CarApplication.listCars());
    }
    
    public Result listCars() {
        return play.mvc.Controller.ok(Json.toJson(carService.getAll()));
    }
    
}