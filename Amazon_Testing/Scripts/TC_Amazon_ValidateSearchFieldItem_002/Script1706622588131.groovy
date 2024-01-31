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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=stripbooks', true)

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Page_Book Store Online  Buy Books Online at_0a68ca/i_a-icon a-icon-checkbox'))

unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_Amazon.in/i_a-icon a-icon-checkbox'),0)
if (unchecked == true) {
	System.out.println('element not checkeck')

	WebUI.check(findTestObject('Object Repository/Page_Amazon.in/i_a-icon a-icon-checkbox'))

	System.out.println('element checkeck')
}
WebUI.delay(3)

WebUI.closeBrowser()

