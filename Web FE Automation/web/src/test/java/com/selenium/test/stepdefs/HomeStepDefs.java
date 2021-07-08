package com.selenium.test.stepdefs;

import com.selenium.test.pages.Commons;
import com.selenium.test.pages.HomePage;

import com.support.framework.support.DataFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;


public class HomeStepDefs extends Commons {

	@Given("I am an application user")
	public void iAmAnApplicationUser() {
		hp.asyncSleep(2000);
		HomePage.myAccount.click();
		HomePage.login.click();
		HomePage.email.sendKeys("user@phptravels.com");
		HomePage.password.sendKeys("demouser");
		HomePage.loginbutton.click();
		hp.assertElementPresent(HomePage.photo);
		hp.asyncSleep(2000);
		HomePage.home.click();
		hp.assertElementPresent(HomePage.menu);
	}

	@When("book a hotel room")
	public void bookAHotelRoom() {
		HomePage.tour.click();
		HomePage.adults.click();
		HomePage.adultsOption1.click();
		HomePage.child.click();
		HomePage.childOption1.click();
		HomePage.infant.click();
		HomePage.infantOption1.click();
		HomePage.booknow.click();
		HomePage.confirmBooking.click();
	}

	@Then("my room reservation is confirmed")
	public void myRoomReservationIsConfirmed() {
		hp.assertElementPresent(HomePage.status);

	}
}
