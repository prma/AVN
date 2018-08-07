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

WebUI.callTestCase(findTestCase('TC1_Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Loan Entry/Page_Home Page - Loan Reports Autom/a_Customer'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Home Page - Loan Reports Autom/a_Customers'))

WebUI.click(findTestObject('Loan Entry/Page_Customer Entry - Loan Reports/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Customer Entry - Loan Reports/button_Create'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --SBL001SBL67'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_LoanOfferedDate'), 
    '2018/08/09')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_ServiceRate'), '3')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/span_Premium Rate'))

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PremiumRate'), '15')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/div_col-md-2'))

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_FairMarketValue'), 
    '60')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Loa'), 
    'Business')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Loa_1'), 
    'व्यापार')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Pur'), 
    'Boutique')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Pur_1'), 
    'बुटिक')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Amo'), 
    '600000')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Int'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_AcceptedLoanDetails0.Exp'), 
    '2023/8/6')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_Load Current User'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --FatherGrand'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.DOBEng'), 
    '1970/4/2')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.DOBNep'), 
    '२०३०/३/५')

WebUI.selectOptionByValue(findTestObject('Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Perman'), 
    'बालकोट')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Perman_1'), 
    '7')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_Copy as Permanent'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --Grand Fathe'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Family'), 
    'Umit Basnet')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Family_1'), 
    'उमित बस्नेत ')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --Grand Fathe_1'), 
    'Grand Father', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Family_2'), 
    'Hira Basnet')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_BailPersonDetail0.Family_3'), 
    'हिरा बस्नेत ')

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.KittaNu'), 
    '२२३२')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.AreaInN'), 
    '२-४-६')

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --AchhamArgha_1'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.Address'), 
    'सुर्यविनायक ')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.Address_1'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.Address_2'), 
    'घ ')

WebUI.setText(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_PropertyDetails0.MalpotA'), 
    'भक्तपुर ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/select_-- select --FatherGrand_1'), 
    'Self', true)

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_Is1PersentRequired'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('Object Repository/Loan Entry/Page_Add Edit Loan Entry - Loan Rep/input_btnSaveLoanEntry'))

