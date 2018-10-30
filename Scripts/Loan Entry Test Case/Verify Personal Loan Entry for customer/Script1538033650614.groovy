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

WebUI.click(findTestObject('KYC Customer Loan Entry/Customer_Nav/a_Customers'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Page_Customer Loan  Entry - Button links/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Page_Customer Loan  Entry - Button links/button_Create'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Head Office 999BIRGUNJ'), '8', 
    true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_LoanOfferedDate'), '2018/9/28')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_ServiceCharge'), '200')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Facilities'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Personal Term'), 'Personal Term Loan', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi'), '1', 
    true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Pur'), 'Business Purpose')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Pur_1'), 'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Ser'), '5')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Com'), '30000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Exp'), '4')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Fai'), '50')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Int'), '5.4')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Amo'), '1100000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails0.Mor'), '6')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Personal Term_1'), 
    'Hire Purchase Loan', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Vehicle'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi_1'), 
    '2', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Pur'), 'Auto Purpose')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Pur_1'), 'सवारी साधन')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Ser'), '4.4')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Com'), '20000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Exp'), '2020/4/6')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Fai'), '40')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Fai_1'), '45')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Int'), '6.6')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Amo'), '1400000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails1.Mor'), '4')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Personal Term_2'), 
    'Personal Overdraft Loan', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Fixed Deposit'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi_2'), 
    '3', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Pur'), 'Business Purpose')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Pur_1'), 'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Ser'), '5.2')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Com'), '50000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Exp'), '5')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Fai'), '55')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Int'), '4.4')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Amo'), '900000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails2.Mor'), '4')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Personal Term_3'), 
    'Education Loan', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Land  Building'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi_3'), 
    '1', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Fixed Deposit'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi_3'), 
    '3', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Pur'), 'Education Purpose')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Pur_1'), 'शैक्षिक')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Ser'), '6.3')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Com'), '60000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Exp'), '2026/5/8')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Fai'), '40')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Fai_1'), '50')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Int'), '7.1')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Amo'), '2500000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails3.Mor'), '7')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Personal Term_4'), 
    'Bank Guarantee (BG)', false)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Fixed Deposit'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Land  BuildingVehicleFi_4'), 
    '3', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Pur'), 'Business Purpose')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Pur_1'), 'ब्यबसाहिक')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Ser'), '4.1')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Com'), '45000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Exp'), '5')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Fai'), '30')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Int'), '5.3')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Amo'), '220000')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_AcceptedLoanDetails4.Mor'), '4')

WebUI.click(findTestObject('Loan Entry Guarantors/a_Guarantors'))

WebUI.click(findTestObject('Loan Entry Guarantors/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri'), '325066', 
    false)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Guardians'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_2'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_1'), 
    '325069', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Collateral Detail'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.KittaNu'), '२१२३')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.AreaInN'), '२-४-१')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_----..'), 'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --AchhamArgha'), 'Bhaktapur', 
    true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.Address'), 'Balkot')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.Address_1'), 'बालकोट')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.Address_2'), '4')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.Address_3'), 'घ')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails0.MalpotA'), 'आदर्श, भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_2'), 
    '325066', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_3'))

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.KittaNu'), '२२३१')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.AreaInN'), '५-२-१')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_----.._1'), 'रोपनी', true)

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.Address'), 'Koteshwor')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.Address_1'), 'कोटेश्वोर ')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.Address_2'), '6')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.Address_3'), 'घ')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_PropertyDetails1.MalpotA'), 'कोटेश्वोर, काठमाडौँ')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_3'), 
    '325072', true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Vehicles'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_4'))

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_VehicleDetails0.Registre'), 'बागमती')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_VehicleDetails0.EngineNo'), '321312312')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_VehicleDetails0.ChessisN'), 'H1223132132')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_VehicleDetails0.ModelNo'), 'Alto')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_VehicleDetails0.Registra'), 'बा २ ख २३३२')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Deposits'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails0.Acc'), '2213132')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_4'), 
    '325066', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails0.FDR'), '३३३४')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails0.Amo'), '23424')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails0.Rat'), '4.6')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails0.Mat'), '2018/9/28')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_5'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_FixedSavingCurrent'), 'Saving', 
    true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails1.Acc'), '23112')

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_5'), 
    '325069', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails1.FDR'), '५४३४')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails1.Amo'), '23471')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails1.Rat'), '5.3')

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_FixedDepositDetails1.Mat'), '2018/9/28')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Shares'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_6'), 
    '325066', true)

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Agricultural'), '14', 
    true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_ShareDetails0.ShareNumbe'), '11321')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_7'), 
    '325069', true)

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Agricultural _1'), 
    '8', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_ShareDetails1.ShareNumbe'), '23234')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_glyphicon glyphicon-plus Dyn_6'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_-- select --Father- Kri_8'), 
    '325072', true)

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_--Select--Agricultural _2'), 
    '49', true)

WebUI.setText(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_ShareDetails2.ShareNumbe'), '23213')

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Document Prepared By'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Load Current User'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Reports  Save'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_Is1PersentRequired'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/input_Is10MillionReportRequire'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/button_Nothing selected'))

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter Of Agreement'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfAgreement', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter Of Continuity'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfContinuity', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Consent Letter To Blackli'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'ConsentLetterToBlacklist', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Declaration form 10 Million'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'DeclarationForm10MIII', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LoanDeedIndividual', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Malpot Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'MalpotLetter', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Mortgage Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'MortgageDeed', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Multiple Banking Declarat'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'MultipleBankingDeclarationNRB2_6', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Offer Letter'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'OfferLetter', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_PG Third Party'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'PGThirdParty', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Promissory Note'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'PromissoryNote', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Authorization To Parents'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'AuthorizationToParents', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Education Loan Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'EducationLoanDeed', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Offer Letter Education'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'OfferLetterEducation', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Debit Authority From Borrowe'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'DebitAuthorityFromBorrower', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Hire Purchase Agreement Deed'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'AgreementDeedHirePurchaseIndividual', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/span_Individual Manjurinama To'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'IndividualManjurinamaToSellTheVehicleDirectlyByBank', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Confirmation of Lien On FDR'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'ConfirmationOfLienOnFdr', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter of Set-Off for other'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfSetOffForOtherAccounts', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter of Undertaking - 100'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfUndertaking100CashMargin', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter of Undertaking FD'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfUndertakingFd', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter of Set-Off FD'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfSetoffFd', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Offer Letter FD'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'OfferLetterFD', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Offer Letter Cash Margin'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'OfferLetterCashMargin', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Offer Letter Bank Guarantee'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'OfferLetterBankGuarantee', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Consent letter to blacklist'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'ConsentLetterToBlacklistPromoterShare', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Letter of Undertaking Share'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'LetterOfUndertakingShare', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Manjurinama for Demat Share'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'ManjurinamaForDmatShare', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Consent for not holding more'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'ConsentNotHoldingMoreThan50PromoterShare', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Share Pledge Aggrement First'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'SharePledgeAggrementFirstParty', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Share Pledge Aggrement Third'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'SharePledgeAggrementThirdParty', 
    true)

WebUI.click(findTestObject('KYC Customer Loan Entry/Loan Field Details/a_Individual Loan Deed Promoto'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Loan Entry/Loan Field Details/select_Letter Of AgreementLett'), 'IndividualLoanDeedPromotorShare', 
    true)

WebUI.click(findTestObject('New Customer and Loan Entry Save Button/button_Save'))

