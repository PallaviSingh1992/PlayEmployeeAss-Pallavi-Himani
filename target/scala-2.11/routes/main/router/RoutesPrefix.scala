
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus-pallavi/play2Rough/conf/routes
// @DATE:Fri Mar 04 00:21:52 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
