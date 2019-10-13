package assi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supportpage extends Utilities{
	WebDriver driver;
		public Supportpage(WebDriver driver){
			super();
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")
		WebElement bth;
		public boolean goBackToHomePage()
		{
			boolean result = super.clickSafelyon(bth);
			return result;
		}
}
