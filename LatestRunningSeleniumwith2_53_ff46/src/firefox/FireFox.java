package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String args[]) {
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
System.setProperty("webdriver.chrome.driver","D:\\Users\\anbhagwat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
driver.quit();
	}
}
