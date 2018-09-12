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

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Customer_Nav/a_Customer'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Customer_Nav/a_Customers'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Customer Entry - Buttons/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Customer Entry - Buttons/button_Create'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_Chapagaun Lalitpur SBL0'), 
    '7', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_LoanOfferedDate'), 
    '2018/8/24')

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Accepted Loans'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_--Select--Personal Term'), 
    'Education Loan', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Pur'), 
    'Education Purpose')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Pur_1'), 
    'शैक्षिक')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Amo'), 
    '2000000')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Int'), 
    '4.4')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Ser'), 
    '5')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Exp'), 
    '10')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_AcceptedLoanDetails0.Mor'), 
    '6')

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Previous Loans'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PreviousLoanDetails0.Ban'), 
    'प्रभु बैंक ')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PreviousLoanDetails0.Bak'), 
    '२००५/५/७')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PreviousLoanDetails0.Loa'), 
    'उद्योग')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PreviousLoanDetails0.Bak_1'), 
    '400000')

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Bail Persons'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj'), 
    '1379', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_1'), 
    '1385', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_2'), 
    '1388', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Guardians'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_3'), 
    '1382', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_4'), 
    '1385', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Collateral Detail'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.KittaNu'), 
    '४५६६')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.AreaInN'), 
    '३-२-५')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.Address'), 
    'सिपाडोल ')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.Address_1'), 
    '6')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.Address_2'), 
    'घ')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_5'), 
    '1379', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.KittaNu'), 
    '४५७६')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.AreaInN'), 
    '८-४-३')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_----.._1'), 
    'बिगाहा', true)

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.Address'), 
    'गोठाटार')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.Address_1'), 
    '7')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.Address_2'), 
    'घ')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails1.MalpotA'), 
    'काठमाडौँ')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_6'), 
    '1385', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.KittaNu'), 
    '६५४३')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.AreaInN'), 
    '६-४-५')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_----.._2'), 
    'व.मी.', true)

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --AchhamArgha_2'), 
    'Bardiya', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.Address'), 
    'भीमापुर')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.Address_1'), 
    '4')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.Address_2'), 
    'ग')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_PropertyDetails2.MalpotA'), 
    'भीमापुर, बर्दिया ')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --Father- Raj_7'), 
    '1382', true)

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Witness'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.FirstNameWith'), 
    'Sunita')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.LastNameWithn'), 
    'Thapa')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.FirstNameWith_1'), 
    'सुनिता')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.LastNameWithn_1'), 
    'थापा')

WebUI.selectOptionByValue(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/select_-- select --AchhamArgha_3'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.Address.Munic'), 
    'सिपाडोल')

WebUI.setText(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Witnesses0.Address.WardN'), 
    '5')

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Document Prepared By'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Load Current User'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/a_Required Reports  Save'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('Kyc Education Loan Entry Single Customer/Page_Add Edit Loan Entry -Details/input_btn btn-success col-md-1'))

