package pojotask;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pommanager.PojoLogin;

public class PojoExecution extends BaseClass {
	public static void main(String[] args) {
     BrouserLaunch("chrome","https://automationexercise.com/login");
     PojoLogin pj =new PojoLogin();
     WebElement name = pj.getName();
     name.sendKeys("Lizia");
     WebElement email = pj.getEmail();
     email.sendKeys("liziarosi2@gmail.com");
     WebElement signup = pj.getSignup();
     signup.click();
     
     
		
	}

}
