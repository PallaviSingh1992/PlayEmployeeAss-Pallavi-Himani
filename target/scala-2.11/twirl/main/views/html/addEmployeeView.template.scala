
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addEmployeeView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object addEmployeeView_Scope1 {
import b3.vertical.fieldConstructor

class addEmployeeView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[AddEmployee],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addForm:Form[AddEmployee])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),_display_(/*4.2*/views/*4.7*/.html.main("Add Employee")/*4.33*/{_display_(Seq[Any](format.raw/*4.34*/("""
"""),format.raw/*5.1*/("""<div>
    """),_display_(/*6.6*/b3/*6.8*/.form(routes.DashBoardController.addEmp)/*6.48*/{_display_(Seq[Any](format.raw/*6.49*/("""
    """),_display_(/*7.6*/b3/*7.8*/.text( addForm("name"), '_label -> "Name ", 'required->true )),format.raw/*7.69*/("""
    """),_display_(/*8.6*/b3/*8.8*/.text( addForm("address"), '_label -> "Address", 'required->true )),format.raw/*8.74*/("""
    """),_display_(/*9.6*/b3/*9.8*/.date(addForm("dob"),'_label -> "Date OF Birth", 'required->true)),format.raw/*9.73*/("""
    """),_display_(/*10.6*/b3/*10.8*/.date(addForm("doj"),'_label -> "Joining Date", 'required->true)),format.raw/*10.72*/("""
    """),_display_(/*11.6*/b3/*11.8*/.text( addForm("designation"), '_label -> "Designation", 'required->true )),format.raw/*11.82*/("""
    """),_display_(/*12.6*/b3/*12.8*/.submit('class -> "btn btn-success" )/*12.45*/{_display_(Seq[Any](format.raw/*12.46*/(""" """),format.raw/*12.47*/("""Create Employee """)))}),format.raw/*12.64*/("""

    """)))}),format.raw/*14.6*/("""


"""),format.raw/*17.1*/("""</div>




""")))}),format.raw/*22.2*/("""
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
object addEmployeeView extends addEmployeeView_Scope0.addEmployeeView_Scope1.addEmployeeView
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 00:21:53 IST 2016
                  SOURCE: /home/knoldus-pallavi/play2Rough/app/views/addEmployeeView.scala.html
                  HASH: 0657b7fb90d2c8145ffe0a569c85f3a7941dd05e
                  MATRIX: 641->38|791->93|819->96|831->101|865->127|903->128|930->129|966->140|975->142|1023->182|1061->183|1092->189|1101->191|1182->252|1213->258|1222->260|1308->326|1339->332|1348->334|1433->399|1465->405|1475->407|1560->471|1592->477|1602->479|1697->553|1729->559|1739->561|1785->598|1824->599|1853->600|1901->617|1938->624|1968->627|2010->639
                  LINES: 23->2|28->2|30->4|30->4|30->4|30->4|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|38->12|38->12|38->12|40->14|43->17|48->22
                  -- GENERATED --
              */
          