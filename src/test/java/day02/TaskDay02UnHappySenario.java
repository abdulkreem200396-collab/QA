package day02;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDay02UnHappySenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe12");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword12");
		driver.findElement(By.id("btn-login")).click();
        String ErrorText = driver.findElement(By.cssSelector(".lead.text-danger")).getText();
		System.out.println(ErrorText);

	}

}
