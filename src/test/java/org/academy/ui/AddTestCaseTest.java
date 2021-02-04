package org.academy.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;
import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class AddTestCaseTest {


    public static class ChromeTest {

        static final Logger log = getLogger(lookup().lookupClass());

        private WebDriver driver;

        @BeforeTest
        public void setup() {
            WebDriverManager.getInstance(CHROME).setup();
            driver = new ChromeDriver();
        }

        @AfterSuite
        public void teardown() {
            if (driver != null) {
                driver.quit();
            }
        }

        @Test(groups = "title")
        public void testLoginPageTitle() {
            String sutUrl = "https://secure.gurock.com/customers/auth/login/";
            driver.get(sutUrl);
            String title = driver.getTitle();
            String expectedTitle = "Login - Testrail Customer Portal";
            log.debug("The title of {} is {}", sutUrl, title);
            assertThat(title).isEqualToIgnoringCase(expectedTitle);
        }

        @Test(groups = "title")
        public void testFeaturesPageTitle() {
            String sutUrl = "https://www.gurock.com/testrail/tour/modern-test-management";
            driver.get(sutUrl);
            String title = driver.getTitle();
            String expectedTitle = "Comprehensive Test Management - TestRail Tour";
            log.debug("Title of {} is {}", sutUrl, title);
            assertThat(title).isEqualToIgnoringCase(expectedTitle);
        }

        @Test(groups = "title")
        public void testMainPageTitle() {
            String sutUrl = "https://www.gurock.com/testrail/";
            String expectedTitle = "TestRail Test Case Management Software - TestRail";
            driver.get(sutUrl);
            String title = driver.getTitle();
            log.debug("Title of {} is {}", sutUrl, title);
            assertThat(title).isEqualToIgnoringCase(expectedTitle);
        }

        @Test
        public void testCustomersPageTitle() {
            String sutUrl = "https://www.gurock.com/testrail/customers";
            String expectedTitle = "Customers - TestRail";
            driver.get(sutUrl);
            String title = driver.getTitle();
            log.debug("Title of {} is {}", sutUrl, title);
            assertThat(title).isEqualToIgnoringCase(expectedTitle);
        }

//        @Test
//        public void testLogoLink() {
//            CustomersPage page = new CustomersPage();
//            String query = "test";
//            page.clickCommunity();
//            driver.get(CustomersPage.URL);
//            driver.findElement(By.xpath("//input[@id='q']")).sendKeys(query);
//            driver.findElement(By.xpath("//*[@id='searchsubmit']")).click();
//            String actualUrl = driver.getCurrentUrl();
//            String expectedUrl = "https://www.gurock.com/testrail/search?q=" + query;
//            assertThat(actualUrl).isEqualToIgnoringCase(expectedUrl);
//        }
    }

}
