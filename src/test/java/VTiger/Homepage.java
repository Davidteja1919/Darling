package VTiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//Encapsulation
	@FindBy(xpath = "//a[.='Organizations']")private WebElement orgmd;
	@FindBy(xpath = "//a[.='Contacts']")private WebElement conmd;
	@FindBy(xpath = "//a[.='Opportunities']")private WebElement oppmd;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement admmd;
	@FindBy(xpath = "//a[.='Sign Out']")private WebElement sigmd;

	//Consturctor
	public Homepage(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	//Getter
	public WebElement getOrgmd() {
		return orgmd;
	}

	public WebElement getConmd() {
		return conmd;
	}

	public WebElement getOppmd() {
		return oppmd;
	}

	public WebElement getAdmmd() {
		return admmd;
	}

	public WebElement getSigmd() {
		return sigmd;
	}
	
	//business Library
	public void Organsation() {
		orgmd.click();
	}
	public void Contact() {
		conmd.click();
	}
	public void Opportunities() {
		oppmd.click();
	}
	public void Admin() {
		admmd.click();
	}
	public void SignOut() {
		sigmd.click();
	}

}
