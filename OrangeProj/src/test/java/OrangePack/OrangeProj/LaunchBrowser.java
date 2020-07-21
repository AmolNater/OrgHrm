package OrangePack.OrangeProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{
    @Test
    public void launchBrowser() {
    	System.out.println("Test Code");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
    }
}
