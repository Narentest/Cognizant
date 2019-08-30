package Step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Homepage_Steps {


 WebDriver driver;

 @Given("^Open the Firefox and launch the application$")
 public void open_the_Firefox_and_launch_the_application() throws Throwable
 {

  driver= new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("");
 }

 @Given("^User launched the Firefox$")
 public void user_launched_the_Firefox() throws Throwable {


    WebDriver driver=new FirefoxDriver();

    driver.manage().window().maximize();

    driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);

    driver.get("https://www.theguardian.com/tone/news");

   }



 @When("^User enters \"([^\"]*)\"$")
 public void user_enters(String arg1) throws Throwable {
  
 
 }

 @Then("^Website should be launched$")
 public void website_should_be_launched() throws Throwable {
  
 
 }

 @Then("^Validate the expected weblink and entered weblink are same$")
 public void validate_the_expected_weblink_and_entered_weblink_are_same() throws Throwable {
  
 
 }

 @Given("^User landed on the guardian website$")
 public void user_landed_on_the_guardian_website() throws Throwable {
  
 
 }

 @When("^User get the \"([^\"]*)\" from the guardian website$")
 public void user_get_the_from_the_guardian_website(String arg1) throws Throwable {
  
 
 }

 @When("^Searched for news on Google/other resources$")
 public void searched_for_news_on_Google_other_resources() throws Throwable {
  
 
 }

 @Then("^The article/information should confirm article is valid$")
 public void the_article_information_should_confirm_article_is_valid() throws Throwable {


 }


}