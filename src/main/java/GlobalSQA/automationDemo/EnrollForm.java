package GlobalSQA.automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org. openqa. selenium. support. ui. Select;

public class EnrollForm {
	WebDriver driver=DriverManager.getdriver();
	
	By name=By.cssSelector("div.upcoming__registration--input__container input[id='first-name']");
	By lname=By.cssSelector("div.upcoming__registration--input__container input[id='last-name']");
	By email=By.cssSelector("div.upcoming__registration--input__container input[id='email']");
	By mobile=By.cssSelector("div.upcoming__registration--input__container input[id='mobile']");
	By city=By.cssSelector("div.upcoming__registration--input__container input[id='city']");
	By message=By.cssSelector("div.upcoming__registration--input__container textarea[id='message']");
	By country=By.cssSelector("div.upcoming__registration--input__container select");
	By inputcode=By.cssSelector("div.upcoming__registration--input__container input[id='code']");
	By send= By.cssSelector("div.row form button");
	By demosite= By.cssSelector("div.col-auto li a[href='https://demoqa.com']");
	public EnrollForm firstname (String user) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
		driver.findElement(name).sendKeys("Pooja");
		return this;
	}
	public EnrollForm lastname (String ltext) {
		driver.findElement(lname).sendKeys("Narula");
		return this;
	}	
	public EnrollForm email (String emailid) {
		driver.findElement(email).sendKeys("pujanarula1496@gmail.com");
		return this;
	}	
	public EnrollForm Mobile (String mb) {
		driver.findElement(mobile).sendKeys("8585853265");
		return this;
	}	
	public EnrollForm City (String cityname) {
		driver.findElement(city).sendKeys("Ambala");
		return this;
	}	
	public EnrollForm Message (String msg) {
		driver.findElement(message).sendKeys("Hi, This site includes a captcha so we are unable to proceed..");
		return this;
	}
	public EnrollForm Country (String msg) {
		WebElement webe= driver.findElement(country);
		webe.click();
		Select select = new Select(webe);
		select.selectByValue("40");;
		WebElement o = select.getFirstSelectedOption();
	      String selectedoption = o.getText();
	      System.out.println("Selected element: " + selectedoption);
		return this;
	}
	public EnrollForm Code (String code) {
		driver.findElement(inputcode).sendKeys("brmn");
		return this;
	}
	
	public SendPage clicksend() {
		WebElement snd= driver.findElement(send);
		snd.click();
		return new SendPage();		
	}
	
	public DemoSite clickdemosite() {
		WebElement snd= driver.findElement(demosite);
		snd.click();
		return new DemoSite();		
	}
}
