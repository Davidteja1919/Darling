package Contactmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcontact {
	
@FindBy(xpath = "(//td[@class='tabUnSelected'])[4]")private WebElement click;

public Createcontact(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	
}

public WebElement getClick() {
	return click;
}
//Business Library
public void Createopen() {
	click.click();
}
}
