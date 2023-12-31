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
    lawyer.click_link_to_website_icon();
    }

    @Then("user enter website link {string}")
    public void user_enter_website_link(String link) {
    lawyer.enter_website_link(link);
    }
    @Then("user click on save changes website link button")
    public void user_click_on_save_changes_website_link_button() {
       lawyer.save_websitelink();
    }

    @When("user click about me icon")
    public void user_click_about_me_icon() {
    lawyer.click_about_me_icon();
    }

    @Then("user enter about me {string}")
    public void user_enter_about_me(String aboutme) {
    lawyer.enter_about_me(aboutme);
    }
    @Then("user click on save about me button")
    public void user_click_on_save_about_me_button() {
    lawyer.save_about_me();
    }

    @When("user click consultation icon")
    public void user_click_consultation_icon() {
        lawyer.click_consultation_icon();

    }

    @Then("user enter consultation {string}")
    public void user_enter_consultation_minutes(String minute) {
        lawyer.enter_consultation_minutes(minute);

    }
    @Then("user click on consultation save button")
    public void user_click_on_consultation_save_button() {
        lawyer.save_consultation();
    }

    @Then("user check offer Remote Consultations")
    public void user_check_offer_remote_consultations() {
    lawyer.remote_consultations_CheckboxChecked();
    }
    @Then("user check mobile friendly checkbox")
    public void user_check_mobile_friendly_checkbox() {
    lawyer.Mobile_friendly_Checkbox_not_Checked();
    }
    @When("user click on Area of practice icon")
    public void user_click_on_area_of_practice_icon() {
        lawyer.Click_area_of_interest_icon();
    }
    @Then("user select value from dropdown")
    public void user_select_value_from_dropdown() {

        lawyer.select_dropdown_value();
    }
    @Then("user click on save area of pratcice")
    public void user_click_on_save_area_of_pratcice() {

    }

    @When("user click on choose file for profile picture")
    public void user_click_on_choose_file_for_profile_picture() {
        lawyer.whenTheUserSelectsAndUploadsAPicture();
    }

    @When("user click on state territory icon")
    public void user_click_on_state_territory_icon() {
    //lawyer.Click_edit_state_icon();
    }

    @Then("user select state territory from dropdown")
    public void user_select_state_territory_from_dropdown() {
    //lawyer.click_state_dropdown_icon();
    }

    @Then("user click on save state territory")
    public void user_click_on_save_state_territory() {

    }




}
