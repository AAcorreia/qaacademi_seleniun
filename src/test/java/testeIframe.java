import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeIframe {
    @Test
    public void testeIframeEx8(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement iframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("input")).sendKeys("Teste da Aline");

    }
}
