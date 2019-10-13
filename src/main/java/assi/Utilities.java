package assi;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

public class Utilities {
	
	public boolean clickSafelyon(WebElement ele) {
		try {
		ele.click();
		return true;
		
		}catch(NoSuchElementException e) {
			throw new RuntimeException("Element you are finding is not present on page" +e);
		}
		catch(ElementNotVisibleException ex) {
			throw new RuntimeException("Element you are finding is not present on page" +ex);
		}
		catch(Exception ex) {
			throw new RuntimeException("Element has occured" +ex);
		}
	}
	
	public boolean enterSafely(WebElement ele, String text) {
		ele.sendKeys(text);
		return true;
	}
	

}