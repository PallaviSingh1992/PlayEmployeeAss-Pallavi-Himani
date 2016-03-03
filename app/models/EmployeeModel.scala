package models

import java.text.{SimpleDateFormat, DateFormat}
import java.util.Date
import com.google.inject.ImplementedBy
import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


case class Employee(name:String,address:String,dob:Date,doj:Date,designation:String)

/**
  *  Trait Employee Model defines a set of Functionality for Employess
  */
@ImplementedBy(classOf[EmployeeService])
trait EmployeeModel {

  def getAllEmployee:Future[ListBuffer[Employee]]
  def getEmployeeName(ename:String):Future[ListBuffer[Employee]]
  def addEmployee(ename:String,eaddress:String,edob:Date,edoj:Date,edesig:String):Future[Boolean]
  def deleteEmployee(ename:String):Boolean
  def updateEmployee(ename:String,eaddress:String,edob:Date,edoj:Date,edesig:String):Boolean

}

/**
    Class implementing EmployeeModel
 */
class EmployeeService extends EmployeeModel{

//  val empList:ListBuffer[Employee]=ListBuffer(Employee("Pallavi","Ashok Vihar",new Date(1992-3-9),new Date(2016-3-9),"Manager"))
val empList:ListBuffer[Employee]=ListBuffer(Employee("Seema","Ashok Vihar",new SimpleDateFormat("yyyy-MMM-dd").parse("1992-Mar-09"),new SimpleDateFormat("yyyy-MMM-dd").parse("2016-Jan-21"),"Software Consultant"),Employee("Himani ","Lakshmi Nagar",new SimpleDateFormat("yyyy-MMM-dd").parse("1992-May-09"),new SimpleDateFormat("yyyy-MMM-dd").parse("2016-Jan-21"),"Software Consultant"),Employee("Pallavi","Ashok Vihar",new SimpleDateFormat("yyyy-MMM-dd").parse("1992-Mar-09"),new SimpleDateFormat("yyyy-MMM-dd").parse("2016-Jan-21"),"Software Consultant"))

  /**
    * Function to get list of all employees
    * @return:List of Employees
    */
  def getAllEmployee:Future[ListBuffer[Employee]]=Future{
    empList
  }

  /**
    * Function to return Employee searched by Name
    * @param ename
    * @return list of single or multiple Employees with same name
    */
  def getEmployeeName(ename:String):Future[ListBuffer[Employee]]=Future{
    empList.filter(emp=>emp.name==ename)
  }

  /**
    * Function to add a new Employee
    * @param ename
    * @param eaddress
    * @param edob
    * @param edoj
    * @param edesig
    * @return
    */

  def addEmployee(ename:String,eaddress:String,edob:Date,edoj:Date,edesig:String):Future[Boolean] =Future {
    empList.append(Employee(ename,eaddress,edob,edoj,edesig))
    true
  }

  /**
    * Function to delete an Employee
    * @param ename
    * @return
    */
  def deleteEmployee(ename:String):Boolean={
    if(empList.map(_.name).contains(ename)) {
      //println(""+ename+eaddress+edob)
      empList.remove(empList.map(_.name).indexOf(ename))
      true
    }
    false
  }

  /**
    * Function to update an existing Employee records
    * @param ename
    * @param eaddress
    * @param edob
    * @param edoj
    * @param edesig
    * @return
    */
  def updateEmployee(ename:String,eaddress:String,edob:Date,edoj:Date,edesig:String):Boolean={
   // println(""+ename+eaddress+edob)
    if(empList.map(_.name).contains(ename)) {
  //println(""+ename+eaddress+edob)
      empList.update(empList.map(_.name).indexOf(ename),Employee(ename,eaddress,edob,edoj,edesig))
      true
    }
   false
  }


}
