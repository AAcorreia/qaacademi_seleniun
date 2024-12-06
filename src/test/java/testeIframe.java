import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeIframe {
    WebDriver driver;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
    }

    @Test
    public void testeIframeEx8() throws InterruptedException {

        WebElement iframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(iframe);
        WebElement inputElement = driver.findElement(By.tagName("input"));
        String text = "Aline teste";
        inputElement.sendKeys(text);
        Assert.assertTrue(driver.getPageSource().contains("iFrame Demo"));
    }

    @After
    public void  after(){
        driver.quit();
    }
}
