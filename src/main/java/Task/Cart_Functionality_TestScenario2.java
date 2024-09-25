package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Functionality_TestScenario2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#remove-sauce-labs-bike-light")).click();
		String cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
		if(cart.equals(""))
		{
			System.out.println("Cart updated");
		}

		else
		{
			System.out.println("Cart not updated");
		}

	}

}
