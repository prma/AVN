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

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Customer_Nav/a_Customer'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Customer_Nav/a_Customers'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Customer Entry - Buttons/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Customer Entry - Buttons/button_Create'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_search'), 
    'PX3242')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_btnAddLoanPerson'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_LoanOfferedDate'), 
    '2018/8/24')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Accepted Loans'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term'), 
    'Education Loan', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur'), 
    'Education Purpose')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur_1'), 
    'शैक्षिक ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Amo'), 
    '3000000')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Int'), 
    '6.6')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Ser'), 
    '6')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Exp'), 
    '15')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Mor'), 
    '9')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Previous Loans'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Ban'), 
    'प्रभु बैंक')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak'), 
    '२००४/५/८')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Loa'), 
    'व्यापार ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak_1'), 
    '500000')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails1.Ban'), 
    'ग्लोबल बैंक ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails1.Bak'), 
    '२००६/७/८')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails1.Loa'), 
    'व्यापार ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails1.Bak_1'), 
    '400000')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Bail Persons'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra'), 
    '1355', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_1'), 
    '1379', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_2'), 
    '1361', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_3'), 
    '1385', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Guardians'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_4'), 
    '1358', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_5'), 
    '1382', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.KittaNu'), 
    '५६७८')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.AreaInN'), 
    '९-१-६')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address'), 
    'बालकोट')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_1'), 
    '6')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_6'), 
    '1379', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.KittaNu'), 
    '४५६७')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.AreaInN'), 
    '६-८-१')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_----.._1'), 
    'बिगाहा', true)

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address'), 
    'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_1'), 
    '7')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.MalpotA'), 
    'कागेश्वोरी, काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_7'), 
    '1355', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.KittaNu'), 
    '८७६५')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.AreaInN'), 
    '३-५-१')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_----.._2'), 
    'व.मी.', true)

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_2'), 
    'Baglung', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address'), 
    'देवीस्थान')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_1'), 
    '6')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.MalpotA'), 
    'देवीस्थान, बाग्लुंग ')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_8'), 
    '1358', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.KittaNu'), 
    '५६७८')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.AreaInN'), 
    '९-२-५')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_----.._3'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_3'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address'), 
    'गोठाटार')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address_1'), 
    '7')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address_2'), 
    'घ')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.MalpotA'), 
    'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_9'), 
    '1385', true)

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Witness'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.FirstNameWith'), 
    'Kesar')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.LastNameWithn'), 
    'Thapa')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.FirstNameWith_1'), 
    'केसर')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.LastNameWithn_1'), 
    'थापा')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_4'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.Address.Munic'), 
    'कागेश्वोरी')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.Address.WardN'), 
    '7')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.FirstNameWith'), 
    'Diya')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.LastNameWithn'), 
    'Basnet')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.FirstNameWith_1'), 
    'दिया')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.LastNameWithn_1'), 
    'बस्नेत ')

WebUI.selectOptionByValue(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_5'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.Address.Munic'), 
    'सिपाडोल')

WebUI.setText(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Witnesses1.Address.WardN'), 
    '8')

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Document Prepared By'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Load Current User'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/a_Required Reports  Save'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Education Loan Entry Multiple Customer/Page_Add Edit Loan Entry - Details/input_btn btn-success col-md-1'))

