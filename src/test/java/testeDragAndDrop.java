import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testeDragAndDrop {

    WebDriver driver;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
    }

    @Test
    public void testeArrastarItens(){
        WebElement iconeSeleniun = driver.findElement(By.id("node"));
        WebElement destino = driver.findElement(By.id("droparea"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(iconeSeleniun, destino).perform();

        WebElement iconeEngrenagem = driver.findElement(By.id("mongo"));
        WebElement destino2 = driver.findElement(By.id("droparea"));
        Actions actions2 = new Actions(driver);
        actions.dragAndDrop(iconeEngrenagem, destino2).perform();

        WebElement iconeS = driver.findElement(By.id("angular"));
        WebElement destino3 = driver.findElement(By.id("droparea"));
        Actions actions3 = new Actions(driver);
        actions.dragAndDrop(iconeS, destino3).perform();
    }

    @After
    public void after(){
        driver.quit();
    }
}
