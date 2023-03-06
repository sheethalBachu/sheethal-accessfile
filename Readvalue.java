package accessfile;

import java.io.IOException;
import java.util.Properties;

public class Readvalue {
	static Properties pro1;
	
	public static void main(String[] args) throws IOException {
		
		Accessfile af=new Accessfile();
		
		pro1=new Properties();
		pro1=af.readvalue();
		String s=pro1.getProperty("username");
		System.out.println(s);
		

	}

}
