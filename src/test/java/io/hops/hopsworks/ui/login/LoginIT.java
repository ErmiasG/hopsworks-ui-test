package io.hops.hopsworks.ui.login;

import io.hops.hopsworks.util.WebDriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class LoginIT {
  private WebDriver driver;
  
  @Before
  public void startUp() {
    driver = WebDriverFactory.getWebDriver();
  }
  
  
}
