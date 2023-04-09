package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultipleBrowser_Ultimateqa
{
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser Name");
        }

        //Open the URL
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        //Minimize the Browser
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        System.out.println("Title of the page \t\t : " + driver.getTitle());

        //Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL \t\t : " + currentUrl);

        //Page URL
        System.out.println("Page URL \t\t :" +driver.getPageSource());

        //Find the email element
        WebElement emailFeild = driver.findElement(By.id("user[email]"));
        emailFeild.sendKeys("abc@gmail.com");

        //Find the password
        driver.findElement(By.name("user[password]")).sendKeys("A123@");


        //Close Browser
        driver.close();
    }
}
