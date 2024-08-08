package Hooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigFile.readConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksClass {
	
	public static WebDriver driver;
	readConfig configFile;
	
	@Before
	
	public void setUp() throws IOException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		configFile=new readConfig();
		String URL= configFile.getUrl();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
	}
	
	@After
	
	public void tearDown() {
		
		if(driver!=null) {
			
			driver.quit();
		}
		
		
	}

}
