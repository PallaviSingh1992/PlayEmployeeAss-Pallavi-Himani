
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashBoard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class dashBoard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Employee],Form[String],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empList:List[Employee],filterForm:Form[(String)])(implicit messages:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.92*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.main("DashBoard")/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<div>
    <span><p>
        """),_display_(/*6.10*/if(flash.get("success"))/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
        """),_display_(/*7.10*/flash/*7.15*/.get("success")),format.raw/*7.30*/("""
        """)))}/*8.11*/else/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
        """),_display_(/*9.10*/flash/*9.15*/.get("error")),format.raw/*9.28*/("""
        """)))}),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</p></span>


    """),_display_(/*14.6*/helper/*14.12*/.form(action=routes.DashBoardController.getByName,'display->"inline")/*14.81*/{_display_(Seq[Any](format.raw/*14.82*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(filterForm("name"),'placeholder->"Filter by Employee name")),format.raw/*15.86*/("""
        """),format.raw/*16.9*/("""<button type="submit" class="btn btn-primary" style="background-color:orange;color:white">Filter by Name</button>
    """)))}),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""<a href="/renderEmployeeForm " class="btn btn-success pull-right" role="button">Add An Employee</a>

     <br><br>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Address</th>
            <th>Date Of Birth</th>
            <th>Joining Date</th>
            <th>Designation</th>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*33.10*/for(empVal<-empList) yield /*33.30*/{_display_(Seq[Any](format.raw/*33.31*/("""
        """),format.raw/*34.9*/("""<tr>
            <td><a href="/editEmployee/"""),_display_(/*35.41*/empVal/*35.47*/.name),format.raw/*35.52*/("""">"""),_display_(/*35.55*/empVal/*35.61*/.name),format.raw/*35.66*/("""</a></td>
            <td>"""),_display_(/*36.18*/empVal/*36.24*/.address),format.raw/*36.32*/("""</td>
            <td>"""),_display_(/*37.18*/empVal/*37.24*/.dob),format.raw/*37.28*/("""</td>
            <td>"""),_display_(/*38.18*/empVal/*38.24*/.doj),format.raw/*38.28*/("""</td>
            <td>"""),_display_(/*39.18*/empVal/*39.24*/.designation),format.raw/*39.36*/("""</td>
        </tr>
        """)))}),format.raw/*41.10*/("""
        """),format.raw/*42.9*/("""</tbody>
    </table>
</div>

""")))}),format.raw/*46.2*/("""



"""))
      }
    }
  }

  def render(empList:List[Employee],filterForm:Form[String],messages:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(empList,filterForm)(messages,flash)

  def f:((List[Employee],Form[String]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (empList,filterForm) => (messages,flash) => apply(empList,filterForm)(messages,flash)

  def ref: this.type = this

}


}

/**/
object dashBoard extends dashBoard_Scope0.dashBoard
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 00:21:53 IST 2016
                  SOURCE: /home/knoldus-pallavi/play2Rough/app/views/dashBoard.scala.html
                  HASH: 7953a7a10830d20032309cd2c7ef3cee8556d72c
                  MATRIX: 571->1|756->91|784->94|796->99|827->122|865->123|892->124|947->153|979->177|1018->179|1054->189|1067->194|1102->209|1130->220|1142->225|1180->226|1216->236|1229->241|1262->254|1303->264|1335->269|1380->288|1395->294|1473->363|1512->364|1549->374|1564->380|1655->450|1691->459|1840->578|1873->584|2297->981|2333->1001|2372->1002|2408->1011|2480->1056|2495->1062|2521->1067|2551->1070|2566->1076|2592->1081|2646->1108|2661->1114|2690->1122|2740->1145|2755->1151|2780->1155|2830->1178|2845->1184|2870->1188|2920->1211|2935->1217|2968->1229|3028->1258|3064->1267|3125->1298
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|35->11|38->14|38->14|38->14|38->14|39->15|39->15|39->15|40->16|41->17|43->19|57->33|57->33|57->33|58->34|59->35|59->35|59->35|59->35|59->35|59->35|60->36|60->36|60->36|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|65->41|66->42|70->46
                  -- GENERATED --
              */
          