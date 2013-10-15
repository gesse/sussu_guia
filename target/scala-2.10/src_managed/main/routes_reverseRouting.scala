// @SOURCE:C:/Users/Gesse/git/sussu_guia/conf/routes
// @HASH:43f41663f47f8393d14d5eb9ab795bb5f330c5aa
// @DATE:Mon Oct 14 23:13:18 BRT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:7
// @LINE:6
package com.feth.play.module.pa.controllers {

// @LINE:7
// @LINE:6
class ReverseAuthenticate {
    

// @LINE:6
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:7
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
package controllers {

// @LINE:23
// @LINE:22
// @LINE:21
class ReverseClientApplication {
    

// @LINE:21
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clients")
}
                                                

// @LINE:23
def addClient(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "clients")
}
                                                

// @LINE:22
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clients/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCarApplication {
    

// @LINE:18
def addCar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cars")
}
                                                

// @LINE:16
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "carsIndex")
}
                                                

// @LINE:17
def listCars(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cars")
}
                                                
    
}
                          

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
class ReverseApplication {
    

// @LINE:8
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:13
def addBar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "bars")
}
                                                

// @LINE:12
def listBars(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bars")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:7
// @LINE:6
package com.feth.play.module.pa.controllers.javascript {

// @LINE:7
// @LINE:6
class ReverseAuthenticate {
    

// @LINE:6
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:7
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
package controllers.javascript {

// @LINE:23
// @LINE:22
// @LINE:21
class ReverseClientApplication {
    

// @LINE:21
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clients"})
      }
   """
)
                        

// @LINE:23
def addClient : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientApplication.addClient",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clients"})
      }
   """
)
                        

// @LINE:22
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientApplication.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCarApplication {
    

// @LINE:18
def addCar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarApplication.addCar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cars"})
      }
   """
)
                        

// @LINE:16
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carsIndex"})
      }
   """
)
                        

// @LINE:17
def listCars : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarApplication.listCars",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cars"})
      }
   """
)
                        
    
}
              

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
class ReverseApplication {
    

// @LINE:8
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:13
def addBar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addBar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bars"})
      }
   """
)
                        

// @LINE:12
def listBars : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listBars",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bars"})
      }
   """
)
                        

// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:7
// @LINE:6
package com.feth.play.module.pa.controllers.ref {


// @LINE:7
// @LINE:6
class ReverseAuthenticate {
    

// @LINE:6
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:7
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
package controllers.ref {


// @LINE:23
// @LINE:22
// @LINE:21
class ReverseClientApplication {
    

// @LINE:21
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).index(), HandlerDef(this, "controllers.ClientApplication", "index", Seq(), "GET", """ Car Application""", _prefix + """clients""")
)
                      

// @LINE:23
def addClient(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).addClient(), HandlerDef(this, "controllers.ClientApplication", "addClient", Seq(), "POST", """""", _prefix + """clients""")
)
                      

// @LINE:22
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientApplication]).show(id), HandlerDef(this, "controllers.ClientApplication", "show", Seq(classOf[Long]), "GET", """""", _prefix + """clients/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCarApplication {
    

// @LINE:18
def addCar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).addCar(), HandlerDef(this, "controllers.CarApplication", "addCar", Seq(), "POST", """""", _prefix + """cars""")
)
                      

// @LINE:16
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).index(), HandlerDef(this, "controllers.CarApplication", "index", Seq(), "GET", """ Car Application""", _prefix + """carsIndex""")
)
                      

// @LINE:17
def listCars(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CarApplication]).listCars(), HandlerDef(this, "controllers.CarApplication", "listCars", Seq(), "GET", """""", _prefix + """cars""")
)
                      
    
}
                          

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
class ReverseApplication {
    

// @LINE:8
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.oAuthDenied(provider), HandlerDef(this, "controllers.Application", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:13
def addBar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addBar(), HandlerDef(this, "controllers.Application", "addBar", Seq(), "POST", """""", _prefix + """bars""")
)
                      

// @LINE:12
def listBars(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).listBars(), HandlerDef(this, "controllers.Application", "listBars", Seq(), "GET", """""", _prefix + """bars""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    