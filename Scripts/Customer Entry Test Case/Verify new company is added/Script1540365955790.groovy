import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login Test Case/TC1_Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Dashboard - Loan Reports Autom/a_Customer'))

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Dashboard - Loan Reports Autom/a_Add Company'))

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_CustomerID'), 
    'COMP-453231')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_AccountNo'), 
    '22112')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Name'), 
    'Spark Technology')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.NameNepali'), 
    'स्पार्क टेक्नोलोजी')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.PanNumber'), 
    'S3224545C')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.NameChangedNepal'), 
    'स्पार्क टेक')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.NameChangedDateN'), 
    '२०६४/६/२')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Address'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Address.Municipa'), 
    'Kathmandu')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Address.Municipa_1'), 
    'काठमाडौँ')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Address.WardNo'), 
    '5')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Address.Tole'), 
    'Battisputali')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.Address.ToleInNe'), 
    'बत्तीसपुतली')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Registration Detail'))

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationNumb'), 
    '२३४१/६७८/०१')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationActF'), 
    'प्राईभेट फर्म रजिष्ट्रेशन ऐन २०१४ बमोजिम नेपाल सरकार, उद्योग मन्त्रालय, घरेलु तथा साना उद्योग विभाग, घरेलु तथा साना उद्योग विकास समितिको कार्यालय')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationActA'), 
    'प्राईभेट फर्म रजिष्ट्रेशन ऐन २०१७ बमोजिम नेपाल सरकार')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationDate'), 
    '२०५०/६/७')

WebUI.click(findTestObject('KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Primary Authorized Person'))

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson'), 
    'Hari Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_1'), 
    'हरि थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Add more details...'))

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_2'), 
    '३२३४/४५६६')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_3'), 
    '1940/4/2')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_4'), 
    '२०२०/४/७')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_5'), 
    '२०४०/६/८')

WebUI.sendKeys(findTestObject('KYC Company Adding/Company People Citizen Issued Place/input_Company.AuthorizedPerson'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_6'), 
    'काठमाडौँ')

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_7'), 
    'Gothatar')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_8'), 
    'गोठाटार ')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_9'), 
    '4')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Copy as Permanent'))

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_1'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_10'), 
    'Raju Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_11'), 
    'राजु थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_2'), 
    'Grand Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_12'), 
    'Madan Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_13'), 
    'मदन थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_3'), 
    'Other', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_14'), 
    'Chairman')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_15'), 
    'Bikram Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_16'), 
    'बिक्रम थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Add more details...'))

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_17'), 
    '२३२२/६७८८')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_18'), 
    '1992/3/31')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_19'), 
    '२०४८/१२/१८')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_20'), 
    '२०६४/५/९')

WebUI.sendKeys(findTestObject('KYC Company Adding/Company People Citizen1/input_Company.AuthorizedPerson1'), 'ई.प्र.शा.')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_21'), 
    'काठमाडौँ')

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha_2'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_22'), 
    'Gothatar')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_23'), 
    'गोठाटार ')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_24'), 
    '4')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_Copy as Permanent'))

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_4'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_25'), 
    'Hari Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_26'), 
    'हरि थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_5'), 
    'Grand Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_27'), 
    'Raju Thapa')

WebUI.setText(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/input_Company.AuthorizedPerson_28'), 
    'राजु थापा')

WebUI.click(findTestObject('Object Repository/KYC Company Adding/Page_Company KYC - Loan Reports Aut/button_Save'))

