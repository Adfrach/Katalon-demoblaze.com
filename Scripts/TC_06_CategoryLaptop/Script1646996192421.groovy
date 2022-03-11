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

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_PRODUCT STORE'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Sony vaio i5790Sony is so confident tha_3b620b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Sony vaio i7790REVIEW Sony is so confid_658fef'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_MacBook air7001.6GHz dual-core Intel Co_e5a70f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Dell i7 8gb7006th Generation Intel Core_0b0b41'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_2017 Dell 15.6 Inch7007th Gen Intel Cor_202379'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_MacBook Pro1100Apple has introduced thr_94cf6c'))

WebUI.closeBrowser()

