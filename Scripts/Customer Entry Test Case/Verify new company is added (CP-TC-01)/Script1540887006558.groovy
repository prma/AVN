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

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Dashboard - Loan Reports Autom/a_Customer'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Dashboard - Loan Reports Autom/a_Add Company'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_CustomerID'), 'COMP-62631')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_AccountNo'), '8718711')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Name'), 'Info Tech')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.NameNepali'), 
    'इन्फो टेक')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.PanNumber'), 
    'A12123317')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.NameChangedNepal'), 
    'क्लास्सिक टेक')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.NameChangedDateN'), 
    '२०६५/२/७')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Address'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Address.Municipa'), 
    'Gokarna')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Address.Municipa_1'), 
    ' गोकर्ण')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Address.WardNo'), 
    '5')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Address.Tole'), 
    'Sundarijal')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.Address.ToleInNe'), 
    'सुन्दरीजल')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Registration Detail'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationNumb'), 
    '२३३१-०१-२३')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationActF'), 
    'प्राईभेट फर्म रजिष्ट्रेशन ऐन २०१४ बमोजिम नेपाल सरकार, उद्योग मन्त्रालय, घरेलु तथा साना उद्योग विभाग, घरेलु तथा साना उद्योग विकास समितिको कार्यालय')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationActA'), 
    'प्राईभेट फर्म रजिष्ट्रेशन ऐन २०१७ बमोजिम नेपाल सरकार')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_Company.RegistrationDate'), 
    '२०६०/४/७')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Primary Authorized Person'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FullName'), 
    'Sudip Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FullNameN'), 
    'सुदिप थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Gender'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.MarritalS'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.DOBEnglis'), 
    '1990/3/1')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.DOBNepali (1)'), 
    '२०४५/५/७')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Address_1'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha_1'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Permanent'), 
    'Balkot')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Permanent_1'), 
    'बालकोट')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Permanent_2'), 
    '5')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Document Detail'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Identific'), 
    '२१३२/६७८१')

WebUI.sendKeys(findTestObject('KYC Company Adding (CP-TC-01)/Customer Document Details/input_PersonalDetail.Identific'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Identific_1'), 
    'भक्तपुर')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.Identific_2'), 
    '२०६४/६/७')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Relationship'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet'), 
    'Nabin Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_1'), 
    'नबिन थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Add more details...'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_2'), 
    '२११३/६७७१')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_3'), 
    '1940/3/2')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_4'), 
    '२०१०/६/८')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_5'), 
    '२०३०/६/७')

WebUI.sendKeys(findTestObject('KYC Company Adding (CP-TC-01)/Customer Family Document Detail/input_PersonalDetail.FamilyDet'), 
    'ई.प्र.शा.')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_6'), 
    'भक्तपुर')

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha_2'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_7'), 
    'Balkot')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_8'), 
    'बालकोट ')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_9'), 
    '7')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Related Person Copy Address/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_1'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_10'), 
    'Rakesh Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_11'), 
    'राकेश थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_2'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_12'), 
    'Suresh Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_13'), 
    'सुरेश थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_3'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_14'), 
    'Rakesh Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_15'), 
    'राकेश थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_Add more details...'))

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_16'), 
    '६७११/८१७१')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_17'), 
    '1910/3/2')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_18'), 
    '१९८०/७/८')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_19'), 
    '२००१/६/९')

WebUI.sendKeys(findTestObject('KYC Company Adding (CP-TC-01)/Customer Family Document Detail 2/input_PersonalDetail.FamilyDet2'), 
    'गृह मन्त्रालय')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_20'), 
    'भक्तपुर ')

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --AchhamArgha_3'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_21'), 
    'Balkot')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_22'), 
    'बालकोट ')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_23'), 
    '7')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Related Person Copy Address2/a_Copy as Permanent2'))

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_4'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_24'), 
    'Suresh Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_25'), 
    'सुरेश थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/select_-- select --Grand Fathe_5'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_26'), 
    'Rabin Thapa')

WebUI.setText(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/input_PersonalDetail.FamilyDet_27'), 
    'रबिन थापा')

WebUI.click(findTestObject('KYC Company Adding (CP-TC-01)/Page_Company KYC - Loan Reports Aut/button_Save'))

