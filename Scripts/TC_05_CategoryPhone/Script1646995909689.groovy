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

WebUI.verifyElementVisible(findTestObject('Page_STORE/a_PRODUCT STORE'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Phones'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Samsung galaxy s6360The Samsung Galaxy _59570d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Nokia lumia 1520820The Nokia Lumia 1520_ffd702'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Nexus 6650The Motorola Google Nexus 6 i_1f3be3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Samsung galaxy s7800The Samsung Galaxy _24e60c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Iphone 6 32gb790It comes with 1GB of RA_735e05'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Sony xperia z5320Sony Xperia Z5 Dual sm_23c601'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_HTC One M9700The HTC One M9 is powered _22ff61'))

WebUI.closeBrowser()

