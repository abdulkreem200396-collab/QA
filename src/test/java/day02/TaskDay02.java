package day02;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDay02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		WebElement FacilityDDL=driver.findElement(By.id("combo_facility"));
		Select dd = new Select(FacilityDDL);
		dd.selectByValue("Hongkong CURA Healthcare Center");
		driver.findElement(By.className("checkbox-inline")).click();
		driver.findElement(By.id("radio_program_medicaid")).click();
		driver.findElement(By.id("txt_visit_date")).sendKeys("28/01/2026");
		driver.findElement(By.id("txt_comment")).sendKeys("My Name is Abdulkreem");
		driver.findElement(By.id("btn-book-appointment")).click();
		String Title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(Title);

	}

}
