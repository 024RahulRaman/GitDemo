package SeleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;




public class ReadPropFile {

	public static void main(String[] args) throws IOException {

		Properties prop= new Properties();
		FileInputStream ip = new FileInputStream("/Users/rahulraman/eclipse-workspace/XYZ/src/SeleniumSession/config.properties");
		prop.load(ip);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("age"));
		
		
		
		String Url = prop.getProperty("url");
		System.out.println("Url");
		
		String BrowserName= prop.getProperty("browser");
		
		
		
		//System.out.println(prop.get("url"));
		System.out.println(prop.get("browser"));
		
		
		
		
		
		
	}

}
