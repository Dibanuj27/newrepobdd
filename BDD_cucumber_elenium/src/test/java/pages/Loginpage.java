package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;
    
    public static String url = "https://opensource-demo.orangehrmlive.com/";
    
    @FindBy(name="txtUsername") WebElement name;
    @FindBy(name="txtPassword") WebElement pass;
    @FindBy(name="Submit") WebElement submit;
   
    public Loginpage(WebDriver driver){

    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void enterUsername(String username) {
        name.sendKeys(username);
    }
    
    public void enterPassword(String password) {
        pass.sendKeys(password);
    }
    
    public void submitClick() {
        submit.click();
    }
}

//plugin = { "pretty", "html:target/HtmlReports"})

//plugin = { "pretty", "json:target/reportjson/cucumber.json"})
//plugin = { "pretty",  "junit:target/reportxml/report.xml"})