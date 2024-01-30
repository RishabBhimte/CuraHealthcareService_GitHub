package com.packages.cura

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper



public class DropDownValidation {
	
	@Keyword
	public boolean checkDropDownValidation(TestObject object, String Option) {
		boolean flag = false;
		
		WebElement element = WebUiCommonHelper.findWebElement(object, 20);
		Select ddl = new Select(element)
		
		for(WebElement ele : ddl.getOptions()) {
			if(ele.getText().equalsIgnoreCase(Option)) {
				System.out.println("Element Exits");
				flag=true;
			}else {
				System.out.println("Element not found");
			}
		}
		return flag;
	}
}
