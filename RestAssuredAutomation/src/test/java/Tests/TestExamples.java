package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class TestExamples
{

    @Test
	public void test1_()
{
		 
	     Response response=get("https://reqres.in/api/users?page=2");
	     
	     System.out.println("response.getStatusCode()");
	     System.out.println("response.getTime()");
	     System.out.println("respose.getBody().asString()");
	     System.out.println("response.getStatusLine()");
	     System.out.println(response.getHeader("content-type"));
	     
	     
	     int statusCode=response.getStatusCode();
	    		 
	     Assert.assertEquals(statusCode,200);
	     
	  }
	
    
    @Test
    public void test2_()
    {  
    	baseURI="https://reqres.in/api";
    	
      given().
             get("/users?page=2").
      then().
          statusCode(200);
    	
    }


	private void statusCode(int i) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
