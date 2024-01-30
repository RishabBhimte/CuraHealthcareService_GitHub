import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/button_Login'))

CustomKeywords.'com.packages.cura.DropDownValidation.checkDropDownValidation'(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), "Seoul CURA Healthcare Center")

WebUI.selectOptionByValue(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/ButtonOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.closeBrowser()

