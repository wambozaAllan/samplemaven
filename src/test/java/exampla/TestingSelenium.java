package exampla;
		
import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TestingSelenium {
	 //private WebDriver driver;	
  @Test
  public void f() {
	    //driver.get("http://demo.guru99.com/test/guru99home/");  
		//String title = driver.getTitle();				 
		//AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 
	  System.out.println("Testing started...");
	  Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println("API call done...");
	  System.out.println(response.statusCode());
	  System.out.println(response.asString());
	  System.out.println(response.getBody().asString());
	  System.out.println(response.statusLine());

	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode, 200);
  }
  @BeforeTest
  public void beforeTest() {
	  //driver = new FirefoxDriver(); 
	  System.out.println("Before testing...");
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
	  System.out.println("Testing done...");
  }
  

}
