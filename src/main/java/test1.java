import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;
//https://github.com/mozilla/geckodriver/releases
public class test1 {
    protected WebDriver firefoxDriver;
    @Test
    public void Busqueda () throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","D:\\Documentos\\Intellij Projects\\testingproject1\\src\\main\\resources\\geckodriver.exe");

        //WebDriver driver = new FirefoxDriver();
        //FirefoxOptions options = new FirefoxOptions();
        //driver.get("https://www.google.com/");

        FirefoxOptions options = new FirefoxOptions();
        //true era el error?
        options.setCapability("marionette",true);
        firefoxDriver = new FirefoxDriver(options);
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        firefoxDriver.get("https://www.google.com/");
        firefoxDriver.findElement(By.name("q")).sendKeys("https://pascualbravovirtual.edu.co/");
        firefoxDriver.findElement(By.name("btnK")).submit();

    }

}
