package pages;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class FormManagement_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By pageTitleText = By.xpath(""); 
	By switchToNavigationMenu = By.xpath(""); 
	By alertPopup = By.xpath("");  
	By buttonToDisplayAnAlertBox = By.xpath("");  
	By registerNavigationMenu = By.xpath(""); 
	By firstNameTextbox = By.xpath("");  
	By lastNameTextbox = By.xpath("");  
	By addressInputAreabox = By.xpath(""); 
	By emailAddressTextbox = By.xpath(""); 
	By phoneNumberTextbox =By.xpath(""); 
	By maleRadioButton = By.xpath(""); 
	By feMaleRadioButton = By.xpath(""); 
	By cricketCheckBox = By.xpath(""); 
	By moviesCheckBox = By.xpath(""); 
	By hockeyCheckBox =By.xpath(""); 
	By languageDropdown = By.xpath(""); 
	By selectEnglish = By.xpath(""); 
	By selectHindi = By.xpath(""); 
	By skillsDropdown = By.xpath(""); 
	By countryDropdown = By.xpath(""); 
	By clickOnCountryDropdown = By.xpath(""); 
	By selectCountryAustralia = By.xpath(""); 
	By selectCountryBangladesh = By.xpath(""); 
	By selectCountryDenmark = By.xpath(""); 
	By selectCountryHongKong = By.xpath(""); 
	By selectCountryIndia = By.xpath(""); 
	By selectCountryJapan = By.xpath(""); 
	By selectCountryNetherlands = By.xpath(""); 
	By selectCountryNewZealand = By.xpath(""); 
	By selectCountrySouthAfrica = By.xpath(""); 
	By selectCountryUnitedStatesOfAmerica =By.xpath(""); 
	By selectYear = By.xpath(""); 
	By selectMonth = By.xpath(""); 
	By selectDate = By.xpath(""); 
	By password =By.xpath(""); 
	By confirmPassword = By.xpath(""); 
	By submitButton = By.xpath(""); 
	By refreshButton = By.xpath(""); 
	By chooseFile = By.xpath(""); 
	By uploadImageFileName =By.xpath(""); 
	By interactionNavigationBar = By.xpath("");
	By selectableOption = By.xpath("");
	By serializeOption = By.xpath("");
	By sakinaliumCrossBrowserTestingOption = By.xpath("");
	By messageAfterClickingSakinaliumCrossBrowserTestingOption = By.id("");



	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public FormManagement_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test1
	 * about this method validateTitleOfHomePage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfHomePage() throws Exception {
		// write your logic here
		return null;
	}
	/**@Test2
	 * about this method clickOnSwitchToAlertandValidateTitlePage() 
	 * @param : null
	 * @description : click on the switch to alert and validate the title of this page
	 * @return : String
	 * @author : Yaksha
	 */
	public String  clickOnSwitchToAlertandValidateTitlePage() throws Exception {
		// write your logic here
		return null;
	}

	/**@Test3
	 * about this method handleAlertsPopupValidateAnAlertsPopup() 
	 * @param : null
	 * @description : click on the ButtonToDisplayAnAlertBox then control switch in to alert popup and get the alert message and validate
	 * @return : String
	 * @author : Yaksha
	 */

	public String handleAlertsPopupValidateAnAlertsPopup() throws Exception {
		// write your logic here
		return null;
	}

	/**@Test4
	 * about this method clickOnRegisterLinkandFillTheForms() 
	 * @param : fill the form using the data from Map<String, String> expectedData using fields "firstName", "lastName", "adds", "email", "phoneNo", "password" and "confirmPassword"
	 * @description : Click on the register and fill data in all fields using above mentioned fields
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnRegisterLinkandFillTheForms(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return false;
	}
	/**@Test5
	 * about this method clickOnSelectCountryAndSelectEachCountry() 
	 * @param : null
	 * @description : refresh the page and click and country drop down and select all the country from the drop down
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnSelectCountryAndSelectEachCountry() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@Test6
	 * about this method selectEachCountryOneByOneFromCountryDrpdownAndValidate() 
	 * @param : null
	 * @description : refresh the page and click on country dropdown then select Australia and get the value and validate it 
	 * @return : String
	 * @author : Yaksha
	 */
	public String selectAustraliaInCountryDrpdownAndValidate() throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test7
	 * about this method checkUncheckCheckBoxAndValidateThatCheckBox() 
	 * @param : null
	 * @description : check all the check boxes and validate hockey check box is selected or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkUncheckCheckBoxAndValidateThatCheckBox() throws Exception {
		// write your logic here
		return false;
	}

	/**@Test8
	 * about this method selecteachRadioButtonvalidateEachRadioButtonoptionShouldBeSelectableAttime() 
	 * @param : null
	 * @description :  select each Radio Button validate Each Radio Button option Should Be selectable At time
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean selectRadioButtonvalidateRadioButtonOptionIsSelectable() throws Exception {
		// write your logic here
		return false;
	}

	/**@Test9
	 * about this method selectYearMonthDate() 
	 * @param : null
	 * @description : select year,month and date in the dropdown using select class
	 * @return : return true if select year dropdown is present, else false
	 * @author : Yaksha
	 */

	public boolean selectYearMonthDate() throws Exception {
		// write your logic here
		return false;
	}

	/**@Test10
	 * about this method filltheDetailsAndClickOnTheSubmitButton() 
	 * @param : fill the form using the data from Map<String, String> expectedData using fields "firstName", "lastName", "adds" and "email"
	 * @description :click on the register and fill first name text field,lastNameTextbox, address ,emailAddressTextbox and then click on submit button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean filltheDetailsAndClickOnTheSubmitButton(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return false;
	}

	/**@Test11
	 * about this method afterClickOnSakinaliumCrossBrowserTestingDisplayTheText() 
	 * @param : null
	 * @description : click on Interaction Navigation Menu bar, then click on selectable option, then click on Serialize tab, then click on Sakinalium - Cross Browser Testing option. after click on Sakinalium - Cross Browser Testing some text value will display . Fetch that text value
	 * @return : String
	 * @author : Yaksha
	 */
	public String afterClickOnSakinaliumCrossBrowserTestingDisplayTheText() throws Exception {
		// write your logic here
		return null;
	}

}
