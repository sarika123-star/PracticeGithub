package objectrepository.forcurrentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	WebDriver driver;
	public OrganizationInfoPage(WebDriver driver) {			//rule3: Initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "dvHeaderText")
	private WebElement headerText;
	
	@FindBy(id = "dtlview_Phone")
	private WebElement phoneText;
	@FindBy(id = "dtlview_Type")
	private WebElement typeText;
	@FindBy(id = "dtlview_Industry")
	private WebElement industryText;
	
	
	
	public WebElement getTypeText() {
		return typeText;
	}

	public WebElement getIndustryText() {
		return industryText;
	}

	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getPhoneText() {
		return phoneText;
	}
	
	
}


