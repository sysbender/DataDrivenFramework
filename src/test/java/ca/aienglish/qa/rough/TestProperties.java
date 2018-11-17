package ca.aienglish.qa.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.xalan.xslt.Process;

public class TestProperties {
	
 
	
	public static void main(String[] args) throws IOException {
		
		
		// get file path 
		Path configProp = Paths.get("src","test","resources", "properties","Config.properties");
		 
		
		// read properties
 
		Properties config = new Properties();
		System.out.println(configProp.toAbsolutePath().toString());
		FileInputStream fis = new FileInputStream(configProp.toAbsolutePath().toString());
		config.load(fis);
		
		config.getProperty("browser");
		
		String userdir = System.getProperty("user.dir");

		System.out.println(userdir);
	}
	

}
