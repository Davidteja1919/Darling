package genericUtilities;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertyFilleUtility {
	public String readDataFromPropertyFile(String Key) throws Throwable {
		FileInputStream f=new FileInputStream("C:\\Users\\Tejakumar\\OneDrive\\Documents\\CommonData.properties");
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(Key);
	}

}
