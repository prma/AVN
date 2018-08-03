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

WebUI.sendKeys(findTestObject('KYC Login Page/input_Username'), 'admin')

WebUI.sendKeys(findTestObject('KYC Login Page/input_Password'), 'pass@word1')

WebUI.click(findTestObject('KYC Login Page/button_Login'))

WebUI.click(findTestObject('KYC Customer/Page_Customer Page - Loan Reports Autom/a_Customer'))

WebUI.click(findTestObject('KYC Customer/Page_Customer Page - Loan Reports Autom/a_Add Customer'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.CustomerI'), 
    'CX128')

WebUI.click(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/form_Personal Detail ( )'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.AccountNo'), 
    'BH4611')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.FirstName'), 
    'Bharat')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.LastName'), 
    'Basnet')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.FirstName_1'), 
    'भरत ')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.LastNameN'), 
    'बस्नेत ')

WebUI.click(findTestObject('Customer Gender Section/input_PersonalDetail.Gender_Male'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.DOBEnglis'), 
    '1992/4/2')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.DOBNepali'), 
    '२०४९/२/७')

WebUI.click(findTestObject('Customer Mariatal Status/input_PersonalDetail.MarritalS_Married'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/select_-- select --AchhamArgha'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PermanentAddress.Municip'), 
    'Balkot')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PermanentAddress.Municip_1'), 
    'बालकोट ')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PermanentAddress.WardNo'), 
    '7')

WebUI.click(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/a_Copy as Permanent'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.Identific'), 
    '9879')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.Identific_1'), 
    '९८७९')

WebUI.clearText(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Personal Citizenship issued/input_PersonalDetail.Identific'))

WebUI.click(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Personal Citizenship issued/li_pcgrihamantralaya'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.Identific_2'), 
    'भक्तपुर ')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.Identific_3'), 
    '2008/3/5')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_PersonalDetail.Identific_4'), 
    '२०६६/६/४')

WebUI.click(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/select_-- select --Grand Fathe'), 
    'Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.FullName'), 
    'Umit Basnet')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.FullNameN'), 
    'उमित बस्नेत ')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.Identific'), 
    '51251')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.Identific_1'), 
    '५१२५१')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.Identific_2'), 
    '1960/3/6')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.Identific_3'), 
    '२०५०/५/७')

WebUI.clearText(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Individual Family Citizenship issued/input_FamilyDetails0.Identific'))

WebUI.click(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Individual Family Citizenship issued/li_ciprasa'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails0.Identific_4'), 
    'भक्तपुर ')

WebUI.click(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/select_-- select --Grand Fathe_1'), 
    'Grand Father', true)

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.FullName'), 
    'Hira Basnet')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.FullNameN'), 
    'हिरा बस्नेत ')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.Identific'), 
    '24111')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.Identific_1'), 
    '२४१११')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.Identific_2'), 
    '1930/3/4')

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.Identific_3'), 
    '२०२०/३/६')

WebUI.clearText(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Individual Family Citizenship issued/input_FamilyDetails0.Identific'))

WebUI.click(findTestObject('KYC Customer/Page_Individual KYC - Loan Reports/Page_Individual Family Citizenship issued/li_ncjipraka'))

WebUI.setText(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_FamilyDetails1.Identific_4'), 
    'भक्तपुर ')

WebUI.click(findTestObject('Object Repository/KYC Customer/Page_Individual KYC - Loan Reports/input_btn btn-success col-md-1'))

