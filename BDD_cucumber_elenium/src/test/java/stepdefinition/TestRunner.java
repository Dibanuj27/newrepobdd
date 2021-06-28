package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pages.Loginpage;

public class TestRunner {
	
	WebDriver driver=null;
	Loginpage login;

	@Given("browser is open")
	public void browser_is_open() {
	    
		System.out.println("Browser is opened");
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}

	@Given("user is on the Login Page")
	public void user_is_on_the_login_page() {
	    
		driver.get(Loginpage.url);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_admin_and_admin123(String username,String password) throws InterruptedException {
	    
		login=new Loginpage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
		
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    
		login.submitClick();
	}

	@Then("user is navigated to the HomePage")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    
		Thread.sleep(3000);
		driver.close();
	}
	
}
