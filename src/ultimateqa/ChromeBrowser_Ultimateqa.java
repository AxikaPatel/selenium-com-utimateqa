package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Ultimateqa
{
    public static void main(String[] args)
    {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL
        driver.get(baseUrl);

        //Minimise the Browser
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page \t\t : " + title);

        //Current URL
        System.out.println("Current URL \t\t : " + driver.getCurrentUrl());

        //Page URL
        String printUrl = driver.getPageSource();
        System.out.println("Page URL \t\t :" + printUrl);

        //Find the email element
        driver.findElement(By.name("user[email]")).sendKeys("abc@gmail.com");

        //Find the password field
        WebElement passwordField =driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("A123@");

        //Close Browser
        driver.close();
    }
}
