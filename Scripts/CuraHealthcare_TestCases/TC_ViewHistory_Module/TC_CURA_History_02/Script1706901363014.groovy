import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/i_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/form_Facility                              _20adf0'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/div_Medicare                               _cb3988'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/td_29'))

WebUI.setText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/textarea_comment'), 'Check history')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/button_Book Appointment'))*/
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/td_14'))

WebUI.setText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/textarea_comment'), 'test')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/td_19'))

WebUI.setText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/textarea_comment'), '2nd appointment')

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/a_History'))

WebUI.verifyElementText(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/h2_History'), 'History')

WebUI.verifyElementVisible(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/div_14012024                               _03d2af'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HistoryOR/Page_CURA Healthcare Service/div_19012024                               _1adbc0'))

WebUI.closeBrowser()
