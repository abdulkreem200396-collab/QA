package day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		//new File("C:\\Users\\User\\OneDrive\\Desktop\\QAAutomation\\Automation2026\\images\\1.png");
		File des = new File("./images/1.png");
		FileUtils.copyFile(src, des);
	}
}
