
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class testParallel {

    //    public static class CustomWebDriverProvider implements WebDriverProvider {
//        @Override
//        public WebDriver createDriver(DesiredCapabilities capabilities) {
//            FirefoxProfile profile = new FirefoxProfile(new File("/home/testParallel/MozzillaProf/"));
//            profile.setAssumeUntrustedCertificateIssuer(false);
//            profile.addAdditionalPreference("general.useragent.override", "some UA string");
//
//            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
//            return new FirefoxDriver(capabilities);
//        }

    @BeforeClass
    public void creatTest()
    {
        // whant my driver https://github.com/codeborne/selenide/wiki/How-Selenide-creates-WebDriver
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
//        WebDriver myWebDriver = new ChromeDriver();
//        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        long id = Thread.currentThread().getId();
        System.out.println("Before testParallel-method. Thread id is: " + id);

    }
    @Test //(groups = {"smoke","id1"})
    public void testM()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method One. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("johny connor");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Результатов"));

        WebDriverRunner.closeWebDriver();
    }
    @Test//(groups = {"smoke","id2"})
    public void testM1()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Two. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("bruse connor");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Результатов"));
        WebDriverRunner.closeWebDriver();
    }
    @Test//(groups = {"smoke","id3"})
    public void testM2()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("sara connor");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Результатов"));
        WebDriverRunner.closeWebDriver();
    }

    @AfterClass
    public void closeTest(){

        long id = Thread.currentThread().getId();
        System.out.println("After testParallel-method. Thread id is: " + id);
        WebDriverRunner.closeWebDriver();
        //myWebDriver.quit();

    }
}
