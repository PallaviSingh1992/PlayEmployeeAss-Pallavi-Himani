
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
         <link rel='stylesheet' href='"""),_display_(/*11.40*/routes/*11.46*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*11.108*/("""'>
        <script type='text/javascript' src='"""),_display_(/*12.46*/routes/*12.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*12.106*/("""'></script>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

    </head>
    <body>

        <div class="jumbotron" style="background-color:#660066;color:white;height:5%;width:100%">
            <div class="container-fluid">
            <h2>PlayFrameWork Assignment</h2>
            </div>
        </div><!--Closing of Jumbotron-->
        <div class="container">
            <div class="panel panel-default">
                <div class="panel-body">
                    """),_display_(/*27.22*/content),format.raw/*27.29*/("""
                """),format.raw/*28.17*/("""</div>
                <div class="panel-footer">created by Himani Arora and Pallavi Singh</div>
            </div>

        </div>



    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 00:21:53 IST 2016
                  SOURCE: /home/knoldus-pallavi/play2Rough/app/views/main.scala.html
                  HASH: cfad5c3db7cf7b500483373e3358c6604d94fab6
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1046->269|1060->275|1120->314|1172->339|1187->345|1249->386|1350->460|1365->466|1449->528|1524->576|1539->582|1615->636|2238->1232|2266->1239|2311->1256
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|51->27|51->27|52->28
                  -- GENERATED --
              */
          