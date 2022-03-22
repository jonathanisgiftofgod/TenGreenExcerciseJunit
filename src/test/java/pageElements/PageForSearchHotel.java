package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class PageForSearchHotel extends BaseClass {
	public PageForSearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement NoRoom;
	@FindBy(id = "datepick_in")
	private WebElement datein;
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement Adult;
	@FindBy(id="child_room")
	private WebElement Child;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(id="radiobutton_0")
	private WebElement Radio;
	@FindBy(id="continue")
	private WebElement Continue;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNoRoom() {
		return NoRoom;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdult() {
		return Adult;
	}
	public WebElement getChild() {
		return Child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getRadio() {
		return Radio;
	}
	public WebElement getContinue() {
		return Continue;
	}
	
	
	
}
