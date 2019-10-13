package assi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities{
	WebDriver driver;
	public HomePage(WebDriver driver){
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="REGISTER") WebElement reg;
	@FindBy(className=" REGISTER") WebElement reg1;
	@FindBy(xpath="//* [@class = 'REGISTER']") WebElement reg3;
	@FindBy(xpath="//* [contains (@class , 'REGISTER')]") WebElement reg4;
	
	
	@FindBy(linkText="SIGN-ON") WebElement sign;
	@FindBy(linkText="SUPPORT") WebElement support;
	@FindBy(linkText="CONTACT") WebElement contact;
	
	public boolean clickonRegister() {
		boolean result = super.clickSafelyon(reg);
		return result;
	}
	
	public boolean clickonSupport() {
		boolean result = super.clickSafelyon(support);
		return result;
	}
	
	
	
}
