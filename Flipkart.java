package Valentine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.className("_2zrpKA")).sendKeys("8838560446");
		driver.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("8838560446",Keys.ENTER);
		driver.close();
	}
}
