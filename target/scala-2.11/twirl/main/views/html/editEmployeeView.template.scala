
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editEmployeeView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object editEmployeeView_Scope1 {
import b3.vertical.fieldConstructor

class editEmployeeView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[AddEmployee],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addForm:Form[AddEmployee])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),_display_(/*4.2*/views/*4.7*/.html.main("Edit Employee")/*4.34*/{_display_(Seq[Any](format.raw/*4.35*/("""
"""),format.raw/*5.1*/("""<div>
    <span><h3>Edit Employee</h3>
          <!--<a href="/renderEmployeeForm " class="btn btn-danger pull-right" role="button">Delete Employee</a>-->
    </span>


    """),_display_(/*11.6*/b3/*11.8*/.form(routes.DashBoardController.updateEmp)/*11.51*/{_display_(Seq[Any](format.raw/*11.52*/("""
    """),_display_(/*12.6*/b3/*12.8*/.submit('class -> "btn btn-success pull-right" ,'value->"remove")/*12.73*/{_display_(Seq[Any](format.raw/*12.74*/(""" """),format.raw/*12.75*/("""Delete Employee """)))}),format.raw/*12.92*/("""
    """),_display_(/*13.6*/b3/*13.8*/.text( addForm("name"), '_label -> "Name ", 'required->true ,'disabled->true )),format.raw/*13.86*/("""
    """),_display_(/*14.6*/b3/*14.8*/.text( addForm("address"), '_label -> "Address", 'required->true )),format.raw/*14.74*/("""
    """),_display_(/*15.6*/b3/*15.8*/.date(addForm("dob"),'_label -> "Date OF Birth", 'required->true)),format.raw/*15.73*/("""
    """),_display_(/*16.6*/b3/*16.8*/.date(addForm("doj"),'_label -> "Joining Date", 'required->true)),format.raw/*16.72*/("""
    """),_display_(/*17.6*/b3/*17.8*/.text( addForm("designation"), '_label -> "Designation", 'required->true )),format.raw/*17.82*/("""
    """),_display_(/*18.6*/b3/*18.8*/.submit('class -> "btn btn-success", 'value->"update")/*18.62*/{_display_(Seq[Any](format.raw/*18.63*/(""" """),format.raw/*18.64*/("""Update Employee """)))}),format.raw/*18.81*/("""


    """)))}),format.raw/*21.6*/("""


"""),format.raw/*24.1*/("""</div>




""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(addForm:Form[AddEmployee],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(addForm)(messages)

  def f:((Form[AddEmployee]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (addForm) => (messages) => apply(addForm)(messages)

  def ref: this.type = this

}


}
}

/**/
object editEmployeeView extends editEmployeeView_Scope0.editEmployeeView_Scope1.editEmployeeView
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 00:21:53 IST 2016
                  SOURCE: /home/knoldus-pallavi/play2Rough/app/views/editEmployeeView.scala.html
                  HASH: 206c26fdc97c4bf016596a109374edc81d5ed8d7
                  MATRIX: 644->38|794->93|822->96|834->101|869->128|907->129|934->130|1134->304|1144->306|1196->349|1235->350|1267->356|1277->358|1351->423|1390->424|1419->425|1467->442|1499->448|1509->450|1608->528|1640->534|1650->536|1737->602|1769->608|1779->610|1865->675|1897->681|1907->683|1992->747|2024->753|2034->755|2129->829|2161->835|2171->837|2234->891|2273->892|2302->893|2350->910|2388->918|2418->921|2460->933
                  LINES: 23->2|28->2|30->4|30->4|30->4|30->4|31->5|37->11|37->11|37->11|37->11|38->12|38->12|38->12|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|43->17|43->17|43->17|44->18|44->18|44->18|44->18|44->18|44->18|47->21|50->24|55->29
                  -- GENERATED --
              */
          