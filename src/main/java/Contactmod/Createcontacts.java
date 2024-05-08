package Contactmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcontacts {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement clk;
	
public Createcontacts(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getClk() {
	return clk;
}

//Business
public void Create() {
	clk.click();
}
}
