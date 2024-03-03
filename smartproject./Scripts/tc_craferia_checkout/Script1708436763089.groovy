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

WebUI.setText(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/input_s'), 'bamboo')

WebUI.sendKeys(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/input_s'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_You searched for bamboo - Handicrafts _82fa81/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_You searched for bamboo - Handicrafts _82fa81/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/span_Delhi'))

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/button_Place order'))

WebUI.closeBrowser()

