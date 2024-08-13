package ConfigFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class readConfig {
	  
	       FileInputStream fis;
	       Properties prop;
	
	     public readConfig() throws IOException {
	    	 
	    	 
	    	 fis= new FileInputStream("src/test/resources/PropertiesFile/config.properties");
	    	 prop= new Properties();
	    	 prop.load(fis);
	    	
	     }
	     
	     public String getValidEmail() {
	    	  return prop.getProperty("validemail");
	    	 
	    	 
	    	 }
	     
	     public String getValidPassword() {
	    	 
	    	  return prop.getProperty("validpassword");
	    	  
	    	  
	    	  
	     }
	     
	     public String getInValidEmail() {
	    	  return prop.getProperty("InvalidEmail");
	    	 
	    	 
	    	 }
	     
	     public String getInValidPassword() {
	    	 
	    	  return prop.getProperty("InvalidPassword");
	    	  
	    	  
	    	  
	     }
	     
	     
	    	  
	    	  
	    public String getUrl() {
	    	
	    	return prop.getProperty("Url");
	    }
	    	  
	    	 
	    	
	     

}
