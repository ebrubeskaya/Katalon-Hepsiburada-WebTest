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

WebUI.openBrowser('https://www.hepsiburada.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddCart/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/button_Kabul et'))

WebUI.click(findTestObject('AddCart/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/div_rn, kategori veya marka ara'))

WebUI.setText(findTestObject('AddCart/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/input_concat(Premium, , u)_theme-IYtZzqYPto8PhOx3ku3c'), 
    'iphone 15')

WebUI.click(findTestObject('AddCart/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/div_ARA'))

WebUI.scrollToPosition(600, 800)

WebUI.click(findTestObject('AddCart/Page_iphone 15 - Hepsiburada/div_78.500,00 TL'))

WebUI.switchToWindowUrl('https://www.hepsiburada.com/iphone-15-pro-256-gb-p-HBCV00004XA877')

WebUI.scrollToPosition(600, 800)

WebUI.click(findTestObject('AddCart/Page_iPhone 15 Pro 256 GB Fiyat, Taksit Seenekleri ile Satn Al/button_Sepete Ekle'))

