package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PageElementsForLogin extends BaseClass {
	public PageElementsForLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
