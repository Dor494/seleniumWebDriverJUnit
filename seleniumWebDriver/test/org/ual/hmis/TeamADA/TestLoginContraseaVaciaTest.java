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
public class TestLoginContraseaVaciaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Category(Categories.Chrome.class)
  @Before
  public void setUpChrome() {
	  	// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	  	ChromeOptions chromeOptions = new ChromeOptions();
	  	chromeOptions.setHeadless(true);
	  	driver = new ChromeDriver();
	  	js = (JavascriptExecutor) driver;
	  	vars = new HashMap<String, Object>();
  }
  @Category(Categories.Firefox.class)
  @Before
  public void setUpFirefox() {
	  	// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
  public void testLoginContraseaVacia() {
	  try {
		  	driver.get("http://node-teamada.northeurope.cloudapp.azure.com:1337/login");
		  	Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("prueba@node.com");
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".ajax-button")).click();
		    Thread.sleep(1000);
		    assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Please enter your password."));
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
  }
}
