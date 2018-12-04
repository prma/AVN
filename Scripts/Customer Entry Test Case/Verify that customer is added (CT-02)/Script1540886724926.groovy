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

WebUI.click(findTestObject('Latest Customer Links Button/a_Add Individual'))

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_CustomerID'), '5474322')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_AccountNo'), '3445245532')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FullName'), 'Swopna Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FullNameN'), 'स्वोप्न बस्नेत')

WebUI.click(findTestObject('Customer Gender Section/input_PersonalDetail.Gender_Male'))

WebUI.click(findTestObject('Customer Mariatal Status/input_PersonalDetail.MarritalS_Unmarried'))

WebUI.setText(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.DOBEnglis'), 
    '1992/8/4')

WebUI.click(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz'))

WebUI.click(findTestObject('Customer Entry All Dynamic Tab Fields/a_Address'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --AchhamArgha'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Permanent'), 'Koteshwor')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Permanent_1'), 'कोटेश्वोर ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Permanent_2'), '4')

WebUI.click(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/a_Copy as Permanent'))

WebUI.click(findTestObject('Customer Entry All Dynamic Tab Fields/a_Document Detail'))

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Identific'), '३२१४/१२५१')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Citizen_Issued_Place/input_PersonalDetail.Identific'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Identific_1'), 'काठमाडौँ ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.Identific_2'), '२०६५/४/५')

WebUI.click(findTestObject('Customer Entry All Dynamic Tab Fields/a_Relationship'))

WebUI.click(findTestObject('Customer Entry All Dynamic Tab Fields/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet'), 'Kapil Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_1'), 'कपिल बस्नेत')

WebUI.click(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_2'), '१२१३/४२१५')

WebUI.setText(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet'), 
    '1930/4/2')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz_1'), 
    30)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_5'), '२०४०/५/६')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_Issued_Place/input_PersonalDetail.FamilyDet'), 
    'ई.प्र.शा.')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_6'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --AchhamArgha_1'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_7'), 'Koteshwor')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_8'), 'कोटेश्वोर ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_9'), '4')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation Copy/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_1'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_10'), 'Shyam Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_11'), 'श्याम बस्नेत')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_2'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_12'), 'Pramesh Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_13'), 'प्रमेश बस्नेत')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('Customer Entry All Dynamic Tab Fields/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.delay(20)

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_3'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_14'), 'Shyam Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_15'), 'श्याम बस्नेत')

WebUI.click(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_16'), '१४१२/५२११')

WebUI.setText(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet_1'), 
    '1910/2/1')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz_1'), 
    30)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_19'), '२०१५/५/७')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_IPlace_1/input_PersonalDetail.FamilyDet_1'), 
    'गृह मन्त्रालय')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_20'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --AchhamArgha_2'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_21'), 'Koteshwor')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_22'), 'कोटेश्वोर ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_23'), '4')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Relation Copy/a_Copy as Permanent'))

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_4'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_24'), 'Pramesh Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_25'), 'प्रमेश बस्नेत')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_5'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_26'), 'Murli Basnet')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_27'), 'मुरली बस्नेत')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('Customer Entry All Dynamic Tab Fields/a_glyphicon glyphicon-plus Dyn'), 
    30)

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_6'), 
    'Other', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_28'), 'Friend')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_29'), 'Pramod Shrestha')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_30'), 'प्रमोद श्रेष्ठ')

WebUI.click(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/a_Add more details...'))

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_31'), '४५२१/५७७८')

WebUI.setText(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/input_PersonalDetail.FamilyDet_2'), 
    '1992/3/31')

CustomKeywords.'com.example.SampleCustomKeywords.clickUsingJS'(findTestObject('Customers Date of Birth Fields/Page_Individual KYC - Loan Reports/span_glyphicon glyphicon-resiz_1'), 
    30)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_34'), '२०६५/६/८')

WebUI.sendKeys(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Customer_Family_Citizen_IPlace_2/input_PersonalDetail.FamilyDet_2'), 
    'जि.प्र.का.')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_35'), 'काठमाडौँ ')

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --AchhamArgha_3'), 
    'Bhaktapur', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_36'), 'Suryabinayak')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_37'), 'सुर्यविनायक ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_38'), '9')

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --AchhamArgha_4'), 
    'Kathmandu', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_39'), 'Kageshwori')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_40'), 'कागेश्वोरी ')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_41'), '7')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_7'), 
    'Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_42'), 'Raju Shrestha')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_43'), 'राजु श्रेष्ठ')

WebUI.click(findTestObject('KYC Customer All Fields(Customer Page Navigation,Citizen Issued Place,Address Copy)/Family Detail Plus/a_glyphicon glyphicon-plus Dyn'))

WebUI.selectOptionByValue(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/select_-- select --Grand Fathe_8'), 
    'Grand Father', true)

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_44'), 'Hem Bahadur Shrestha')

WebUI.setText(findTestObject('KYC Customer Adding (CT-02)/Page_Customer_Details/input_PersonalDetail.FamilyDet_45'), 'हेम बहादुर श्रेष्ठ ')

WebUI.click(findTestObject('New Customer and Loan Entry Save Button/button_Save'))

