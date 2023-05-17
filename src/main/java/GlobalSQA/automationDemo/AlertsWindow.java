package GlobalSQA.automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsWindow {
	WebDriver driver=DriverManager.getdriver();
	
	public AlertPage clickalert() {
		WebElement alert= driver.findElement(By.xpath("//span[text()='Alerts']"));
		alert.click();
		
		return new AlertPage();
	}

}
