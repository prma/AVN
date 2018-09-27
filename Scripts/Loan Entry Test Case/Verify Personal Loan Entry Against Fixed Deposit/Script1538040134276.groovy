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

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Customer_Nav/a_Customer'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Customer_Nav/a_Customers'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Customer Entry - Button Links/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Customer Entry - Button Links/button_Create'))

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_ServiceCharge'), 
    '150')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_LoanOfferedDate'), 
    '2018/9/28')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Head Office 999BIRGUNJ'), 
    '8', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Facilities'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term'), 
    'Personal Term Loan', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/span_Fixed Deposit'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi'), 
    '3', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur_1'), 
    'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Ser'), 
    '6')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Com'), 
    '60000')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Exp'), 
    '2024/6/2')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Fai'), 
    '50')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Int'), 
    '5')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Amo'), 
    '1500000')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Mor'), 
    '6')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Bail Persons'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man'), 
    '325083', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Guardians'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_1'), 
    '325089', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_2'), 
    '325092', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.KittaNu'), 
    '१२१३')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.AreaInN'), 
    '३-३-४')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --AchhamArgha'), 
    'Bara', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address'), 
    'Beldari')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_1'), 
    'बेल्दारी')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_2'), 
    '6')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_3'), 
    'घ')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.MalpotA'), 
    'बेल्दारी')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_3'), 
    '325083', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.KittaNu'), 
    '२३२२')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.AreaInN'), 
    '४-२-१')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_----.._1'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --AchhamArgha_1'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address'), 
    'Suryabinayak')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_1'), 
    'सुर्यविनायक')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_2'), 
    '5')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.Address_3'), 
    'घ')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails1.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_4'), 
    '325089', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Deposits'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Acc'), 
    '23452')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_5'), 
    '325083', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.FDR'), 
    '४३३४')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Amo'), 
    '43342')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Rat'), 
    '5.7')

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Mat'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Shares'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_6'), 
    '325083', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural'), 
    '18', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_ShareDetails0.ShareNumbe'), 
    '1212')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_7'), 
    '325086', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _1'), 
    '8', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_ShareDetails1.ShareNumbe'), 
    '4354')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_8'), 
    '325089', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _2'), 
    '61', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_ShareDetails2.ShareNumbe'), 
    '5644')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Man_9'), 
    '325092', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _3'), 
    '73', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_ShareDetails3.ShareNumbe'), 
    '3211')

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Reports  Save'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Letter Of Agreement'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfAgreement', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Letter Of Continuity'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfContinuity', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/span_Consent Letter To Blackli'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklist', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Declaration form 10 Million'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'DeclarationForm10MIII', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LoanDeedIndividual', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Malpot Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MalpotLetter', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Mortgage Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MortgageDeed', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Multiple Banking Declaration'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MultipleBankingDeclarationNRB2_6', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Offer Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetter', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_PG Third Party'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PGThirdParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Promissory Note'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PromissoryNote', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Confirmation of Lien On FDR'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConfirmationOfLienOnFdr', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingFd', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Letter of Set-Off FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfSetoffFd', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Offer Letter FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterFD', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Consent letter to blacklist'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklistPromoterShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking Share'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Manjurinama for Demat Share'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ManjurinamaForDmatShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/span_Consent for not holding m'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentNotHoldingMoreThan50PromoterShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Share Pledge Aggrement First'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementFirstParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Share Pledge Aggrement Third'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementThirdParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/a_Individual Loan Deed Promoto'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'IndividualLoanDeedPromotorShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Fixed Deposit/Page_Add Edit Loan Entry -Field Details/input_Submit'))

