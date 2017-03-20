package controllers;

import play.*;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.mvc.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void consumidor(){
    	HttpResponse r = WS.url("https://www.reddit.com/new.json").get();
        JsonElement json = r.getJson();
        render(json);
    }

}