package SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Sinha\\Downloads\\Software\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://book.spicejet.com/?gclid=EAIaIQobChMItZDH9fHZ2gIVwg0rCh0RnAUjEAAYASAAEgJBnvD_BwE");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("highlight-addons"))).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Hot Meals")).click();
		
	System.out.println(driver.getTitle());
		
	driver.close();
	}
}