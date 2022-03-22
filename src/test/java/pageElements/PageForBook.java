package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PageForBook extends BaseClass {
	public PageForBook() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="cc_num")
	private WebElement CardNumber;
	@FindBy(id="cc_type")
	private WebElement CardType;
	@FindBy(id="cc_exp_month")
	private WebElement Month;
	@FindBy(id="cc_exp_year")
	private WebElement Year;
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	@FindBy(id="book_now")
	private WebElement Book;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getMonth() {
		return Month;
	}
	public WebElement getYear() {
		return Year;
	}
	public WebElement getCvv() {
		return Cvv;
	}
	public WebElement getBook() {
		return Book;
	}
}
