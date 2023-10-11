package StepDefinitions;

import DriverFactory.DriverFact;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login {
    private static String Title;
    private LoginPage loginpage = new LoginPage(DriverFact.getDriver());
    @Given("user is on login page")
    public void user_is_on_login_page() {
      DriverFact.getDriver().get("https://vlqbsynconlineqa3.spurams.com/");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        Title = loginpage.getLoginPageTitle();
       System.out.println("login page title is:" + Title);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(Title.contains(expectedTitleName));
    }

    @Then("forgot your password link should be displayed")
    public void forgot_your_password_link_should_be_displayed() {
        Assert.assertTrue(loginpage.isForgotPwd());
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
       loginpage.enterUserName(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginpage.enterPassword(password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginpage.clickLoginbtn();
    }

}
