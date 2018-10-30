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

WebUI.click(findTestObject('Latest Customer Links Button/a_Customer'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Customer Nav/a_Customers'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Customer Loan Entry - Button Links/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Customer Loan Entry - Button Links/button_Create'))

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_LoanOfferedDate'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Facilities'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term'), 
    'Personal Term Loan', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi'), 
    '1', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Other Accounts'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi'), 
    '4', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur_1'), 
    'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Ser'), 
    '4.4')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Com'), 
    '400000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Exp'), 
    '2023/4/5')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Int'), 
    '4')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Amo'), 
    '500000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Mor'), 
    '5')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term_1'), 
    'Short Term Loan (PSLN)', false)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi_1'), 
    '1', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Pur_1'), 
    'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Ser'), 
    '5.5')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Com'), 
    '50000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Exp'), 
    '2024/5/7')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Fai'), 
    '46')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Int'), 
    '5')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Amo'), 
    '60000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails1.Mor'), 
    '4')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term_2'), 
    'Home Loan', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Share'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi_2'), 
    '5', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Pur'), 
    'Housing Purpose')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Pur_1'), 
    'घर कर्जा')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Ser'), 
    '6.6')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Com'), 
    '60000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Exp'), 
    '4')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Fai'), 
    '50')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Int'), 
    '6')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Amo'), 
    '5500000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails2.Mor'), 
    '6')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term_3'), 
    'Education Loan', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/button_Nothing selected'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi_3'), 
    '1', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Fixed Deposit'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi_3'), 
    '3', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Pur'), 
    'Education Purpose')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Pur_1'), 
    'शैक्षिक')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Ser'), 
    '7.1')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Com'), 
    '70000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Exp'), 
    '6')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Fai'), 
    '60')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Fai_1'), 
    '65')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Int'), 
    '7')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Amo'), 
    '3000000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails3.Mor'), 
    '7')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Previous Loans'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PreviousLoanDetails0.Ban'), 
    'प्रभु')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PreviousLoanDetails0.Bak'), 
    '२००६/६/३')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PreviousLoanDetails0.Loa'), 
    'उद्योग')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PreviousLoanDetails0.Bak_1'), 
    '500000')

WebUI.click(findTestObject('Loan Entry Guarantors/a_Guarantors'))

WebUI.click(findTestObject('Loan Entry Guarantors/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap'), 
    '325093', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_1'), 
    '325073', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Guardians'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_2'), 
    '325096', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_3'), 
    '325076', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.KittaNu'), 
    '१३२३')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.AreaInN'), 
    '४-२-५')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address'), 
    'Kausaltar')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_1'), 
    'कौसलटार')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_2'), 
    '6')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_3'), 
    'घ')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_4'), 
    '325093', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.KittaNu'), 
    '४५६७')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.AreaInN'), 
    '९-३-३')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_----.._1'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --AchhamArgha_1'), 
    'Nuwakot', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address'), 
    'Belkot')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_1'), 
    'बेल्कोट')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_2'), 
    '6')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_3'), 
    'ग')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.MalpotA'), 
    'बेल्कोट ')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_5'), 
    '325073', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Deposits'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Acc'), 
    '212312')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_6'), 
    '325093', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.FDR'), 
    '३३४१')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Amo'), 
    '400000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Rat'), 
    '4.4')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Mat'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_FixedSavingCurrent'), 
    'Current', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Acc'), 
    '214521')

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_7'), 
    '325073', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.FDR'), 
    '३४२२')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Amo'), 
    '50000')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Rat'), 
    '5.5')

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Mat'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Shares'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_8'), 
    '325093', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural'), 
    '15', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_ShareDetails0.ShareNumbe'), 
    '3211')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_9'), 
    '325102', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _1'), 
    '41', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_ShareDetails1.ShareNumbe'), 
    '4533')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_10'), 
    '325073', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _2'), 
    '61', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_ShareDetails2.ShareNumbe'), 
    '4343')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Kap_11'), 
    '325082', true)

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _3'), 
    '73', true)

WebUI.setText(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_ShareDetails3.ShareNumbe'), 
    '2321')

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Reports  Save'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter Of Agreement'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfAgreement', false)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter Of Continuity'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfContinuity', false)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Consent Letter To Blackli'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklist', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Declaration form 10 Milli'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'DeclarationForm10MIII', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LoanDeedIndividual', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Malpot Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MalpotLetter', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Mortgage Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MortgageDeed', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Multiple Banking Declarat'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MultipleBankingDeclarationNRB2_6', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Offer Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetter', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_PG Third Party'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PGThirdParty', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Promissory Note'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PromissoryNote', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Authorization To Parents'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'AuthorizationToParents', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Education Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'EducationLoanDeed', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Offer Letter Education'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterEducation', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Debit Authority From Borrowe'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'DebitAuthorityFromBorrower', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Hire Purchase Agreement Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'AgreementDeedHirePurchaseIndividual', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Individual Manjurinama To'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'IndividualManjurinamaToSellTheVehicleDirectlyByBank', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Confirmation of Lien On FDR'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConfirmationOfLienOnFdr', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter of Set-Off for other'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfSetOffForOtherAccounts', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking - 100'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertaking100CashMargin', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking FD'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingFd', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter of Set-Off FD'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfSetoffFd', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Offer Letter FD'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterFD', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Offer Letter Cash Margin'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterCashMargin', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Offer Letter Bank Guarantee'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterBankGuarantee', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Consent letter to blacklist'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklistPromoterShare', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking Share'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingShare', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Manjurinama for Demat Share'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ManjurinamaForDmatShare', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/span_Consent for not holding m'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentNotHoldingMoreThan50PromoterShare', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Share Pledge Aggrement First'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementFirstParty', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Share Pledge Aggrement Third'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementThirdParty', true)

WebUI.click(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/a_Individual Loan Deed Promoto'))

WebUI.selectOptionByValue(findTestObject('KYC Multiple Customer Loan Entry/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'IndividualLoanDeedPromotorShare', true)

WebUI.click(findTestObject('New Customer and Loan Entry Save Button/button_Save'))

