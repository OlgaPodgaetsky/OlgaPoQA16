
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Trello {
  public WebDriver driver;


  @BeforeClass()

  public void setUp(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testTrello(){

    driver.get("https://trello.com/");
    driver.findElement(By.linkText("Зарегистрироваться")).click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("OlgaPodgaetsky");

    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("olgapodgaetsky@gmail.com");

    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("25081954");

    driver.findElement(By.id("signup")).click();

  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
      }

  private boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;

    }
  }




}
