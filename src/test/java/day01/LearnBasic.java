package day01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class LearnBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi");syso
		//ClassName obj = new ClassName();
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.edgedriver().setup();
		ChromeDriver driverchrome = new ChromeDriver();
		//EdgeDriver driveredge = new EdgeDriver();
		driverchrome.get("https://katalon-demo-cura.herokuapp.com/");
	}

}
