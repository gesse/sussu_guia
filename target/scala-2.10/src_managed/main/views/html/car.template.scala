
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object car extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Car],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: play.data.Form[Car]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.0", "")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

    <script src=""""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("javascripts/index.min.js"))),format.raw/*5.63*/("""" type="text/javascript"></script>

    <ul id="cars"></ul>

    """),_display_(Seq[Any](/*9.6*/helper/*9.12*/.form(action = routes.CarApplication.addCar)/*9.56*/ {_display_(Seq[Any](format.raw/*9.58*/("""
        """),_display_(Seq[Any](/*10.10*/helper/*10.16*/.inputText(form("name")))),format.raw/*10.40*/("""
        <input type="submit"/>
    """)))})),format.raw/*12.6*/("""

""")))})))}
    }
    
    def render(form:play.data.Form[Car]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((play.data.Form[Car]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 14 23:13:20 BRT 2013
                    SOURCE: C:/Users/Gesse/git/sussu_guia/app/views/car.scala.html
                    HASH: 2a71ad559e817bef2e804ab08da77da9f6ca2b30
                    MATRIX: 785->1|906->28|945->33|984->64|1023->66|1080->88|1094->94|1153->132|1257->202|1271->208|1323->252|1362->254|1409->265|1424->271|1470->295|1540->334
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|37->9|37->9|37->9|37->9|38->10|38->10|38->10|40->12
                    -- GENERATED --
                */
            