package VTiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	
	//Encapsulation
	@FindBy(xpath = "//a[.='Organizations']")private WebElement organization;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement createorg;
	@FindBy(xpath = "//input[@name='accountname']")private WebElement Orgname;
	@FindBy(xpath = "//input[@class='crmbutton small save']")private WebElement save;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement admin;
	@FindBy(xpath = "//a[.='Sign Out']")private WebElement signout;
	
	//Constrctor
	public Organizationpage(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	//Getter
	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getCreateorg() {
		return createorg;
	}

	public WebElement getOrgname() {
		return Orgname;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	//Business library
	public void org() 
	{
		organization.click();
	}
	public void Create()
	{
		createorg.click();
	}
	public void save() 
	{
		save.click();
	}
	public void admin()
	{
		admin.click();
	}
	public void signout() 
	{
		signout.click();
	}

}
