import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EGTest {
    private List<String> links = Arrays.asList("Schedule","Tickets","Sponsors",
            "Code of conduct","Contact","About");
    @Test
    public void testNavigateJmanc() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        addressToTest(driver);
        checkTabs(driver, links);
        driver.quit();
        driver = new ChromeDriver();
        addressToTest(driver);
        checkTabs(driver, links);
        driver.quit();

    }

    private void addressToTest(WebDriver driver) {
        driver.get("https://mcrjava.github.io/jmanc/");
    }

    private void checkTabs(WebDriver driver, List<String> links) throws InterruptedException {
        WebElement link;
        for(String item:links) {
            link = driver.findElement(By.linkText(item));
            link.click();
            Thread.sleep(5000);
        }
    }

}
