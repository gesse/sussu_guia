// @SOURCE:C:/Users/Gesse/git/sussu_guia/conf/routes
// @HASH:43f41663f47f8393d14d5eb9ab795bb5f330c5aa
// @DATE:Mon Oct 14 23:13:18 BRT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:7
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:8
private[this] lazy val controllers_Application_oAuthDenied2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
        

// @LINE:11
private[this] lazy val controllers_Application_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Application_listBars4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bars"))))
        

// @LINE:13
private[this] lazy val controllers_Application_addBar5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bars"))))
        

// @LINE:16
private[this] lazy val controllers_CarApplication_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("carsIndex"))))
        

// @LINE:17
private[this] lazy val controllers_CarApplication_listCars7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cars"))))
        

// @LINE:18
private[this] lazy val controllers_CarApplication_addCar8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cars"))))
        

// @LINE:21
private[this] lazy val controllers_ClientApplication_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clients"))))
        

// @LINE:22
private[this] lazy val controllers_ClientApplication_show10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clients/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_ClientApplication_addClient11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clients"))))
        

// @LINE:26
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Application.oAuthDenied(provider:String)"""),("""GET""", prefix,"""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bars""","""@controllers.Application@.listBars"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bars""","""@controllers.Application@.addBar"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """carsIndex""","""@controllers.CarApplication@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cars""","""@controllers.CarApplication@.listCars"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cars""","""@controllers.CarApplication@.addCar"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clients""","""@controllers.ClientApplication@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clients/$id<[^/]+>""","""@controllers.ClientApplication@.show(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clients""","""@controllers.ClientApplication@.addClient"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case com_feth_play_module_pa_controllers_Authenticate_logout0(params) => {
   call { 
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:7
case com_feth_play_module_pa_controllers_Authenticate_authenticate1(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:8
case controllers_Application_oAuthDenied2(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Application.oAuthDenied(provider), HandlerDef(this, "controllers.Application", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
   }
}
        

// @LINE:11
case controllers_Application_index3(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Application_listBars4(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).listBars, HandlerDef(this, "controllers.Application", "listBars", Nil,"GET", """""", Routes.prefix + """bars"""))
   }
}
        

// @LINE:13
case controllers_Application_addBar5(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addBar, HandlerDef(this, "controllers.Application", "addBar", Nil,"POST", """""", Routes.prefix + """bars"""))
   }
}
        

// @LINE:16
case controllers_CarApplication_index6(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).index, HandlerDef(this, "controllers.CarApplication", "index", Nil,"GET", """ Car Application""", Routes.prefix + """carsIndex"""))
   }
}
        

// @LINE:17
case controllers_CarApplication_listCars7(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).listCars, HandlerDef(this, "controllers.CarApplication", "listCars", Nil,"GET", """""", Routes.prefix + """cars"""))
   }
}
        

// @LINE:18
case controllers_CarApplication_addCar8(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).addCar, HandlerDef(this, "controllers.CarApplication", "addCar", Nil,"POST", """""", Routes.prefix + """cars"""))
   }
}
        

// @LINE:21
case controllers_ClientApplication_index9(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).index, HandlerDef(this, "controllers.ClientApplication", "index", Nil,"GET", """ Car Application""", Routes.prefix + """clients"""))
   }
}
        

// @LINE:22
case controllers_ClientApplication_show10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).show(id), HandlerDef(this, "controllers.ClientApplication", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """clients/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_ClientApplication_addClient11(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).addClient, HandlerDef(this, "controllers.ClientApplication", "addClient", Nil,"POST", """""", Routes.prefix + """clients"""))
   }
}
        

// @LINE:26
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     