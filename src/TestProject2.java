import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProject2 {

	WebDriver driver = new ChromeDriver();
	String URL = "https://www.saucedemo.com/";
	
	@BeforeTest
	public void MyBeforeTest() {
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < AddtoCartButtons.size(); i = i + 2) {

			AddtoCartButtons.get(i).click();

		}
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Saja");
		driver.findElement(By.id("last-name")).sendKeys("kh");
		driver.findElement(By.id("postal-code")).sendKeys("0000");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	@Test()
	public void MyTest() {
	}

	@AfterTest
	public void MyAfterTest() {
	}
	
	
}
