package ConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeConfig {
	
	   FileOutputStream fos;
	   Properties prop;
	   FileInputStream fis;
	
	public writeConfig() throws IOException{
		fis=new FileInputStream("src/test/resources/PropertiesFile/config.properties");
		prop = new Properties();
		prop.load(fis);
		
		}
	
	public void writeUrl(String Url) throws IOException {
		
		
		 prop.setProperty("Url", Url);
		fos = new FileOutputStream("src/test/resources/PropertiesFile/config.properties"); 
		 prop.store(fos, null);

           
        }
	

	
	
	}


