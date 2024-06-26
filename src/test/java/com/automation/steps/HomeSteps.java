package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed());
    }

    @When("user click on homeBurger menu")
    public void userClickOnHomeBurgerMenu() {
        homePage.clickOnHamburgerMenu();
    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
        homePage.clickOnLogoutLink();
    }
}
