package Automate.Amaze;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Credspage;
import pageObjects.Homepage;
import resources.Base;

public class AmazonTest extends Base {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialise() throws IOException{

	 driver=initialiseDriver();
		
	}
	
	@Test
	public void amazontest(){ 
	driver.get("https://www.amazon.in/");
	Homepage hp = new Homepage(driver);
	hp.getLogin().click();  
	Credspage cred = new Credspage(driver);
	cred.email().sendKeys("abhishek.rawat157@gmail.com");
	cred.continuebtn().click();
	cred.password().sendKeys("Cheeni@8763");
	cred.signin().click();
	hp.inputtxt().sendKeys("Creatine");
	hp.search().click();
	}
	

	@AfterTest
	public void shutdriver(){
		driver.close();
	}
	
	
}
