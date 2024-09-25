package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Functionality_TestScenario2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("wrong_user");
		driver.findElement(By.id("password")).sendKeys("wrong_password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		WebElement error =driver.findElement(By.xpath("//h3[@data-test='error']"));
		if(error.isDisplayed())
		{
			System.out.println("Error message displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
		
		
	}

}
