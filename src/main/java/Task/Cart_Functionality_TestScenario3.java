package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_Functionality_TestScenario3 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Uday");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("440010");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		jse.executeScript("window.scrollBy(400,0)");
		WebElement overview = driver.findElement(By.xpath("(//span[@class='title'])[1]"));
		if(overview.isDisplayed())
		{
			System.out.println("Overview page displayed");
		}
		else
		{
			System.out.println("Overview page in not displayed");
		}

	}

}
