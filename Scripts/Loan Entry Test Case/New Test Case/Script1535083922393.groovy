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

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Home Page - Loan Reports Autom/a_Customer'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Home Page - Loan Reports Autom/a_Customers'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Customer Entry - Loan Reports/a_glyphicon glyphicon-plus lnk'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Customer Entry - Loan Reports/button_Create'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/a_Required Reports  Save'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/span_caret'))

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/span_glyphicon glyphicon-ok ch'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/select_Letter Of AgreementLett'), 
    'LetterOfAgreement', true)

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/span_glyphicon glyphicon-ok ch'))

WebUI.deselectOptionByValue(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/select_Letter Of AgreementLett'), 
    'AuthorizationToParents', true)

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/span_glyphicon glyphicon-ok ch'))

WebUI.deselectOptionByValue(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/select_Letter Of AgreementLett'), 
    'EducationLoanDeed', true)

WebUI.click(findTestObject('Object Repository/New Test Purpose/Page_Add Edit Loan Entry - Loan Rep/input_btn btn-success col-md-1'))

