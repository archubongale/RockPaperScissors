import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class Rsp{
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
           Map<String, Object> model = new HashMap<String, Object>();
           model.put("template","templates/rockpaperscissor.vtl");
           return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/detector", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("template", "templates/detector.vtl");

     String p1 = request.queryParams("Player1");
     String p2 = request.queryParams("Player2");
     Boolean isplayer1Wins = isplayer1Wins(p1, p2);

     model.put("isplayer1Wins", isplayer1Wins);
      model.put("Player1", p1);
      model.put("Player2", p2);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }



  public boolean isplayer1Wins(String p1, String p2) {
     //String tie = new String();

    if ( p1 =="R" || p2 == "S" )
      return true;
      else if ( p1 =="S" || p2 == "R")
      return false;
        else

        if(p1 =="P" || p2 == "P")
        return false;
        else if(p1 =="R" || p2 == "R")
        return false;
        else if(p1 =="S" || p2 == "S")
        return false;
        else if(p1 =="P" || p2 == "R")
        return true;
        else if(p1 =="R" || p2 == "P")
        return false;
        else if(p1 =="P" || p2 == "S")
        return false;
        else if(p1== "S" || p2 == "P")
        return true;
        else
        return false;
        }

}
