package controllers;


import models.Client;

import org.springframework.beans.factory.annotation.Autowired;

import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import services.ClientBO;
import views.html.*;

@org.springframework.stereotype.Controller
public class ClientApplication {

    @Autowired
    private ClientBO clientService;
 
    public Result index() {
        return play.mvc.Controller.ok(client.render(Form.form(Client.class)));
    }

    public Result addClient() {
        Form<Client> form = Form.form(Client.class).bindFromRequest();
        Client client = form.get();
        clientService.add(client);
        return list();
    }
    
    public Result show(Long id){
    	return play.mvc.Controller.ok(Json.toJson(clientService.get(id)));
    }


    public Result list() {
        return play.mvc.Controller.ok(Json.toJson(clientService.getAll()));
    }
    
}