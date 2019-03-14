package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demochrome {
	
	public static void main(String[] args) throws InterruptedException {
		
//		String key = "webdriver,chrome.driver";
//		String value = "./driver/chromedriver.exe";
//		
//		System.setProperty(key, value);
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
