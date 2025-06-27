// Name: Anand Umbarkar

package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;

    @io.cucumber.java.en.Given("User launches the browser")
    public void user_launches_browser() {
        System.setProperty("webdriver.gecko.driver", "/Users/sagarkumbhar/Desktop/geckodriver");
        driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.manage().window().maximize();
    }

    @io.cucumber.java.en.Given("User opens the login page")
    public void user_opens_login_page() {
        driver.get("https://practicetestautomation.com/practice-test-login"); 
    }

    @io.cucumber.java.en.When("User enters valid username and password")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @io.cucumber.java.en.When("User clicks on login button")
    public void user_clicks_login_button() {
        driver.findElement(By.id("submit")).click();
    }
    
    @io.cucumber.java.en.Then("User should be redirected to mainpage")
    public void user_should_be_redirected_to_mainpage() {
    	String currentUrl = driver.getCurrentUrl();
        boolean urlCorrect = currentUrl.contains("logged-in-successfully");

        boolean successMessage = driver.getPageSource().contains("Logged In Successfully");

        boolean logoutVisible = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();

        if (!urlCorrect || !successMessage || !logoutVisible) {
            throw new AssertionError("Login Failed! One or more verification checks failed.");
        }

        driver.quit();
    }
    
    
}
