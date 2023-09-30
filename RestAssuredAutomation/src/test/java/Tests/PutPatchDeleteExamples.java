package Tests;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteExamples
{

	@Test
    public void testPut()
    {
  	  
  		
  	 JSONObject request=new JSONObject();
  	 
  	 request.put("name","Dnyaneshwar");
  	 request.put("Job","Teacher");
  	 
  	 String baseURI = "https://reqres.in/api";
  	 
  	 given().
  	 header("Content-Type","applicaton/json").
  	 contentType(ContentType.JSON).
  	 accept(ContentType.JSON).
  	 body(request.toJSONString()).
  	 
  	 when().
  	 put("/users/2").
  	 
  	 then().
  	 statusCode(201).
  	  log().all();
    }

///////////////////////////////////////////////////////////////////	
	
	@Test
    public void testPatch()
    {
  	  
  		
  	 JSONObject request=new JSONObject();
  	 
  	 request.put("name","Dnyaneshwar");
  	 request.put("Job","Teacher");
  	 
  	 String baseURI = "https://reqres.in";
  	 
  	 given().
  	 header("Content-Type","applicaton/json").
  	 contentType(ContentType.JSON).
  	 accept(ContentType.JSON).
  	 body(request.toJSONString()).
  	 
  	 when().
  	 patch("/api/users/2").
  	 
  	 then().
  	 statusCode(201).
  	  log().all();
    }

///////////////////////////////////////////////////////
	
	@Test
    public void testDelete()
    {
  	  
  	 String baseURI = "https://reqres.in";
  	 
  	 
  	 when().
  	 delete("/api/users/2").
  	 
  	 then().
  	 statusCode(204).
  	  log().all();
    }


	}

	
	
	

	

	

