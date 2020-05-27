package co.com.sophos.certification.challenge.util.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriver {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public CustomDriver() {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/co/com/sophos/certification/challenge/driver/chromedriver.exe");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(24, TimeUnit.SECONDS);
	}
	
	public static CustomDriver chromeDriver() {
		return new CustomDriver();
	}
	
	public WebDriver onPageURL(String url) {
		driver.get(url);
		return driver;
	}
	
	public void scrollDown() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
	}

}
