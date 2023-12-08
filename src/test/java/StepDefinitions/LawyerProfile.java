package StepDefinitions;

import DriverFactory.DriverFact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LawyerProfilePage;
public class LawyerProfile {

    private static String Title;
    private LawyerProfilePage lawyer =  new LawyerProfilePage(DriverFact.getDriver());

    @When("user is on lawyerprofile page")
    public void user_is_on_lawyerprofile_page() {
        //DriverFact.getDriver().get("https://makinglawsimple.staginganideos.com/lawyer-profile");
    }
    @When("user enter job title")
    public void user_enter_job_title() {
        lawyer.clickeditjobtitlebtn();
    }

    @Then("user enter job {string}")
    public void user_enter_job(String jobname) {
        lawyer.enterjob(jobname);
    }

    @Then("user click on save")
    public void user_click_on_save() {
        lawyer.save_job();
    }

}
