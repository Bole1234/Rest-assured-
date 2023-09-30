package Tests;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GETAndPOSTExamples 
{
  //  @Test
	public void testGet()
	{
    	String baseURI = "https://reqres.in/api";
    	
         given().
    	 get("/users?page=2").
    	
    	 then().
    	 statusCode(200).
    	 body("data[3].first_name",equalTo("Byron")).
         body("data.first_name",hasItems("Byron","George"));    	
    		
	}
     
	
	@Test
      public void testPost()
      {
    	  
    	Map<String,Object>map=new HashMap<String,Object>();
    	
   // 	map.put("name","Dnyaneshwar");
   // 	map.put("Job","Teacher");
    	  
    //	 System.out.println(map); 
    	  
    	 JSONObject request=new JSONObject(map);
    	 
    	 request.put("name","Dnyaneshwar");
    	 request.put("Job","Teacher");
    	 
    	 String baseURI = "https://reqres.in/api";
    	 
    	 given().
    	 header("Content-Type","applicaton/json").
    	 contentType(ContentType.JSON).
    	 accept(ContentType.JSON).
    	 body(request.toJSONString()).
    	 
    	 when().
    	 post("/users").
    	 
    	 then().
    	 statusCode(201).
    	  log().all();
      }


	}
    
    
