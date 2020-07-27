package OrangePack.OrangeProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{
	public WebDriver driver;
	@Parameters("browser")
    @Test
    public void launchBrowser(String browserName) {
    	System.out.println("Test Code");
    	if(browserName.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();	
    	}else if(browserName.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}
		driver.get("https://opensource-demo.orangehrmlive.com/");
    }
}
