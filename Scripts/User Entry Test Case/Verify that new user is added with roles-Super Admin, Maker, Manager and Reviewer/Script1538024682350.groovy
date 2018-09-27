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

WebUI.click(findTestObject('KYC New User /Page_Dashboard - Loan Reports Autom/a_Security'))

WebUI.click(findTestObject('KYC New User /Page_Dashboard - Loan Reports Autom/a_Add User'))

WebUI.selectOptionByValue(findTestObject('KYC New User /Page_Register - Loan Reports Automa/select_--Select--Head Office 9'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('KYC New User /Page_Register - Loan Reports Automa/select_Super AdminMakerManager'), 
    'Maker', true)

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_Username'), 
    'prekshya')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_Password'), 
    'prekshya123')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_ConfirmPassword'), 
    'prekshya123')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.FullName'), 
    'Prekshya Basnet')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.FullNameNepal'), 
    'प्रेक्ष्या बस्नेत')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Designation'), 
    'Maker')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.DesignationNe'), 
    'मेकर')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Identificatio'), 
    '2123/4567')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Identificatio_1'), 
    '२१२३/४५६७')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Identificatio_2'), 
    '2002/3/5')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Identificatio_3'), 
    '२०५०/७/३')

WebUI.sendKeys(findTestObject('User Citizenship Issued Place/Clear(Clear text) and Use new Place(Send Keys)/input_PersonalDetail.Identific'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_UserDetail.Identificatio_4'), 
    'काठमाडौँ ')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('KYC New User /Page_Register - Loan Reports Automa/input_btn btn-success'), 
    30)

