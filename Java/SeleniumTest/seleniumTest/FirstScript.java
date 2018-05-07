package firstpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstScript {
	public static void main(String[] args) {
		LaunchChrome_Method1();
	}
	
	
	public static void LaunchChrome_Method1() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.tomtellyou.com");
	}
}