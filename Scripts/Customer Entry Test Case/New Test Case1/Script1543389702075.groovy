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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.setText(findTestObject('null'), 'admin')

WebUI.setEncryptedText(findTestObject('null'), 'WP62MBxx2i10hD8nP5g/mg==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.DOBEnglis'), 
    '1992/3/31')

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Address'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Document Detail'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Relationship'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_glyphicon glyphicon-plus Dyn'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Add more details...'))

WebUI.setText(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet'), 
    '1950/4/2')

WebUI.click(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_glyphicon glyphicon-plus Dyn'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Add more details...'))

WebUI.setText(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet_1'), 
    '1940/5/3')

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz_1'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_glyphicon glyphicon-plus Dyn'))

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/a_Add more details...'))

WebUI.setText(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet_2'), 
    '1920/4/2')

WebUI.click(findTestObject('Object Repository/Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz_1'))

