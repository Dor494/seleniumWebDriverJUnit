package org.ual.hmis.TeamADA;


// Generated by Selenium IDE
import org.junit.Test;
import org.junit.experimental.categories.Category;
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
import org.openqa.selenium.chrome.ChromeOptions;
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
public class TestregistrofallidoterminosTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  //System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  firefoxOptions.setHeadless(true);
	  driver = new FirefoxDriver();
	  //ChromeOptions chromeOptions = new ChromeOptions();
	  //chromeOptions.setHeadless(true);
	  //driver = new ChromeDriver();
	  js = (JavascriptExecutor) driver;
	  vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testregistrofallidoterminos() {
	  try {
	        driver.get("http://node-teamada.northeurope.cloudapp.azure.com:1337/");
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("Sign up")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("full-name")).sendKeys("nombre");
	        Thread.sleep(1000);
	        driver.findElement(By.id("email-address")).sendKeys("correo@correo.com");
	        Thread.sleep(1000);
	        driver.findElement(By.id("password")).sendKeys("123");
	        Thread.sleep(1000);
	        driver.findElement(By.id("confirm-password")).sendKeys("123");
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector(".ajax-button")).click();
	        Thread.sleep(1000);
	        assertThat(driver.findElement(By.cssSelector(".form-check-label")).getText(), is("I have read & agree to the terms of service."));
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    
    
  }
}
