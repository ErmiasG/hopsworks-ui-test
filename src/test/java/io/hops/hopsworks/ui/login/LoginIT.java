package io.hops.hopsworks.ui.login;

import io.hops.hopsworks.util.WebDriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginIT {
  private WebDriver driver;
  
  @Before
  public void startUp() {
    driver = WebDriverFactory.getWebDriver();
  }
  
  @Test
  public void gotoLogin() {
    driver.navigate();
  }
  
  @Test
  public void login() {
    driver.navigate();
    driver.findElement(By.name("email")).sendKeys("admin@hopsworks.ai");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.xpath("//button[text()='Login']")).submit();
  }
}
