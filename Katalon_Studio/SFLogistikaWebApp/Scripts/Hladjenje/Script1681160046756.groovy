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

WebUI.openBrowser('https://baleshsrle.github.io/TransportPerishableGoods/')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Hladjenje/Text_H2'), 'Izračunavanje potrebne količine sredstva za hlađenje vagona-hladnjače')

WebUI.delay(GlobalVariable.timeDelay)

WebUI.selectOptionByLabel(findTestObject('Hladjenje/SelectRashladnoSredstvo'), rashladnoSredstvo, true)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.selectOptionByLabel(findTestObject('Hladjenje/SelectGodisnjeDoba'), godisnjeDoba, true)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.setText(findTestObject('Hladjenje/InputMasaRobe'), masaRobe)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.setText(findTestObject('Hladjenje/InputTrajanjePrevoza'), trajanjePrevoza)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.setText(findTestObject('Hladjenje/InputSpoljnaTemp'), spoljnaTemperatura)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.setText(findTestObject('Hladjenje/InputTempProizvoda'), temperaturaProizvoda)

WebUI.delay(GlobalVariable.timeDelay)

WebUI.selectOptionByLabel(findTestObject('Hladjenje/SelectVrstaNamirnice'), namirnica, true)

WebUI.delay(2)

WebUI.click(findTestObject('Hladjenje/IzracunajBtn'))

//WebUI.delay(GlobalVariable.timeDelay)
if ((((((masaRobe <= '0') || (trajanjePrevoza <= '0')) || (spoljnaTemperatura <= '-51')) || (spoljnaTemperatura >= '51')) || 
(temperaturaProizvoda <= '-51')) || (temperaturaProizvoda >= '51')) {
    //WebUI.getAlertText()
    WebUI.waitForAlert(GlobalVariable.timeDelay)

    WebUI.verifyAlertPresent(2)
} else {
    WebUI.verifyElementVisible(findTestObject('Hladjenje/PrikazRezultata'))
}

WebUI.delay(GlobalVariable.timeDelay)

WebUI.deleteAllCookies()

WebUI.delay(GlobalVariable.timeDelay)

WebUI.closeBrowser()

