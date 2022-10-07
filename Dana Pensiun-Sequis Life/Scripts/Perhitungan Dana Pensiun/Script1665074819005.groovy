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

WebUI.navigateToUrl('https://sequis.co.id/')

WebUI.click(findTestObject('Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/Page_Asuransi Jiwa  Perencanaan Dana Pensiun dari Sequis - Sequis - Your Better Tomorrow/button'))

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/a_Asuransi Jiwa'))

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/a_Dana Pensiun'))

WebUI.scrollToElement(findTestObject('Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/select_- Silakan pilih di sini -           _6a6090'), 
    0)

WebUI.click(findTestObject('Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/span_- Silakan pilih di sini -'))

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/span_Dana pensiun'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/select_- Silakan pilih di sini -           _6a6090'), 
    '34', true)

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Asuransi Jiwa  Perencanaan Dana Pensiu_c96751/button_Selanjutnya'))

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Tingkat inflasi ()_inflasiInput'), 
    0)

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/span_Dana pensiun_jcf-select-opener'))

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/span_Dana pensiun'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/select_- Silakan pilih                     _b3b60e'), 
    '34', true)

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Rp_calc_type3'), 
    '450,0000')

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Tingkat inflasi ()_inflasiInput'), 
    '4')

WebUI.scrollToElement(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/button_Selanjutnya'))

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/h3_Silahkan isi data Anda dibawah ini'), 
    0)

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Usia Anda Saat Ini                   _8130c6'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Usia Pensiun yang Anda Inginkan (Tahu_a5afd5'), 
    '80')

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/button_Selanjutnya'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Rasio Penggantian yang dikehendaki ()_b56598'))

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Rasio Penggantian yang dikehendaki ()_b56598'), 
    '92')

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Lama pensiun yang Anda inginkan (Tahu_dfb7f7'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/input_Suku Bunga Deposito                  _87bd1f'), 
    '4')

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Kalkulator Keuangan - Sequis - Your Be_bbf50f/button_Selanjutnya_1_2'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Dana Pensiun/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/div_Sesuai dengan pilihan yang Anda isi ke _be44c6'))

WebUI.closeBrowser()

