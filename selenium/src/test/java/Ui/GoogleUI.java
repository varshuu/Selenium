package Ui;

import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;



public class GoogleUI {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\BrowserDrivers\\geckodriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver","C:\\BrowserDrivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");

	}
}
