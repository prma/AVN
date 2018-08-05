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

WebUI.callTestCase(findTestCase('Main Login Test Cases/TC1_Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KYC New Branch/Page_Branch Page - Loan Reports Autom/a_Branch'))

WebUI.click(findTestObject('KYC New Branch/Page_Branch Page - Loan Reports Autom/a_Add Branch'))

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_ManagerName'), 
    'Dipesh kc')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_ManagerNameNepali'), 
    'दिपेश  केसि')

WebUI.selectOptionByValue(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/select_-- select --AchhamArgha'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_Address.MunicipalityVDC'), 
    'Kathmandu')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_Address.MunicipalityVDCN'), 
    'काठमाडौँ ')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_Address.WardNo'), 
    '7')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_Address.Tole'), 
    'Pepsicola')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_Address.ToleInNepali'), 
    'पेप्सीकोला ')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_BranchCode'), 'SBL619')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_BranchCodeInNepali'), 
    'एसबिएल६१९')

WebUI.setText(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_ContactNumber'), 
    '016617843')

WebUI.click(findTestObject('Object Repository/KYC New Branch/Page_Branch Detail - Loan Reports A/input_btn btn-success'))

