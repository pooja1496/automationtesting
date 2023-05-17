package GlobalSQA.automationDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
	WebDriver driver=DriverManager.getdriver();
	By clickbtn=By.cssSelector("div.col button[id='alertButton']");
	
	public AlertPage clickme() throws InterruptedException {
		WebElement click= driver.findElement(clickbtn);
		click.click();
		Alert alt= driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		Thread.sleep(5000);
		
		return this;
	}

}
