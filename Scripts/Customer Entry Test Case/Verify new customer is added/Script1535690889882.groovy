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

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_CustomerID'), 'SM624')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_AccountNo'), 'SM516')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FullName'), 'Suman Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FullNameN'), 'सुमन थापा ')

WebUI.click(findTestObject('Customer Gender Section/input_PersonalDetail.Gender_Male'))

WebUI.click(findTestObject('Customer Mariatal Status/input_PersonalDetail.MarritalS_Unmarried'))

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.DOBEnglis'), '1992/3/28')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.DOBNepali'), '२०४७/६/६')

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --AchhamArgha'), 'Kathmandu', 
    true)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Permanent'), 'Kageshwori')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Permanent_1'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Permanent_2'), '6')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_Copy as Permanent'))

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Identific'), '५४२१/१४२१')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Citizen_Issued_Place/input_PersonalDetail.Identific'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Identific_1'), 'काठमाडौँ ')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.Identific_2'), '२०६५/५/३')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --Grand Fathe'), 'Father', 
    false)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet'), 'Krishna Hari Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_1'), 'कृष्ण हरि थापा ')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_2'), '५१२१/१४२१')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_3'), '1930/3/2')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_4'), '२०२५/६/७')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_5'), '२०४०/५/७')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_Issued_Place/input_PersonalDetail.FamilyDet'), 
    'ई.प्र.शा.')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_6'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --AchhamArgha_1'), 'Kathmandu', 
    true)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_7'), 'Kageshwori')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_8'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_9'), '6')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation_Copy_Address/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --Grand Fathe_1'), 'Father', 
    false)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_10'), 'Tika Bahadur Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_11'), 'टिका बहादुर थापा ')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --Grand Fathe_2'), 'Grand Father', 
    false)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_12'), 'Yagya Bahadur Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_13'), 'यज्ञ बहादुर थापा ')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Family_Plus/select_-- select --Grand Fathe'), 'Grand Father', 
    false)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_14'), 'Tika Bahadur Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_15'), 'टिका बहादुर थापा ')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_16'), '१२१३/५२११')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_17'), '1910/3/2')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_18'), '२०१०/५/३')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_19'), '२०३०/५/५')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_IPlace_1/input_PersonalDetail.FamilyDet_1'), 
    'गृह मन्त्रालय')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_20'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --AchhamArgha_2'), 'Kathmandu', 
    true)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_21'), 'Kageshwori')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_22'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_23'), '6')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation_Copy_Address_1/a_Copy as Permanent_1'))

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --Grand Fathe_4'), 'Father', 
    true)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_24'), 'Yagya Bahadur Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_25'), 'यज्ञ बहादुर थापा ')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/a_glyphicon glyphicon-plus Dyn_1'))

WebUI.selectOptionByValue(findTestObject('KYC New Customer/Page_Customer_Details/select_-- select --Grand Fathe_5'), 'Grand Father', 
    true)

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_26'), 'Mohan Bahadur Thapa')

WebUI.setText(findTestObject('KYC New Customer/Page_Customer_Details/input_PersonalDetail.FamilyDet_27'), 'मोहन बहादुर थापा')

WebUI.click(findTestObject('KYC New Customer/Page_Customer_Details/input_btn btn-success col-md-1'))

