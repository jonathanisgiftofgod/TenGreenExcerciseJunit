package pageFlipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FlipkartPageOfRegister extends BaseClass{
	public FlipkartPageOfRegister() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement login;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}
