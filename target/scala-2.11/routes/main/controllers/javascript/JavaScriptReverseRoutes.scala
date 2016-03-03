
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus-pallavi/play2Rough/conf/routes
// @DATE:Fri Mar 04 00:21:52 IST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:16
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseDashBoardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def getByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.getByName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getByName"})
        }
      """
    )
  
    // @LINE:8
    def renderEmployeeForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.renderEmployeeForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "renderEmployeeForm"})
        }
      """
    )
  
    // @LINE:9
    def addEmp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.addEmp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEmp"})
        }
      """
    )
  
    // @LINE:11
    def updateEmp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.updateEmp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getEmp"})
        }
      """
    )
  
    // @LINE:10
    def editEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.editEmployee",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editEmployee/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:12
    def deleteEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.deleteEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteEmp"})
        }
      """
    )
  
    // @LINE:6
    def getList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashBoardController.getList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}