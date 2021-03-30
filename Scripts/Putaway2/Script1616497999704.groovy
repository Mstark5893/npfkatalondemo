import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

TestObject myNewObject = new TestObject('TheObjectName')

myNewObject.addProperty('xpath', ConditionType.EQUALS, '//html/body')

Mobile.startApplication('C:\\Users\\Manish\\Downloads\\NPF_Prod_Load_Testing_V12.6 (1).apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Username (2)'), 'kiran@npf.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (2)'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOG IN (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Yes (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (2)'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - New  (327)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - NPFON01489 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 2'), '3', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - test'), 'testing', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Direct Putaway (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 0100 (1)'), 0)

Mobile.closeApplication()

