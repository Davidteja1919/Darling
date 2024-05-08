package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	//Maximize
	public void maximizeBrowserwindow(WebDriver d) {
		d.manage().window().maximize();
	}
	//Minimize
	public void minimizeBrowserwindow(WebDriver d) {
		d.manage().window().minimize();
	}
	//implicit wait
	public void waitforPageload(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//Select
	public void handleDropdown(WebElement el,int index) {
		Select s=new Select(el);
		s.selectByIndex(index);
	}
	public void handleDropdown(WebElement el,String Value) {
		Select s=new Select(el);
		s.selectByValue(Value);
	}
	public void handleDropdown(String visibleText,WebElement el) {
		Select s=new Select(el);
		s.selectByVisibleText(visibleText);
	}
	
	//Actions
	public void MouseOverAction(WebDriver d,WebElement e) {
		Actions a=new Actions(d);
		a.moveToElement(e).perform();
	}
	public void RightClickAction(WebDriver d,WebElement e) {
		Actions a=new Actions(d);
		a.contextClick(e).perform();
	}
	public void doubleClick(WebDriver d,WebElement e) {
		Actions a=new Actions(d);
		a.doubleClick(e).perform();
	}
	public void dragAndDropAction(WebDriver d,WebElement srcele,WebElement desele) {
		Actions a=new Actions(d);
		a.dragAndDrop(srcele, desele).perform();
	}
	//Screenshot
	public void getScreenshot(WebDriver d,String screenshotname) {
		TakesScreenshot ts=(TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Tejakumar\\eclipse-workspace selenium\\selenium\\Screenshots\\"+screenshotname+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//    "./"+"\\Screenshots\\ProjectName"+System.currentTimeMillis()
}
