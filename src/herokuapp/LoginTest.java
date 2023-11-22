package herokuapp;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.get("http://the-internet.herokuapp.com/login");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("SuperSecretPassword!");
        loginButton.click();

        WebElement secureAreaText = driver.findElement(By.xpath("//h2[text()='Secure Area']"));
        Assert.assertTrue(secureAreaText.isDisplayed());
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        // Implement your test steps for this scenario
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        // Implement your test steps for this scenario
    }
}

