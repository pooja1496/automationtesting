package GlobalSQA.automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver=DriverManager.getdriver();
	
	By JOINNOW=By.cssSelector("div.home-banner a[href='https://www.toolsqa.com/selenium-training/']");
	
	public HomePage openURL(String url) {
		driver.get(url);
		return this;
	}
	public ToolsQA clickbtn() {
		driver.findElement(JOINNOW).click();
		return new ToolsQA();
	}

}

















