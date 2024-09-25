package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Functionality_TestScenario1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		String title =driver.getTitle();
		
		// TEST SCENARIO 2	
		
		// Verify that user is redirect to the product page.		
		if(title.equals("Swag Labs"))
		{
			System.out.println(title);
		}
		else
		{
			System.out.println("Page is wrong");
		}
		

	}

}
