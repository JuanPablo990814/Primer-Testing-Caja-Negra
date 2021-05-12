import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class test3 {
    protected WebDriver firefoxDriver;
    @Test
    public void Busqueda () throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","D:\\Documentos\\Intellij Projects\\testingproject1\\src\\main\\resources\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        //false era el error?
        options.setCapability("marionette",true);
        firefoxDriver = new FirefoxDriver(options);
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        firefoxDriver.get("http://automationpractice.com/index.php");

        WebElement signInButton = firefoxDriver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signInButton.click();

        WebElement signInUser = firefoxDriver.findElement(By.xpath("//input[@id='email']"));
        signInUser.sendKeys("j.patino677@pascualbravo.edu.co");

        WebElement password = firefoxDriver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("12345prueba");

        WebElement SingIn= firefoxDriver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        SingIn.click();

        WebElement Main = firefoxDriver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        Main.click();

        //Prenda
        WebElement PrendaEscoge = firefoxDriver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]"));
        PrendaEscoge.click();

        //Prenda con talla, cantidad y color
        WebElement PrendaInfo = firefoxDriver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]"));
        PrendaInfo.submit();

        //Summary Next
        WebElement Next1 = firefoxDriver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]"));
        Next1.click();

        //Address Next
        WebElement Next2 = firefoxDriver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
        Next2.submit();

        //shipping
        WebElement checkbox = firefoxDriver.findElement(By.xpath("//input[@id='cgv']"));
        checkbox.click();
        sleep(3000);

        WebElement Next3 = firefoxDriver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"));
        Next3.click();

        //payment
        WebElement Next4 = firefoxDriver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]"));
        Next4.click();

        WebElement Next5 = firefoxDriver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"));
        Next5.click();
    }
}
