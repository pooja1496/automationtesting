package GlobalSQA.automationDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQA {
	WebDriver driver=DriverManager.getdriver();
	public static String parentwindowid;
	
	By registrationbtn=By.cssSelector("div.col-12 a[class='btn btn-primary-shadow btn-block']");
	By tutorials=By.cssSelector("div.col-12 a[class='navbar__tutorial-menu']");
	
	public EnrollForm clickreg() throws InterruptedException {
		parentwindowid=driver.getWindowHandle();
		Set <String> windowIds=driver.getWindowHandles();
		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			System.out.println("Window ID : " + driver.getWindowHandle());
			if (driver.getTitle().contains("Tools QA")){
				break;
			}
		}
		WebElement ele=driver.findElement(registrationbtn);
		ele.click();
		Thread.sleep(2000);
		return new EnrollForm();
		
	}	
}
