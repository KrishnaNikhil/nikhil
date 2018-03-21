package Test.MVN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Defns {

	Properties p;
	WebDriver driver;
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
	
	
	@Given("^I am on my \"([^\"]*)\" homepage$")
	public void i_am_on_the_Guru_homepage(String URLS) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//List<List<String>> data = URLS.raw();
		//System.out.println(data.get(1).get(0));
		//System.out.println(data.get(0).get(1));
		String URLaddr="";
		//if(data.get(0).get(0).equalsIgnoreCase("Google"))
		if(URLS.equalsIgnoreCase("Google"))
			URLaddr="https://www.google.com";
		else
			URLaddr="https://www.fb.com";
		getconfigvalues();
		driver.get(URLaddr);	  
	}

	@When("^I love$")
	public void enter_blank_details_for_Register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(p.getProperty("Love"));
	}

	@Then("^error email shown$")
	public void error_email_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}
	
	public void getconfigvalues() throws FileNotFoundException, IOException
	{
		p=new Properties();
		p.load(new FileInputStream(new File("C:\\nikhil\\nikhil.properties")));		
		System.setProperty("webdriver.chrome.driver",p.getProperty("driver"));
		driver = new ChromeDriver();		
	}
}
