package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Functionality_TestScenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		String item=driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		if(item.equals("Sauce Labs Bike Light"))
		{
			System.out.println("Correct Item");
		}

		else
		{
		
			System.out.println("Incorrect Item");
		}
	
		
		
}

}
