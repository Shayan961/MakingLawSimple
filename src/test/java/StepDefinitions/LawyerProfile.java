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
    public void user_enter_job(String jobname)
    {
        lawyer.enterjob(jobname);
    }

    @Then("user click on save changes job title")
    public void user_click_on_save_changes_job_title() {
        lawyer.save_job();
    }

    @When("user click law firm name icon")
    public void user_click_law_firm_name_icon() {
    lawyer.click_law_firmname_icon();
    }

    @Then("user enter law firm name {string}")
    public void user_enter_law_firm_name(String firmname) {
    lawyer.enter_law_firmname(firmname);

    }
    @Then("user click on save changes firm name")
    public void user_click_on_save_changes_firm_name() {
        lawyer.save_firm();
    }

    @When("user click link to website icon")
    public void user_click_link_to_website_icon() {

    }

    @Then("user enter website link {string}")
    public void user_enter_website_link(String string) {

    }

    @When("user click about me icon")
    public void user_click_about_me_icon() {

    }

    @Then("user enter about me {string}")
    public void user_enter_about_me(String string) {

    }

    @When("user click consultation icon")
    public void user_click_consultation_icon() {
        lawyer.click_consultation_icon();

    }

    @Then("user enter consultation {string}")
    public void user_enter_consultation_minutes(String minute) {
        lawyer.enter_consultation_minutes(minute);

    }
    @Then("user click on save")
    public void user_click_on_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
