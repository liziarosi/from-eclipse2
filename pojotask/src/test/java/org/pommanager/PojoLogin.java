package org.pommanager;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends BaseClass {
	public PojoLogin()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//button[text()='Signup']")
	private WebElement signup;

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}

	

}
