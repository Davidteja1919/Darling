package ActualTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.CreateNewOrganizationPage;
import POM.HomePage;
import POM.OrganizationInformationPage;
import POM.OrganizationPage;
import genericUtilities.Baseclass;

public class CreateOrganizationTest extends Baseclass{
	@Test
	public void createorg() {
		//click on orgmodule
		HomePage h=new HomePage(d);
		h.clickOnOrgLink();
		//click on lookup image
		OrganizationPage o=new OrganizationPage(d);
		o.clickOnOrgLookUpImg();
		//give org name
		CreateNewOrganizationPage cop=new CreateNewOrganizationPage(d);
		cop.createNewOrganization("Capgemini"+ju.getrandomNum());
		//get the header and verify
		OrganizationInformationPage oip=new OrganizationInformationPage(d);
		String header = oip.getHeader();
		//verify
		Assert.assertTrue(header.contains("Capgemini"));
		System.out.println("Organization is created and TC is Pass");
	}

}
