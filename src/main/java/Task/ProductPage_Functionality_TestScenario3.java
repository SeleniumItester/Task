package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage_Functionality_TestScenario3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String befor = driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).getText();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		String after = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
		if(after.equals("1"))
		{
			System.out.println("Item added");
		}
		else
		{
			System.out.println("Item not added");
		}
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		WebElement addedItem=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		if(addedItem.isDisplayed())
		{
			System.out.println("Item displayed in cart");
		}
		else {
			System.out.println("Item not displayed in cart");
		}

	}

}
