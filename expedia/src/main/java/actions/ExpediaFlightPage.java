package actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpediaFlightPage {

	public static final Logger log = Logger.getLogger(ExpediaFlightPage.class
			.getName());

	public ExpediaFlightPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "primary-header-flight")
	WebElement flightTab;

	public void clickFlightTab() {

		boolean isFlightTabEnabled = flightTab.isEnabled();

		if (isFlightTabEnabled == true) {

			log.info("Flight tab enabled: " + isFlightTabEnabled);
			
			flightTab.click();
		}
		else
		{
			log.info("Flight tab disabled at this moment");
			
		}
	}

	@FindBy(id = "flight-type-roundtrip-label-flp")
	WebElement roundTrip;
	
	public void clickRoundTrip(){
		
		boolean isRoundTripEnabled = roundTrip.isEnabled();
		
		if(isRoundTripEnabled == true){
			
			log.info("Round trip button enabled: " + isRoundTripEnabled);
			
			roundTrip.click();
			
		}
		else{
			log.info("Round trip button disabled at this moment");
		}
	}

	@FindBy(id = "flight-origin-flp")
	WebElement flyingFrom;
	
	public void inputFlyFrom(String flyingFrom){
		
		this.flyingFrom.sendKeys(flyingFrom);
		
		log.info("Flying from input: " + flyingFrom );
	}

	@FindBy(id = "flight-destination-flp")
	WebElement flyingTo;
	
	public void inputFlyTo(String flyingTo){
		
		this.flyingTo.sendKeys(flyingTo);
		
		log.info("Flying to input: " + flyingTo);
		
	}

	@FindBy(id = "flight-departing-flp")
	WebElement departingDate;
	
	public void inputDepartDate(String departingDate){
		
		this.departingDate.sendKeys(departingDate);
		
		log.info("Deaparting date input: " + departingDate);
		
	}

	@FindBy(id = "flight-returning-flp")
	WebElement returningDate;
	
	public void inputReturnDate(String returningDate){
		
		this.returningDate.clear();
		
		this.returningDate.click();
		
		this.returningDate.sendKeys(returningDate);
		
		log.info("Returning date input: " + returningDate);
	}

	@FindBy(id = "flight-adults-flp")
	WebElement adultsDropdown;
	
	public void inputAdultsOnFlight(String numberOfAdults){
		
		Select adultDropdownOption = new Select(adultsDropdown);
		
		adultDropdownOption.selectByValue(numberOfAdults);
		
		log.info("Number of adults on flight:" + numberOfAdults);
	}

	@FindBy(id = "flight-children-flp")
	WebElement childrenDropdown;
	
	public void inputChildOnFlight (String numberOfChildren)
	
	{
		Select childrenDropdownOption = new Select (childrenDropdown);
		childrenDropdownOption.selectByValue(numberOfChildren);
		
	}

	@FindBy(id = "flight-advanced-options-flp")
	WebElement advacedOptionbutton;
	
	public void selectAdvancedOption()
	{
		this.advacedOptionbutton.click();
	}

	@FindBy(xpath = ".//*[@id='flight-advanced-options-fields-flp']/div/div[1]")
	WebElement advancedOptionsCheckbox;
	
	public void advancedoptionallcheck()
	{
		this.advancedOptionsCheckbox.click();
	}

	@FindBy(id = "flight-advanced-preferred-airline-flp")
	WebElement preferedAirlineDropDown;
	
	public void chooseAirline(String myAirline)
	{
		Select preferedAirline = new Select (preferedAirlineDropDown);
		preferedAirline.selectByVisibleText(myAirline);
	}

	@FindBy(id = "flight-advanced-preferred-class-flp")
	WebElement preferedClassDropDown;
	
	public void chooseYourClass( String myClass)
	
	{
		Select preferedClass = new Select (preferedClassDropDown);
		preferedClass.selectByVisibleText(myClass);	
	}

	@FindBy(xpath = "//input=[contains(@type, 'checkbox') and contains(@value, 'a')]")
	
	WebElement addHotelAndCar;
	
	{
		this.addHotelAndCar.click(); 
	
	}

}
