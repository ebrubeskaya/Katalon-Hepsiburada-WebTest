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

WebUI.click(findTestObject('Sign_Up/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/button_Kabul et'))

WebUI.click(findTestObject('Sign_Up/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/span_Giri Yap'))

WebUI.click(findTestObject('Sign_Up/Page_Trkiyenin En Byk Online Alveri Sitesi Hepsiburada.com/a_ye Ol'))

WebUI.setText(findTestObject('Sign_Up/Page_ye Giri Sayfas  ye Ol - Hepsiburada/input_ye ol_username'), 'winim71834@finghy.com')

WebUI.click(findTestObject('Sign_Up/Page_ye Giri Sayfas  ye Ol - Hepsiburada/button_Devam et'))

WebUI.closeBrowser()

