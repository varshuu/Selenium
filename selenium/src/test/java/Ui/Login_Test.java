package Ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;

public class Login_Test {

	public static String browser = "chrome";//External configuration- XLS,CSV
	public static WebDriver driver;//Global Variable of WebDriver

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser.equals("Firefox")) {
			WebDriverManager.chromedriver().setup();
			// ChromeDriver driver = new ChromeDriver();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		// driver.close();

	}

}
