import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Prva_test {


    public static void main(String []args) {
        String urlToCheck = "http://toolsqa.com/selenium-webdriver/first-test-case/";
        String imageLocator = ".//*[@id='branding']/a/img";
        WebDriver driver = new FirefoxDriver();
        driver.get(urlToCheck);
        Assert.assertTrue(driver.findElement(By.xpath(imageLocator)).isDisplayed());
        System.out.println("Popee poeeee");
        driver.quit();
    }
}
