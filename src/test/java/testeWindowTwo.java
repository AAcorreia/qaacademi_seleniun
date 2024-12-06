import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testeWindowTwo {

    @Test
    public void testeNovaAba2(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();

        //Mapeamento da janela
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
        String textNovaAba2 = "What you do with that power is entirely up to you.";
        String paginaNova = driver.getPageSource();
        Assert.assertTrue(paginaNova.contains(textNovaAba2));


        //driver.quit();

    }
}
