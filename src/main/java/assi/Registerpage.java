package assi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage extends Utilities{
	WebDriver driver;
	public Registerpage(WebDriver driver){
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(name="firstName") WebElement fname;	
public boolean Enterfname(String text) {
	// TODO Auto-generated method stub
	boolean result = super.enterSafely(fname, text);
	return result;
}
@FindBy(name="lastName") WebElement lname;
public boolean Enterlname(String text) {
	// TODO Auto-generated method stub
	boolean result = super.enterSafely(lname, text);
	return result;
}
@FindBy(name="phone") WebElement phn;

@FindBy(name="userName") WebElement id;
@FindBy(name="address1") WebElement add;	
@FindBy(name="city") WebElement city;
@FindBy(name="state") WebElement state;
@FindBy(name="country") WebElement country;
	
	public void EnterText(String text) {
	//super.clickSafelyon(reg);
	}
	
	//Select sel=new Select(country);
	

	

}
