package Valentine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Whatsapp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com");
		Thread.sleep(5000);
		driver.findElement(By.className("_2MSJr")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Arun");
		Thread.sleep(3000);
		//driver.findElement(By.className("_1wjpf")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Hey");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}

