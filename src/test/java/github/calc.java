package github;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class calc {
	 @Given("I enter 50 in calculator")
	 public void  I_enter_50_in_calculator() {
		 System.out.println("I enter 50 in calculator");
	 }
	 @And("I press add")
	 public void I_press_add() {
		 System.out.println("I press add");
	 }
	 @And("I have entered 50 in the calculator")
	 public void I_have_entered_50_in_the_calculator() {
		 System.out.println("I have entered 50 in the calculator");
	 }
	 @When("I press equal symbol")
	 public void I_press_equal_symbol() {
		 System.out.println("I press equal symbol");

	 }
	 
}
