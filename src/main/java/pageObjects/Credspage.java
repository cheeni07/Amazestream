package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Credspage {

	
	WebDriver driver;

	By email = By.cssSelector("input[type='email']");
	By contbtn = By.cssSelector("input[id='continue']"); 
	By password = By.cssSelector("input[id='ap_password']");
	By signinbtn = By.cssSelector("input[id='signInSubmit']");
	
	public Credspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  this.driver = driver;
	}
	
	
	public WebElement email(){
		
		return driver.findElement(email);
	}

    public WebElement continuebtn(){
		
		return driver.findElement(contbtn);
	}

    public WebElement password(){
		
		return driver.findElement(password);
	}

    public WebElement signin(){
 		
		return driver.findElement(signinbtn);
	}


}
