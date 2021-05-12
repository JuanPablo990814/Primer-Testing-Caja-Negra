import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test2 {
    protected WebDriver firefoxDriver;
    @Test
    public void PruebaSicau () throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","D:\\Documentos\\Intellij Projects\\testingproject1\\src\\main\\resources\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        //true era el error?
        options.setCapability("marionette",true);
        firefoxDriver = new FirefoxDriver(options);
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        firefoxDriver.get("https://sicau.pascualbravo.edu.co/SICAU/Account/Login");
        firefoxDriver.findElement(By.name("NombreUsuario")).sendKeys("j.patino677");
        firefoxDriver.findElement(By.id("BtnIngresarClave")).click();
        firefoxDriver.findElement(By.name("Contraseña")).sendKeys("12345Pruebas***");
        firefoxDriver.findElement(By.id("BtnIngresarLogin")).click();
        //objeto <a>Estudiantes</a>
        firefoxDriver.findElement(By.xpath("//a[contains(text(),'Estudiantes')]")).sendKeys(Keys.ENTER);
        firefoxDriver.findElement(By.xpath("//body[1]/section[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).sendKeys(Keys.ENTER);
            //reservas en dias festivos
            //reserva cancelada se cambia a reserva finalizada despues de la fecha de la reserva
        /*firefoxDriver.manage().window().maximize();
        Select select = new Select(firefoxDriver.findElement(By.id("DepartamentoAcademicoId")));
        select.selectByVisibleText("EA - ELECTRICA");*/
        WebDriverWait wait = new WebDriverWait(firefoxDriver,30);
        firefoxDriver.findElement(By.id("Fecha")).sendKeys("value","2021-04-17");
        //firefoxDriver.findElement(By.xpath("div[@id='select2-result-label-173']")).click();

        //elemento tipo <select
        /*
        By byElement = By.id("DepartamentoAcademicoId");
        WebDriverWait wait = new WebDriverWait(firefoxDriver,30);
        wait.until(ExpectedConditions.elementToBeClickable(byElement));
        //firefoxDriver.findElement(By.id("DepartamentoAcademicoId")).sendKeys(Keys.ENTER);*/
        //Select select = new Select(firefoxDriver.findElement(By.id("DepartamentoAcademicoId")));
        /**/
        //firefoxDriver.findElement(By.id("DepartamentoAcademicoId")).click();
        //firefoxDriver.findElement(By.id("DepartamentoAcademicoId"));

        /*Wait wait = new FluentWait(firefoxDriver)
                .withTimeout(50, TimeUnit.SECONDS);
        Select select = new Select(firefoxDriver.findElement(By.id("DepartamentoAcademicoId")));
        select.selectByVisibleText("DI - DISEÑO");
        */

        /*
        WebElement firstEle = select.getFirstSelectedOption();
        System.out.println("first element = "+firstEle.getText());

        List<WebElement> listOptions = select.getOptions();
        for(WebElement webElement : listOptions){
            System.out.println("options -"+webElement.getText());
        }*/


    }
}
