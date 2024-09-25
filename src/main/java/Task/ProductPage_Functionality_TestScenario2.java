package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage_Functionality_TestScenario2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	
		
		// Verifying Product name
		
		String expectedName = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
		if(expectedName.equals("Sauce Labs Backpack"))
		{
			System.out.println("Product name is: "+expectedName);
		}
		else
		{
			System.out.println("Product name is not Sauce Labs Backpack");
		}
		
		// Verifying Product description
		
		String description =driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']")).getText();
		if(description.contains("carry.allTheThings() "))
		{
			System.out.println("Description displayed");
		}
		else
		{
			System.out.println("Descrition not displayed");
		}
		
		// Verifying Product Price
		
		String price=driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();

		if(price.equals("$29.99"))
		{
			System.out.println("Price is: " + price);
		}
		else
		{
			System.out.println("price not displayed");
		}

	}

}
