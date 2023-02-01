package ro.upriserz.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ro.upriserz.pages.HomePage;
import ro.upriserz.steps.serenity.ForgottenPasswordSteps;
import ro.upriserz.steps.serenity.HomePageSteps;
import ro.upriserz.steps.serenity.LoginSteps;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected HomePageSteps homePageSteps;
    @Steps
    protected ForgottenPasswordSteps forgottenPasswordSteps;


    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }

    @After
    public void closeDriver(){
        webDriver.close();
    }
}
