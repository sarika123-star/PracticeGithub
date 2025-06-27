package objectrepository.forcurrentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OganizationPage{
	WebDriver driver;
	public OganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement CreateNewOrgButton;
	
	@FindBy(name = "search_text")
	private WebElement searchOrg;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchdopDwn;
	
	@FindBy(name = "submit")
	private WebElement searchNow;
	
	public WebElement getSearchdopDwn() {
		return searchdopDwn;
	}

	public WebElement getSearchNow() {
		return searchNow;
	}

	public WebElement getSearchOrg() {
		return searchOrg;
	}

	public WebElement getCreateNewOrgButton() {
		return CreateNewOrgButton;
	}

}
