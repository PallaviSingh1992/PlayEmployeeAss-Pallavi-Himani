
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus-pallavi/play2Rough/conf/routes
// @DATE:Fri Mar 04 00:21:52 IST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDashBoardController DashBoardController = new controllers.ReverseDashBoardController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDashBoardController DashBoardController = new controllers.javascript.ReverseDashBoardController(RoutesPrefix.byNamePrefix());
  }

}
