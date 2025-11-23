package Noukari;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ranjeet_Profile {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.id("login_Layer")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']"))).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ranjeetp.testing@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Ranjeet@123");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		driver.findElement(By.xpath("//a[text()='View']")).click();
		driver.findElement(By.xpath("//em[text()='editOneTheme']")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Ranjeet Patil");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(10);
		//driver.close();
		System.out.println("Ranjeet Profile Updated Successfully");
		driver.quit();
		
		
		
		

	}

}
