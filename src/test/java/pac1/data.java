package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class data {
	
		
		static
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		@Given("user is on the login page")
		public void user_is_on_the_login_page() {
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
		}

		@When("user enters {string} and {string} and click on submit")
		public void user_enters_and_and_click_on_submit(String string, String string2) {
			driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
			WebElement un=driver.findElement(By.name("userName"));
			//un.click();
			un.sendKeys(string);
			WebElement pwd=driver.findElement(By.name("password"));
			//pwd.click();
			pwd.sendKeys(string2);
			WebElement log=driver.findElement(By.name("Login"));
			log.click();
			
			
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

		@Then("user does the login page")
		public void user_does_the_login_page() {
			System.out.println("error msg");
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}
	}



