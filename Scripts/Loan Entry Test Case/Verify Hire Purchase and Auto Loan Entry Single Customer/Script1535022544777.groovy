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

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Customer_Nav/a_Customer'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Customer_Nav/a_Customers'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Customer Entry - Buttons/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Customer Entry - Buttons/button_Create'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/span_Offer Date'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_LoanOfferedDate'), 
    '2018/8/24')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_Chapagaun Lalitpur SBL0'), 
    '10', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Accepted Loans'))

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term'), 
    'Hire Purchase Loan', false)

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur'), 
    'Auto Purpose')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur_1'), 
    'सवारी साधन')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Amo'), 
    '2500000')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Int'), 
    '4.7')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Ser'), 
    '12')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Exp'), 
    '12')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Mor'), 
    '7')

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Previous Loans'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Ban'), 
    'प्रभु ')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak'), 
    '२००५/६/४')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Loa'), 
    'व्यापार ')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak_1'), 
    '400000')

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Bail Persons'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Muk'), 
    '1403', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Muk_1'), 
    '1409', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.KittaNu (1)'), 
    '४१६१')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.AreaInN'), 
    '७-४-१')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address'), 
    'बालकोट ')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_1'), 
    '8')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर ')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Muk_2'), 
    '1403', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.KittaNu'), 
    '१५६२७')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.AreaInN'), 
    '६-१-२')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_----.._1'), 
    'बिगाहा', true)

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address'), 
    'कागेश्वोरी')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_1'), 
    '6')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_2'), 
    'ग')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.MalpotA'), 
    'कागेश्वोरी, काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Muk_3'), 
    '1406', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.KittaNu'), 
    '५१६७')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.AreaInN'), 
    '७-१-८')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_----.._2'), 
    'व.मी.', true)

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_2'), 
    'Bardiya', true)

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address'), 
    ' दौलतपुर')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_1'), 
    '6')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.MalpotA'), 
    ' दौलतपुर, बर्दिया ')

WebUI.selectOptionByValue(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Muk_4'), 
    '1413', true)

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Vehicles'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_VehicleDetails0.EngineNo'), 
    'T25171J671')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_VehicleDetails0.ChessisN'), 
    'NA5167111')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_VehicleDetails0.ModelNo'), 
    'TATA LCV BUS')

WebUI.setText(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_VehicleDetails0.Registra'), 
    'बा २ ख ३५१५')

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Document Prepared By'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Load Current User'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/a_Required Reports  Save'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Hire Purchase and Auto Loan Single Customer/Page_Add Edit Loan Entry - Details/input_btn btn-success col-md-1'))

