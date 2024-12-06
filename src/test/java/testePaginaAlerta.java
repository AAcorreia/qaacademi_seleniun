import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testePaginaAlerta {

    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.get("https://demo.automationtesting.in/Alerts.html");
    }
    @Test
    public void testeAlestasSimples(){
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

        //Instancia do alerta e a mudança do contexto
        Alert alert = driver.switchTo().alert();
        //Armazenamento do texto
        String text = alert.getText();
        //Validação do conteudo
        Assert.assertEquals("I am an alert box!", text);

        alert.dismiss();
        driver.quit();
    }

}


