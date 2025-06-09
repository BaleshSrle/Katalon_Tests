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

WebUI.openBrowser(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.delay(GlobalVariable.timeDelay)

WebUI.verifyElementVisible(findTestObject('adrHIN/H5_adrHIN'))

WebUI.delay(GlobalVariable.timeDelay)

WebUI.scrollToElement(findTestObject('adrHIN/Button_ADR'), GlobalVariable.timeDelay)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.click(findTestObject('adrHIN/Button_ADR'))

WebUI.delay(GlobalVariable.timeDelay)

WebUI.selectOptionByLabel(findTestObject('adrHIN/SelectAdrHIN'), adrHINumber, false)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.verifyOptionSelectedByLabel(findTestObject('adrHIN/SelectAdrHIN'), adrHINumber, true, GlobalVariable.timeDelay)

WebUI.verifyElementText(findTestObject('adrHIN/Text_adrHIN'), adrHINmeaning)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.deleteAllCookies()

WebUI.delay(GlobalVariable.timeDelay)

WebUI.closeBrowser()

