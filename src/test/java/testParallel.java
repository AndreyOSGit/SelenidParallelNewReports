
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.soap.Text;

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

    @BeforeClass (groups = {"google","wikipedia","youtube"})
    public void creatTest()
    {
        // whant my driver https://github.com/codeborne/selenide/wiki/How-Selenide-creates-WebDriver
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
//        WebDriver myWebDriver = new ChromeDriver();
//        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        long id = Thread.currentThread().getId();
        System.out.println("Before testParallel-method. Thread id is: " + id);

    }
    @Test (groups = {"google"})
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
        System.out.println("G1");
        WebDriverRunner.closeWebDriver();
    }
    @Test (groups = {"google"})
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
        $("#resultStats").shouldHave(text("Резульатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("G2");
    }
    @Test (groups = {"google"})
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
        System.out.println("G3");
    }
    @Test (groups = {"wikipedia"})
    public void testM3()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("news1");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Результатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("W1");
    }
    @Test (groups = {"wikipedia"})
    public void testM4()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("news2");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Результатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("W2");
    }
    @Test (groups = {"wikipedia"})
    public void testM5()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("http://google.com");
        $("#lst-ib").setValue("news3");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Резульатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("W3");
    }
    @Test (groups = {"youtube"})
    public void testM6()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("https://www.youtube.com");
        $( "#search").setValue("114");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Резульатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("Y1");
    }
    @Test (groups = {"youtube"})
    public void testM7()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("https://www.youtube.com");
        $( "#search").setValue("114");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Резульатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("Y2");
    }
    @Test (groups = {"youtube"})
    public void testM8()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple testParallel-method Three. Thread id is: " + id);
        WebDriver myWebDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(myWebDriver); // .setWebDriver(myWebDriver).
        open("https://www.youtube.com");
        $( "#search").setValue("114");
        $("#lst-ib").pressEnter();
        $("#hplogo").should(disappear); // Waits until element disappears
        $("#resultStats").shouldHave(text("Резульатов"));
        WebDriverRunner.closeWebDriver();
        System.out.println("Y3");
    }
    @AfterClass (groups = {"google","wikipedia","youtube"})
    public void closeTest(){

        long id = Thread.currentThread().getId();
        System.out.println("After testParallel-method. Thread id is: " + id);
        WebDriverRunner.closeWebDriver();
        //myWebDriver.quit();

    }

}
