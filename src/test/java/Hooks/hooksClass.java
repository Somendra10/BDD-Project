package Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigFile.readConfig;
import ConfigFile.writeConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass {
	
	public static WebDriver driver;
	readConfig configFile;
	writeConfig configWrite;
	
	@Before
	
	public void setUp() throws IOException {
		Random random=new Random();
		int randomInt=random.nextInt(50);
		
		String Url="https://www.saucedemo.com";
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		configWrite=new writeConfig();
		configWrite.writeUrl(Url);
		configFile=new readConfig();
		String URL= configFile.getUrl();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
		
		
	}
	
	@After
	
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
	           byte[] ts= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	           scenario.attach(ts, "image/png", "Failed Case Screenshot");
	           
		}

		
		if(driver!=null) {
			
			driver.quit();
		}
		
	}
	
}
		
		
		
		
	


