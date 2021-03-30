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

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Username'), 'kiran@npf.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOG IN'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner'), 0)
Mobile.tap(findTestObject.findXpath('//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[12]'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Choose from list'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - New  (328)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - NPFON01723'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 1'), '2', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Container Delivery-40ft loose Carton'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - tesy'), 'testing', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Direct Putaway'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Cancel'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 0100'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 100'), '20', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (1)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (2)'), '101', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.000'), '4', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Cancel (1)'), 0)

Mobile.setText(findTestObject(''), '1.0', 0)

Mobile.setText(findTestObject(''), '1.0', 0)

Mobile.setText(findTestObject(''), '101.0', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject(''), '4', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - QR1'), 'QR1', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (5)'), 0)

Mobile.closeApplication()

