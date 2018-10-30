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

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Customer_Nav/a_Customer'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Customer_Nav/a_Customers'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Customer Entry - Button Links/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Customer Entry - Button Links/button_Create'))

WebUI.setText(findTestObject('KYC Loan Entry Service Charge/input_ServiceCharge'), '150')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Head Office 999BIRGUNJ'), 
    '8', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_LoanOfferedDate'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Facilities'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_--Select--Personal Term'), 
    'Bank Guarantee (BG)', false)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Land  BuildingVehicleFi'), 
    '1', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur'), 
    'Business Purpose')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Pur_1'), 
    'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Ser'), 
    '5.1')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Com'), 
    '50000')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Exp'), 
    '2023/4/7')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Fai'), 
    '55')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Int'), 
    '6')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Amo'), 
    '1800000')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_AcceptedLoanDetails0.Mor'), 
    '4')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Bail Persons'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh'), 
    '325103', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Guardians'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_1'), 
    '325106', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_2'), 
    '325109', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.KittaNu'), 
    '३२३१')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.AreaInN'), 
    '४-५-१')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_----..'), 
    'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address'), 
    'Balkot')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_1'), 
    'बालकोट')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_2'), 
    '5')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.Address_3'), 
    'घ')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_PropertyDetails0.MalpotA'), 
    'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_3'), 
    '325103', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Deposits'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Acc'), 
    '33242')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_4'), 
    '325103', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.FDR'), 
    '३४२२२')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Amo'), 
    '32424')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Rat'), 
    '4.2')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails0.Mat'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_FixedSavingCurrent'), 
    'Saving', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Acc'), 
    '34232')

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_5'), 
    '325106', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.FDR'), 
    '४३२१')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Amo'), 
    '45321')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Rat'), 
    '5.2')

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_FixedDepositDetails1.Mat'), 
    '2018/9/28')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Shares'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_6'), 
    '325103', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural'), 
    '7', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_ShareDetails0.ShareNumbe'), 
    '121')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_7'), 
    '325106', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _1'), 
    '9', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_ShareDetails1.ShareNumbe'), 
    '213')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_-- select --Father- Abh_8'), 
    '325109', true)

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_--Select--Agricultural _2'), 
    '60', true)

WebUI.setText(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_ShareDetails2.ShareNumbe'), 
    '112')

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Reports  Save'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Letter Of Agreement'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfAgreement', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Letter Of Continuity'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfContinuity', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Consent Letter To Blackli'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklist', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Declaration form 10 Milli'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'DeclarationForm10MIII', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LoanDeedIndividual', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Malpot Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MalpotLetter', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Mortgage Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MortgageDeed', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Multiple Banking Declarat'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'MultipleBankingDeclarationNRB2_6', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Offer Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetter', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_PG Third Party'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PGThirdParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Promissory Note'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'PromissoryNote', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Confirmation of Lien On FDR'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConfirmationOfLienOnFdr', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Letter of Set-Off for oth'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfSetOffForOtherAccounts', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Letter of Undertaking - 1'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertaking100CashMargin', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Letter of Undertaking FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingFd', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Letter of Set-Off FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfSetoffFd', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Offer Letter FD'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterFD', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Offer Letter Cash Margin'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterCashMargin', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Offer Letter Bank Guarantee'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'OfferLetterBankGuarantee', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Consent letter to blackli (1)'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentLetterToBlacklistPromoterShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Letter of Undertaking Share'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'LetterOfUndertakingShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Manjurinama for Demat Share'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ManjurinamaForDmatShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Consent for not holding m'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'ConsentNotHoldingMoreThan50PromoterShare', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/a_Share Pledge Aggrement First'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementFirstParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Share Pledge Aggrement Th'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'SharePledgeAggrementThirdParty', true)

WebUI.click(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/span_Individual Loan Deed Prom'))

WebUI.selectOptionByValue(findTestObject('KYC Loan Entry Against Bank Guarantee/Page_Add Edit Loan Entry -Field Details/select_Letter Of AgreementLett'), 
    'IndividualLoanDeedPromotorShare', true)

WebUI.click(findTestObject('New Customer and Loan Entry Save Button/button_Save'))

