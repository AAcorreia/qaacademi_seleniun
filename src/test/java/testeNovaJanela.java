import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testeNovaJanela {

    @Test
    public void testeNovaAba(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();

        //Mapeamento da janela
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
        String textNovaAba = "Selenium automates browsers. That's it";
        String paginaTotal = driver.getPageSource();
        Assert.assertTrue(paginaTotal.contains(textNovaAba));

        driver.quit();
    }
}
