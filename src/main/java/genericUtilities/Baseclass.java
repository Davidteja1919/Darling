package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.HomePage;
import POM.LoginPage;

public class Baseclass {
	public PropertyFilleUtility p=new PropertyFilleUtility();
	public ExcelFileUtility e=new ExcelFileUtility();
	public WebDriverUtility w=new WebDriverUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriver d=null;
	
	@BeforeSuite
	public void bdconig() {
		System.out.println("DB Connection");
	}
	@AfterSuite
	public void asconig() {
		System.out.println("DB Disconnection");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER=p.readDataFromPropertyFile("browser");
		String URL=p.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			d=new EdgeDriver();
			System.out.println("Edgedriver is Launched");
		}
		else if(BROWSER.equalsIgnoreCase("chrome")){
			d=new ChromeDriver();
			System.out.println("chrome is Launched");
		}
		else {
			System.out.println("INVALID BROWSER NAME");
		}
		w.maximizeBrowserwindow(d);
		w.waitforPageload(d);
		d.get(URL);
		System.out.println("Browser is Opened");
		w.getScreenshot(d, "HOMEPAGE");
	}
	@AfterClass
	public void tearDown() {
		d.quit();
		System.out.println("Browser is Closed");
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN=p.readDataFromPropertyFile("un");
		String PWD=p.readDataFromPropertyFile("pwd");
		LoginPage l=new LoginPage(d);
		l.loginToApp(UN, PWD);
		System.out.println("Login is done successfully");
		w.getScreenshot(d,"LOGIN");
	}
	@AfterMethod
	public void amconfig() {
		HomePage h=new HomePage(d);
		h.logoutfromApp(d);
		System.out.println("logout is done successfully");
	}

}
