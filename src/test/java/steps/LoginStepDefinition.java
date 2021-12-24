package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LogIn_page;
import page.TestPage;


public class LoginStepDefinition extends TestPage {
	
	LogIn_page loginpage;

	
	@Before
	public void beforeRun() {
		init();
		 loginpage = PageFactory.initElements(driver,LogIn_page.class );
		 
	}
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User put username as \"([^\"]*)\"$")
	public void user_put_username_as(String username) throws Throwable {
	   
	    loginpage.insertUSER_NAME(username);
	}

	@When("^User put password as \"([^\"]*)\"$")
	public void user_put_password_as(String password) throws Throwable {
	  loginpage.insertPASSWORD(password);
	}

	@And("^User click of signin button$")
	public void user_click_of_signin_button() throws Throwable {
	    loginpage.clikLOGIN();
	}

	@Then("^User should be on dashboard page$")
	public void user_should_be_on_dashboard_page() throws Throwable {
	 String actualpage = loginpage.PageTitle();
	 String expectedpage = "Dashboard- iBilling";
	  Assert.assertEquals("Wrong page",expectedpage , actualpage);
	  takeScreenShot(driver);
	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
		
	
}
