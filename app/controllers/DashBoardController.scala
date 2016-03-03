package controllers

import java.text.SimpleDateFormat

import com.google.inject.Inject
import models.EmployeeModel
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.i18n.Messages.Implicits._
import play.api.Play.current
import java.util.Date


import scala.concurrent.Future

/**
  * Defined a case class for Form mapping with following parameters:
  * @param name: Employee name
  * @param address:Employee address
  * @param dob:Date of Birth
  * @param doj:Date of Joing
  * @param designation: Postion held in the organization
  */
case class AddEmployee(name:String,address:String,dob:Date,doj:Date,designation:String)

/**
  * Class contains the group of Controllers and Form Mapping for the Employee
  * @param emp: Dependency Injected using Google Guice
  */
class DashBoardController @Inject()(emp: EmployeeModel) extends Controller{

  /**
    * Form Mapping for a form used for deletion and updation
    */
  val filterForm=Form(
    single(
      "name"->text
    )
  )

  /**
    * Mapping of Employee Data of Case Class AddEmployee to UI
    */
  val addForm=Form(
    mapping (
      "name"->nonEmptyText,
      "address"->nonEmptyText,
      "dob"->date,
      "doj"->date,
      "designation"->nonEmptyText
    )(AddEmployee.apply)(AddEmployee.unapply)
  )

  /**
    * Action for displaying the Dashboard populated with the list of Employeed
    * @return
    */
  def getList=Action.async{implicit request=>
    val list=emp.getAllEmployee
    list.map{values=>Ok(views.html.dashBoard(values.toList,filterForm))}

  }

  /**
    * Action for filtering the Employees on basis of their Names and displaying the Result,
    *
    * @return on Success redirected to DashBoard else Dashboard
    */

  def getByName=Action.async{implicit request=>
    filterForm.bindFromRequest.fold(
      fomWithErrors=>{
        Future {
          Redirect(routes.DashBoardController.getList).flashing("error"->"Unsuccessfull !")
        }
      },
      formData=>{
          val nameOfEmp=emp.getEmployeeName(formData)
          nameOfEmp.map{values=>Ok(views.html.dashBoard(values.toList,filterForm))}
      }
    )

}
  /**
    * Action to Render an empty Employee form
   */
   def renderEmployeeForm=Action{implicit request=>
     Ok(views.html.addEmployeeView(addForm))
   }

  /**
    * Action to Add Employee
    * @return On success redirected to dashboard, else redirected back on Add Employee
    */

   def addEmp=Action.async{implicit request=>
     addForm.bindFromRequest.fold(
       formWithErrors=>{
         Future{
           Redirect(routes.DashBoardController.renderEmployeeForm)
         }
       },
       formData=>{
         val nameOfEmp=emp.addEmployee(formData.name,formData.address,formData.dob,formData.doj,formData.designation)
         nameOfEmp.map{values=>Redirect(routes.DashBoardController.getList)}
       }
     )

   }
  /**
    * Action to Update Employee
    * @return On success redirected to dashboard, else redirected back on Dashboard
    */


  def updateEmp=Action{implicit request=>
    addForm.bindFromRequest.fold(
      Errors=>{
        Redirect(routes.DashBoardController.getList)
      },
      userData=>{
        emp.updateEmployee(userData.name,userData.address,userData.dob,userData.doj,userData.designation)
        Redirect(routes.DashBoardController.getList)
       // Ok(views.html.dashBoard(userData,addForm))
      }
    )

  }
  /**
    * Action to Populate Edit Employee Form with pre-filled-Data
    * @return
    */

  def editEmployee(name:String)=Action.async{
    val nameOfEmp=emp.getEmployeeName(name)
    nameOfEmp.map{values=>
      val empp = values.head
      val v = AddEmployee(empp.name,empp.address, empp.dob, empp.doj, empp.designation)
      Ok(views.html.editEmployeeView(addForm.fill(v)))
    }

  }
  /**
    * Action to Delete Employee
    * @return On success redirected to dashboard, else redirected back on Dashboard
    */

  def deleteEmployee=Action{implicit request=>
    val st=request.session.get("name").get
    emp.deleteEmployee(st)
    Redirect(routes.DashBoardController.getList)
  }

}
