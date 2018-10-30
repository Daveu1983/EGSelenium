import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class EGTest {
    @Test
    public void testNavigateJmanc() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mcrjava.github.io/jmanc/");
        WebElement link;
        final ArrayList<String> links = new ArrayList<String>();
        links.add("Schedule");
        links.add("Tickets");
        links.add("Sponsors");
        links.add("Code of conduct");
        links.add("Contact");
        links.add("About");
        checkTabs(driver, links);
        driver.quit();
        driver = new ChromeDriver();
        driver.get("https://mcrjava.github.io/jmanc/");
        checkTabs(driver, links);
        driver.quit();

    }

    private void checkTabs(WebDriver driver, ArrayList<String> links) throws InterruptedException {
        WebElement link;
        for(String item:links) {
            link = driver.findElement(By.linkText(item));
            link.click();
            Thread.sleep(5000);
        }
    }

}
