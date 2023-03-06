package accessfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Accessfile {

	
	public Properties readvalue() throws IOException {
		
		Properties pro = new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\sheet\\eclipse-workspace\\NaveenCollectionsessions\\src\\accessfile\\users.properties");
		//use try and catch
		
		pro.load(file);
		return pro;
		
	}

	}


