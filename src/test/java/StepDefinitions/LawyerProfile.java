package StepDefinitions;

import DriverFactory.DriverFact;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class LawyerProfile {

    private static String Title;

    @Given("user is on lawyerprofile page")
    public void user_is_on_lawyerprofile_page() {
        DriverFact.getDriver().get("https://makinglawsimple.staginganideos.com/lawyer-profile");

    }
}
