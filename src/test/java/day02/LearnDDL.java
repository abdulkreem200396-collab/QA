package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDDL {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		//Single Value ==>Select just*****************************
		WebElement CourseDDL = driver.findElement(By.id("course"));
		Select dd = new Select(CourseDDL);
	//	dd.selectByIndex(1);
		//dd.selectByContainsVisibleText("Java");
		dd.selectByValue("java");
		//Multi Value*******************************************
		WebElement IDEName = driver.findElement(By.id("ide"));
		Select ddl2=new Select(IDEName);
		ddl2.selectByIndex(0);
		ddl2.selectByIndex(3);
		ddl2.selectByContainsVisibleText("IntelliJ IDEA");
		ddl2.selectByValue("vs");
		ddl2.deselectByIndex(1);
	}
}
