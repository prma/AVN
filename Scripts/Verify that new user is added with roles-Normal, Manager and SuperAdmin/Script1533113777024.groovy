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

WebUI.click(findTestObject('KYC New User/User Navigation/a_Security'))

WebUI.click(findTestObject('KYC New User/User Navigation/a_Add User'))

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_Username'), 'mahes1')

WebUI.selectOptionByValue(findTestObject('KYC New User/Role Global Value/select_NormalManagerSuperAdmin_roleManager'), 'Manager', 
    true)

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_Password'), 'mahesh123')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_ConfirmPassword'), 'mahesh123')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.FullName'), 'Mahesh Kumar Yadav')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.FullNameNepal'), 'महेश कुमार यादव ')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Designation'), 'Manager')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.DesignationNe'), 'म्यानेजर ')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio'), '4566')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio_1'), '४५६६')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio_2'), '2001/2/4')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio_3'), '२०४८/५/६')

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio_4'), '')

WebUI.clearText(findTestObject('User Citizenship Issued Place/Clear(Clear text) and Use new Place(Send Keys)/input_PersonalDetail.Identific'))

WebUI.click(findTestObject('User Citizenship Issued Place/li_grihamantralaya'))

WebUI.setText(findTestObject('KYC New User/User Field(Details) Section/input_UserDetail.Identificatio_5'), 'काठमाडौं  ')

WebUI.click(findTestObject('KYC New User/User Field(Details) Section/input_btn btn-success'))

