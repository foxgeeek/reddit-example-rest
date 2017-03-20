package controllers;

import play.*;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.mvc.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void consumidor(){
    	HttpResponse res = WS.url("https://www.reddit.com/new.json").get();
        
        int status = res.getStatus();
        String contentType = res.getContentType();
        
        JsonElement json = res.getJson();
        
        render(status, contentType, json);
    }
}