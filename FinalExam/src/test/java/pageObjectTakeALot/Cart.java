package pageObjectTakeALot;

import java.util.Iterator;
import java.util.Set;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import frameWorkClasses.BasePage;

public class Cart extends BasePage {


	
	public String ItemPrice() {
		return getElementText(By.xpath("//span[@class='currency plus currency-module_currency_29IIm']"));
	}
		
	public String PriceOfCartItems2() {
		return getElementText(By.xpath("//*[contains(text(),'Cart Summary')]/..//span[contains(@class,'currency plus currency-module_currency_29IIm')]"));
	}
	public void SelectQuantity() {
		clickElement(By.xpath("//select[@id='cart-item_undefined']//option[@value='2']"));
	}
	
	
	public void GoToCart() throws InterruptedException {
		Set<String> handles = driver.getWindowHandles(); 
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		String childWindoID = it.next();
		driver.switchTo().window(childWindoID);
		clickElement(By.xpath("//button[@class='button checkout-now dark']"));
		
	}
//	
//	public void brandQuauntity(String bQuantity) {
//		clickElement(By.xpath("//select[@id='cart-item_undefined']"));
//		Select sel = new Select(driver.findElement(By.xpath("//select[@id='cart-item_undefined']")));
//		sel.selectByValue(bQuantity);
//	}
	
	public void SelectBrandQuantity(String TrueExcelQuantity) {
		selectDropdown(By.id("cart-item_undefined"), TrueExcelQuantity);
	}
	

	

}
