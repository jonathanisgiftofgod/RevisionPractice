package finalPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjectClass.FlipkartPages;

public class ExecutionFlipkart extends BaseClass{
	@BeforeClass
	public void browserLaunch() {
		launchUrl("https://www.flipkart.com/");
	}
	@Test
	public void miphoneProduct() throws InterruptedException {
		FlipkartPages f = new FlipkartPages();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btnClick(f.getCloseUser());
		enterText(f.getSearchText(), "Mi mobiles");
		btnClick(f.getSubmit());

		List<WebElement> pageList = f.getPage();
		Thread.sleep(3000);
		for (int i = 1; i < pageList.size(); i++) {
			Thread.sleep(2000);
			selectByValue(f.getMinimum(), "4000");
			selectByValue(f.getMaximum(), "20000");
			WebElement pagination = f.getNext();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", pagination);
			List<WebElement> pageLists = f.getPage();
			List<Integer> li = new ArrayList<Integer>();
			Thread.sleep(2000);
			boolean paginationStatus = f.getNext().isEnabled();
			if (paginationStatus) {
				Thread.sleep(2000);
				pagination.click();
				Thread.sleep(2000);
				pageList.get(i).click();
				Thread.sleep(2000);
				List <WebElement> prices = f.getPrice();
				for (int j = 0; j < prices.size(); j++) {
					String price = prices.get(j).getText();
					char[] c = price.toCharArray();
					String cost = "";
					for (int k = 0; k < c.length; k++) {
						if (c[k]>=32&&c[k]<=47) {

						} else {
							cost = cost + c[k];
						}
					}
					System.out.println(cost);
				}
			}
			else {
				driver.quit();
			}
				
		}
	}
}
