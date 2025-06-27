package objectrepository.forcurrentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//rule1: create seperate java class
public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) { // rule3: Initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 2: object creation
	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(linkText = "More")
	private WebElement moreLink;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImage;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	// 4: Encapsulation
	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public WebElement getAdminImage() {
		return adminImage;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	// business utility
	public void navigateToCampainPage() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();

	}

//	business method to logout
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImage).perform();
		signOutLink.click();

	}

}
