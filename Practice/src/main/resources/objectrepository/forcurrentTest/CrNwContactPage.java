package objectrepository.forcurrentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrNwContactPage {
		
	WebDriver driver;
	public CrNwContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(name = "lastname")
	 private WebElement lastNameEdt;
	 
	 @FindBy(name = "support_start_date")
	 private WebElement staretDate;
	 
	 @FindBy(name = "support_end_date")
	 private WebElement endDate;
	 
	 @FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	 private WebElement OrgLookUpBtn;
	 
	 @FindBy(xpath = "//input[@class='crmButton small save']")
	 private WebElement saveContactBtn;
	 
	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getStaretDate() {
		return staretDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getOrgLookUpBtn() {
		return OrgLookUpBtn;
	}

	public WebElement getSaveContactBtn() {
		return saveContactBtn;
	}
	 
	
	 
	 
	 
	 
	}
