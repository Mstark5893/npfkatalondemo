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

Mobile.startApplication('C:\\Users\\Manish\\Downloads\\NPF_Prod_Load_Testing_V12.6 (1).apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Username (3)'), 'kiran@npf.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (3)'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOG IN (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Yes (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Q3-WMS Test Client   - Q3-WMS  (458)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - New  (329)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - NPFON01489 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 3'), '1', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Direct Putaway (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Cancel (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 010'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (7)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 10'), '10', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (3)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (4)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (5)'), '101', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.000 (1)'), '4', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (10)'), 0)

Mobile.closeApplication()

