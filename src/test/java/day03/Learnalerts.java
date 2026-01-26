package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnalerts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//driver.findElement(By.className("btn-danger")).click();
		//String SimpleText = driver.switchTo().alert().getText();
		//System.out.println(SimpleText);
		//driver.switchTo().alert().accept();
		//driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		//driver.findElement(By.className("btn-primary")).click();
		//String Text = driver.switchTo().alert().getText();
		//System.out.println(Text);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.className("btn-info")).click();
		driver.switchTo().alert().sendKeys("Automation Testing user");
		driver.switchTo().alert().accept();
	}
}
