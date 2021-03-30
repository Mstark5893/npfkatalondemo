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

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Username (4)'), 'kiran@npf.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (4)'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOG IN (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Yes (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Q3-WMS Test Client   - Q3-WMS  (467)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - New  (337)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - NPFON01489 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (8)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 1 (1)'), '2', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - testing'), 'Test Only', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (11)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Direct Putaway (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Cancel (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 100 (1)'), '20', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (6)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (7)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (8)'), '101', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (12)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (5)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.000 (2)'), '4', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (13)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (6)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - QR1 (1)'), 'QR1', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (14)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Yes (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (15)'), 0)

Mobile.closeApplication()

