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

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Customer_Nav/a_Customer'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Customer_Nav/a_Customers'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Customer Entry - Buttons/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Customer Entry - Buttons/button_Create'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_search'), 
    'PX3242 ')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_btnAddLoanPerson'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_Chapagaun Lalitpur SBL0'), 
    '7', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_LoanOfferedDate'), 
    '2018/8/24')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Accepted Loans'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term'), 
    'Personal Term Loan', false)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Pur_1'), 
    'विभिन्न प्रयोजनका लागि ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Amo'), 
    '1400000')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Int'), 
    '3.3')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Ser'), 
    '5')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Exp'), 
    '3')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails0.Mor'), 
    '5')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term_1'), 
    'Personal Overdraft Loan', false)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Pur_1'), 
    'ब्याबसाहिक ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Amo'), 
    '400000')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Int'), 
    '2')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Ser'), 
    '5')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Fai'), 
    '50')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Exp'), 
    '2020/6/3')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails1.Mor'), 
    '2')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term_2'), 
    'Short Term Loan (PSLN)', false)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Pur_1'), 
    'ब्याबसाहिक ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Amo'), 
    '300000')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Int'), 
    '2')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Ser'), 
    '4')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Fai'), 
    '50')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Exp'), 
    '3')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails2.Mor'), 
    '3')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_--Select--Personal Term_3'), 
    'Home Loan', false)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Pur'), 
    'Housing Purpose')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Pur_1'), 
    'आवास ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Amo'), 
    '3000000')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Int'), 
    '5.5')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Ser'), 
    '5')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Fai'), 
    '50')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Exp'), 
    '7')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_AcceptedLoanDetails3.Mor'), 
    '5')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Previous Loans'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Ban'), 
    'पभु')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak'), 
    '२००४/७/४')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Loa'), 
    'उद्योग')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PreviousLoanDetails0.Bak_1'), 
    '400000')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Bail Persons'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra'), 
    '1355', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_1'), 
    '1337', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_2'), 
    '1358', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_3'), 
    '1340', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Guardians'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_4'), 
    '1361', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_5'), 
    '1340', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Collateral Detail'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.KittaNu'), 
    '२३४५')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.AreaInN'), 
    '३-६-१')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address'), 
    'बालकोट ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_1'), 
    '6')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.Address_2'), 
    'घ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_6'), 
    '1355', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.KittaNu'), 
    '५६८४')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.AreaInN'), 
    '७-१-५')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_----.._1'), 
    'व.मी.', true)

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address'), 
    'गोकर्ण ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_1'), 
    '5')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.Address_2'), 
    'घ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails1.MalpotA'), 
    'गोकर्ण, काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_7'), 
    '1337', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.KittaNu'), 
    '६७९६')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.AreaInN'), 
    '७-३-२')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_----.._2'), 
    'बिगाहा', true)

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_2'), 
    'Bara', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address'), 
    'अमृतगंज')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_1'), 
    '2')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.Address_2'), 
    'घ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails2.MalpotA'), 
    'अमृतगंज, बारा ')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_8'), 
    '1365', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.KittaNu'), 
    '५६३२')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.AreaInN'), 
    '५-२-१')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_----.._3'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_3'), 
    'Darchula', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address'), 
    'लटिनाथ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address_1'), 
    '6')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.Address_2'), 
    'घ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_PropertyDetails3.MalpotA'), 
    'लटिनाथ, दार्चुला ')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --Father- Pra_9'), 
    '1343', true)

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Witness'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.FirstNameWith'), 
    'Kisor ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.LastNameWithn'), 
    'Thapa')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.FirstNameWith_1'), 
    'किशोर')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.LastNameWithn_1'), 
    'थापा')

WebUI.selectOptionByValue(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/select_-- select --AchhamArgha_4'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.Address.Munic'), 
    'सुर्यविनायक ')

WebUI.setText(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Witnesses0.Address.WardN'), 
    '7')

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Document Prepared By'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Load Current User'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/a_Required Reports  Save'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('kyc Personal Loan Entry for multiple customer/Page_Add Edit Loan Entry - Details/input_btn btn-success col-md-1'))

