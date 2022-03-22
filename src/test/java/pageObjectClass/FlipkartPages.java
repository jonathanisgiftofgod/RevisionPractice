package pageObjectClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FlipkartPages extends BaseClass{
	public FlipkartPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeUser;
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchText;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement submit;
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[1]")
	private WebElement minimum;
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[2]")
	private WebElement maximum;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	@FindBy(xpath="//nav[@class='yFHi8N']/a")
	private List<WebElement> page;
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> price;
	
	public WebElement getCloseUser() {
		return closeUser;
	}
	public WebElement getSearchText() {
		return searchText;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getMinimum() {
		return minimum;
	}
	public WebElement getMaximum() {
		return maximum;
	}
	public WebElement getNext() {
		return next;
	}
	public List<WebElement> getPage() {
		return page;
	}
	public List<WebElement> getPrice() {
		return price;
	}	
}
