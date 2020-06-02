package org.ual.hmis.TeamADA;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CambioContrasenaIncorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  firefoxOptions.setHeadless(true);
	  driver = new FirefoxDriver();
	  js = (JavascriptExecutor) driver;
	  vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cambioContrasenaIncorrecto() {
	  driver.get("http://node-teamada.northeurope.cloudapp.azure.com:1337/login");
			try {
				Thread.sleep(1000);
			    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("alejomaf4@gmail.com");
			    Thread.sleep(1000);
			    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("1234");
			    Thread.sleep(1000);
			    driver.findElement(By.cssSelector(".button-text")).click();
			    Thread.sleep(1000);
    driver.get("http://node-teamada.northeurope.cloudapp.azure.com:1337/account");
    Thread.sleep(1000);
    driver.manage().window().setSize(new Dimension(1094, 947));
    Thread.sleep(1000);
    driver.findElement(By.linkText("Change password")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("1234");
    Thread.sleep(1000);
    driver.findElement(By.id("confirm-password")).sendKeys("12345");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".ajax-button")).click();
    Thread.sleep(1000);
    assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
    Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
}
