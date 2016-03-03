
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus-pallavi/play2Rough/conf/routes
// @DATE:Fri Mar 04 00:21:52 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  DashBoardController_1: controllers.DashBoardController,
  // @LINE:15
  Assets_2: controllers.Assets,
  // @LINE:16
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    DashBoardController_1: controllers.DashBoardController,
    // @LINE:15
    Assets_2: controllers.Assets,
    // @LINE:16
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, DashBoardController_1, Assets_2, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, DashBoardController_1, Assets_2, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.DashBoardController.getList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getByName""", """controllers.DashBoardController.getByName"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """renderEmployeeForm""", """controllers.DashBoardController.renderEmployeeForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmp""", """controllers.DashBoardController.addEmp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editEmployee/$name<[^/]+>""", """controllers.DashBoardController.editEmployee(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getEmp""", """controllers.DashBoardController.updateEmp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEmp""", """controllers.DashBoardController.deleteEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_DashBoardController_getList0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_DashBoardController_getList0_invoker = createInvoker(
    DashBoardController_1.getList,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "getList",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_DashBoardController_getByName1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getByName")))
  )
  private[this] lazy val controllers_DashBoardController_getByName1_invoker = createInvoker(
    DashBoardController_1.getByName,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "getByName",
      Nil,
      "GET",
      """""",
      this.prefix + """getByName"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DashBoardController_renderEmployeeForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("renderEmployeeForm")))
  )
  private[this] lazy val controllers_DashBoardController_renderEmployeeForm2_invoker = createInvoker(
    DashBoardController_1.renderEmployeeForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "renderEmployeeForm",
      Nil,
      "GET",
      """""",
      this.prefix + """renderEmployeeForm"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_DashBoardController_addEmp3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmp")))
  )
  private[this] lazy val controllers_DashBoardController_addEmp3_invoker = createInvoker(
    DashBoardController_1.addEmp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "addEmp",
      Nil,
      "POST",
      """""",
      this.prefix + """addEmp"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DashBoardController_editEmployee4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editEmployee/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DashBoardController_editEmployee4_invoker = createInvoker(
    DashBoardController_1.editEmployee(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "editEmployee",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """editEmployee/$name<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_DashBoardController_updateEmp5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getEmp")))
  )
  private[this] lazy val controllers_DashBoardController_updateEmp5_invoker = createInvoker(
    DashBoardController_1.updateEmp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "updateEmp",
      Nil,
      "POST",
      """""",
      this.prefix + """getEmp"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DashBoardController_deleteEmployee6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEmp")))
  )
  private[this] lazy val controllers_DashBoardController_deleteEmployee6_invoker = createInvoker(
    DashBoardController_1.deleteEmployee,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashBoardController",
      "deleteEmployee",
      Nil,
      "GET",
      """""",
      this.prefix + """deleteEmp"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_WebJarAssets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at8_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_DashBoardController_getList0_route(params) =>
      call { 
        controllers_DashBoardController_getList0_invoker.call(DashBoardController_1.getList)
      }
  
    // @LINE:7
    case controllers_DashBoardController_getByName1_route(params) =>
      call { 
        controllers_DashBoardController_getByName1_invoker.call(DashBoardController_1.getByName)
      }
  
    // @LINE:8
    case controllers_DashBoardController_renderEmployeeForm2_route(params) =>
      call { 
        controllers_DashBoardController_renderEmployeeForm2_invoker.call(DashBoardController_1.renderEmployeeForm)
      }
  
    // @LINE:9
    case controllers_DashBoardController_addEmp3_route(params) =>
      call { 
        controllers_DashBoardController_addEmp3_invoker.call(DashBoardController_1.addEmp)
      }
  
    // @LINE:10
    case controllers_DashBoardController_editEmployee4_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_DashBoardController_editEmployee4_invoker.call(DashBoardController_1.editEmployee(name))
      }
  
    // @LINE:11
    case controllers_DashBoardController_updateEmp5_route(params) =>
      call { 
        controllers_DashBoardController_updateEmp5_invoker.call(DashBoardController_1.updateEmp)
      }
  
    // @LINE:12
    case controllers_DashBoardController_deleteEmployee6_route(params) =>
      call { 
        controllers_DashBoardController_deleteEmployee6_invoker.call(DashBoardController_1.deleteEmployee)
      }
  
    // @LINE:15
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_WebJarAssets_at8_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at8_invoker.call(WebJarAssets_0.at(file))
      }
  }
}