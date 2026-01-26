package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[contains(@id,\"user\")]")).sendKeys("student");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Password123");
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();OR
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
	}

}
