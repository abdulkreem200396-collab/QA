package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLoginTestcase {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//driverchrome.get("https://katalon-demo-cura.herokuapp.com/");//كبسات الباك وغيره ما بتكون فعالة
	driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");//عشان يكونو كبسات الباك وال ferword
	//driver.navigate().back();//برجع دايركت باك
	driver.manage().window().maximize();//كبسة تكبير الشاشة 
	driver.findElement(By.id("btn-make-appointment")).click();
	driver.findElement(By.name("username")).sendKeys("John Doe");
	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	driver.findElement(By.id("btn-login")).click();
	//Get Text Function
	//String Title = driver.findElement(By.tagName("h2")).getText();//ctrl+2
	//System.out.println(Title);
	//Link Click Learn
	//driver.findElement(By.linkText("info@katalon.com")).click();
	driver.findElement(By.partialLinkText("info@katalon")).click();
	//driver.close();
	//driver.quit();
	
}
}
