package Basics.selenium4RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_Below {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement password = driver.findElement((By.xpath("//input[@id='password']" )));
        WebElement username = driver.findElement(RelativeLocator.with(By.xpath("//input[@id='user-name']")).above(password));

        WebElement loginButton = driver.findElement(RelativeLocator.with(By.xpath("//input[@id='login-button']")).below(username));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();





    }
}
