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

WebUI.navigateToUrl('https://craferia.com/')

WebUI.click(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/a_My account'))

WebUI.setText(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/input_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/input_rememberme'))

WebUI.click(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/li_Unknown email address. Check again or tr_bf33d3'))

WebUI.click(findTestObject('Object Repository/Page_My account - Handicrafts Online, India_2ab468/a_Dismiss'))

WebUI.closeBrowser()

