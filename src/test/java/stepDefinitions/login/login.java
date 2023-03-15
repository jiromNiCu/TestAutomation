package stepDefinitions.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import managers.drivers;


public class login {
    @Given("Navigate to (.*)$")
    public void navigateToWebsite(String strWebsite) {
        drivers.getDriver().get(strWebsite);
    }

}
