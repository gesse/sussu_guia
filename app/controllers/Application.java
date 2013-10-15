package controllers;


import models.Bar;

import org.springframework.beans.factory.annotation.Autowired;

import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import services.BarBO;
import views.html.*;

@org.springframework.stereotype.Controller
public class Application {

    @Autowired
    private BarBO barService;

    public Result index() {
        return play.mvc.Controller.ok(index.render(Form.form(Bar.class)));
    }

    public Result addBar() {
        Form<Bar> form = Form.form(Bar.class).bindFromRequest();
        Bar bar = form.get();
        barService.add(bar);
        return play.mvc.Controller.redirect(controllers.routes.Application.index());
    }

    public Result listBars() {
        return play.mvc.Controller.ok(Json.toJson(barService.getAll()));
    }
    
    public static Result oAuthDenied(final String providerKey) {
   /*     flash(FLASH_ERROR_KEY,
                "You need to accept the OAuth connection in order to use this website!");
        return redirect(routes.Application.index());
    */
    	return null;
    }
    
}