import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class testePreencherFomulario {

    @Test
    public void execucaoSelenium() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.get("https://demo.automationtesting.in/Register.html");

        //Campo First Name
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Aline");

        //Campo Last Name
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Correia");

        //Campo Address
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Sorocaba - SP");

        //Campo Email
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("ac.aline07@hotmail.com");

        //Campo Phone
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("1236567890");

        //Campo Gender
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]")).click();

        //Campo Hobbies
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

        //Campo Languages - expandir lista
        driver.findElement(By.xpath("//div[@id='msdd']")).click();

        //Campo Languages - selecionar item da lista
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();

        //Campo Skills - expandir e selecionar item da lista
        driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        select.selectByVisibleText("APIs");

        //Campo Select Country
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Australia')]")).click();

        //Campo Date of Birth - year
        WebElement elementAno = driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select selectAno = new Select(elementAno);
        selectAno.selectByVisibleText("1988");

        //Campo Date of Birth - mother
        WebElement elementMes = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
        Select selectMes = new Select(elementMes);
        selectMes.selectByVisibleText("November");

        //Campo Date of Birth - day
        WebElement elementDia = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select selectDia = new Select(elementDia);
        selectDia.selectByVisibleText("14");

        //Campo Password
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");

        //Campo Confirm password
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");

        //Campo Submit
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

        driver.quit();

    }
}
