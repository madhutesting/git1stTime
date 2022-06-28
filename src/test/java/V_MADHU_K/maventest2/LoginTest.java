package V_MADHU_K.maventest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
		@Test
		public void login() {
			WebDriverManager.chromedriver().setup();
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			
			dr.get("https://opensource-demo.orangehrmlive.com/");
			
			dr.findElement(By.id("txtUsername")).sendKeys("Admin");
			dr.findElement(By.id("txtPassword")).sendKeys("Admin123");
			dr.findElement(By.id("btnLogin")).click();
			System.out.println("madhu");
			System.out.println("vanapalli");
			Assert.assertEquals(dr.getTitle(), "OrangeHRM");
			
			dr.close();
		}

	}



