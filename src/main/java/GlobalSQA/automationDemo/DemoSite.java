package GlobalSQA.automationDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoSite {
	WebDriver driver=DriverManager.getdriver();
	public static String parentwindow;
	
	By afw=By.cssSelector("div.avatar svg path[fill-rule='evenodd']");
	
	
	public DemoSite Scroll () {
		parentwindow=driver.getWindowHandle();
		Set <String> windowIds=driver.getWindowHandles();
		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			System.out.println("Demosite Window ID : " + driver.getWindowHandle());
			if (driver.getTitle().contains("DEMOQA")){
				break;
			}
		}
		return this;
	}
	
	public AlertsWindow Alert () {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)"); 
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		ele.click();
		return new AlertsWindow();
	}

}
