package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

  WebDriver driver;  
  By login = By.cssSelector("div[class='nav-line-1-container'] span");
  By input = By.id("twotabsearchtextbox");
  By search = By.id("nav-search-submit-button");
  
  
  public Homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  this.driver=driver;
}



public WebElement getLogin(){
	  
	return driver.findElement(login);
	
	   
  }


public WebElement inputtxt(){
	  
	return driver.findElement(input);
	
	   
  }

public WebElement search(){
	  
	return driver.findElement(search);
	
	   
  }
}
