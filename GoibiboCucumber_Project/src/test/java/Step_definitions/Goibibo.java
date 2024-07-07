package Step_definitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Goibibo {
	WebDriver driver;
	
	@Given("I navigate to the Goibibo home page")
	public void i_navigate_to_the_goibibo_home_page() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("#get_sign_in")).click();
		Thread.sleep(2000);
	}

	@When("I sign up with the username testuser and password testpass")
	public void i_sign_up_with_the_username_testuser_and_password_testpass() {
		
		//driver.findElement(By.cssSelector(".loginCont__input")).sendKeys("9918587225");
		
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8448037120");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8448037120");
		
		//driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8446595120");
	   
		//driver.findElement(By.xpath("//p[@class='sc-jlZhew goPNoH']")).sendKeys("8599537120");
		
		//driver.findElement(By.cssSelector("input.loginCont__input[type='text'][name='phone']")).sendKeys("8448037120");
	
		//driver.findElement(By.cssSelector("input.loginCont__input[name='phone']")).sendKeys("9945784549");
	
		driver.findElement(By.xpath("//input[@class='loginCont__input' and @type='text' and @name='phone']")).sendKeys("8448037120");
	
	
	}

	@When("I login with the username testuser and password testpass")
	public void i_login_with_the_username_testuser_and_password_testpass() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I search for a round trip flight from Delhi to Mumbai on {int} August")
	public void i_search_for_a_round_trip_flight_from_delhi_to_mumbai_on_august(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I filter for non-stop flights and preferred airlines")
	public void i_filter_for_non_stop_flights_and_preferred_airlines() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select the flight with the least cost")
	public void i_select_the_flight_with_the_least_cost() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose additional services such as meal preferences, seat selection, and extra baggage")
	public void i_choose_additional_services_such_as_meal_preferences_seat_selection_and_extra_baggage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("if any coupon is available, I choose one")
	public void if_any_coupon_is_available_i_choose_one() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I proceed to payment")
	public void i_proceed_to_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I use the code for zero cancellation and free date change")
	public void i_use_the_code_for_zero_cancellation_and_free_date_change() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the passenger details")
	public void i_enter_the_passenger_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the payment details")
	public void i_enter_the_payment_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the flight should be booked successfully")
	public void the_flight_should_be_booked_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
