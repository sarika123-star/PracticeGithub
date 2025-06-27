package objectrepository.forcurrentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganizationPage {
	WebDriver driver;
	public CreatingNewOrganizationPage(WebDriver driver) {			//rule3: Initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(name = "accountname")
	private WebElement orgnameEdt;
	
	@FindBy(name = "phone")
	private WebElement phoneEdt;
	
	@FindBy(name = "industry")
	private WebElement industrydropdwn;
	
	@FindBy(name = "accounttype")
	private WebElement typedopdwn;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	
	
	public WebElement getPhoneEdt() {
		return phoneEdt;
	}

	public WebElement getIndustrydropdwn() {
		return industrydropdwn;
	}

	public WebElement getTypedopdwn() {
		return typedopdwn;
	}

	public WebElement getOrgnameEdt() {
		return orgnameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//overLoded method
	public void createOrgn(String orgName) {
		orgnameEdt.sendKeys(orgName);
		saveBtn.click();
	}
	public void createOrgn(String orgName, String phonenum) {
		orgnameEdt.sendKeys(orgName);
		phoneEdt.sendKeys(phonenum);
		saveBtn.click();
	}	
	public void createOrgn(String orgName, String industry, String type) {
		orgnameEdt.sendKeys(orgName);
		Select sel= new Select(industrydropdwn);
		sel.selectByVisibleText(industry);
		Select sel1=new Select(typedopdwn);
		sel1.selectByVisibleText(type);
		saveBtn.click();
		
	}	
	
	
}
