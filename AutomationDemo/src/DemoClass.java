import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;


public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\BrowserDrivers\\geckodriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","C:\\BrowserDrivers\\msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");

	}

}
