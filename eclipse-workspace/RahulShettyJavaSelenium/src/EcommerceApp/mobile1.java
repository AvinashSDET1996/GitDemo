package EcommerceApp;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mobile1
{
    public static void main(String[] args) throws InterruptedException
    {
        
        ChromeOptions options = new ChromeOptions();

        // Disable save password popup
        options.addArguments("--disable-notifications");

        options.setExperimentalOption(
                "prefs",
                java.util.Map.of(
                        "credentials_enable_service", false,
                        "profile.password_manager_enabled", false,
                        "profile.password_manager_leak_detection", false
                )
        );

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
       WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] mobilesPurchasing = { "iphone X", "Nokia Edge" };

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("input[name='password']"))
                .sendKeys("Learning@830$3mK2");

        driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();

        driver.findElement(By.id("terms")).click();
        
        driver.findElement(By.id("signInBtn")).click();
        // Thread.sleep(2000);
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
        addToCart(driver, mobilesPurchasing);
         driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
         driver.findElement(By.xpath("//button[contains(text(),'Checkout ')]")).click();
         driver.findElement(By.id("country")).sendKeys("India");
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='suggestions']/ul/li/a)[1]")));
         driver.findElement(By.xpath("(//div[@class='suggestions']/ul/li/a)[1]")).click();
         // driver.findElement(By.id("checkbox2")).click();
         driver.findElement(By.cssSelector("input[value='Purchase']")).click();
         Thread.sleep(2000);
         System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
    }

    
    
    public static void addToCart(WebDriver driver, String[] mobilesPurchasing)
    {

        int j = 0;

        List<WebElement> mobiles = driver.findElements(By.xpath("//h4[@class='card-title']"));

        for (int i = 0; i < mobiles.size(); i++)
        {
            String name = mobiles.get(i).getText();

            List<String> mobilesPurchasingList = Arrays.asList(mobilesPurchasing);

            if (mobilesPurchasingList.contains(name))
            {
                j++;
                
                driver.findElements(By.xpath("//button[@class='btn btn-info']"))
                        .get(i)
                        .click();

                if (j == mobilesPurchasing.length)
                {
                    break;
                }
            }
        }
    }
}