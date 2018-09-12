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

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Page_Customer_Nav/a_Customer'))

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Page_Customer_Nav/a_Add Customer'))

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_CustomerID'), 'P136')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_AccountNo'), 'S5612')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FullName'), 'Supriya Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FullNameN'), 'सुप्रिया थापा ')

WebUI.click(findTestObject('Customer Gender Section/input_PersonalDetail.Gender_Female'))

WebUI.click(findTestObject('Customer Mariatal Status/input_PersonalDetail.MarritalS_Married'))

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.DOBEnglis'), '1992/6/2')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.DOBNepali'), '२०४९/६/२')

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --AchhamArgha'), 'Bhaktapur', 
    true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Permanent'), 'Suryabinayak')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Permanent_1'), 'सुर्यविनायक ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Permanent_2'), '5')

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Temporary'), 'Kageshwori')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Temporary_1'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Temporary_2'), '13')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Identific'), '११३१/५६७१')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Citizen_Issued_Place/input_PersonalDetail.Identific'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Identific_1'), 'भक्तपुर ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.Identific_2'), '२०६५/७/१')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe'), 'Father', 
    true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet'), 'Manoj Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_1'), 'मनोज थापा')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_2'), '१२१३/८१२१')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_3'), '1920/3/1')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_4'), '२०२०/५/७')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_5'), '२०४०/६/४')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_Issued_Place/input_PersonalDetail.FamilyDet'), 
    'ई.प्र.शा.')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_6'), 'भक्तपुर ')

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --AchhamArgha_2'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_7'), 'Suryabinayak')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_8'), 'सुर्यविनायक ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_9'), '5')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation_Copy_Address/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_1'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_10'), 'Kumar Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_11'), 'कुमार थापा')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_2'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_12'), 'Sanu Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_13'), 'सानु थापा')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_3'), 
    'Father In Law', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_14'), 'Kabi Raj Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_15'), 'कबि राज थापा')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_16'), '४२१४/१५६१')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_17'), '1919/4/2')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_18'), '२०१९/४/७')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_19'), '२०३९/५/७')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_IPlace_1/input_PersonalDetail.FamilyDet_1'), 
    'ई.प्र.शा.')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_20'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --AchhamArgha_3'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_21'), 'Kageshwori')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_22'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_23'), '13')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation_Copy_Address_1/a_Copy as Permanent_1'))

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_4'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_24'), 'Tika Bahadur Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_25'), 'टिका बहादुर थापा ')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_5'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_26'), 'Yagya Bahadur Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_27'), 'यज्ञ बहादुर थापा ')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_6'), 
    'Spouse', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_28'), 'Bikram Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_29'), 'बिक्रम थापा ')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_30'), '१३२३/७८८९')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_31'), '1992/3/31')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_32'), '२०४८/१२/१८')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_33'), '२०६५/५/६')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_IPlace_2/input_PersonalDetail.FamilyDet_2'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_34'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --AchhamArgha_4'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_35'), 'Kageshwori')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_36'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_37'), '13')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation_Copy_Address_2/a_Copy as Permanent_2'))

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_7'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_38'), 'Kabi Raj Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_39'), 'कबि राज थापा')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC Female Customer/Page_Customer_Details/select_-- select --Grand Fathe_8'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_40'), 'Tika Bahadur Thapa')

WebUI.setText(findTestObject('KYC Female Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_41'), 'टिका बहादुर थापा ')

WebUI.click(findTestObject('KYC Female Customer/Page_Customer_Details/input_btn btn-success col-md-1'))

