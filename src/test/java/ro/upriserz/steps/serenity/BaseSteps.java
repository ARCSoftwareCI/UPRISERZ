package ro.upriserz.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ro.upriserz.pages.ForgottenPasswordPage;
import ro.upriserz.pages.HomePage;
import ro.upriserz.pages.LoginPage;

public class BaseSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ForgottenPasswordPage forgetPassword;

    @Step
    public void openHomePage(){
        homePage.open();
        homePage.cickOnCookiesButton();
    }

    @Step
    public void clickHomeButtonFromLoginPage(){
        loginPage.clickHomeButton();

    }

    @Step
    public void verifyLoginPageText(){
        loginPage.verificationLoginPageText();
    }

    @Step
    public void verifyHomePageText(){
        homePage.verifyHomePageText();
    }

    @Step
    public void verifyForgottenPasswordPageText(){
        forgetPassword.verifyForgottenPasswordPage();
    }

    @Step
    public void clickHomeButton(){
        homePage.clickOnHomeButton();
    }




}
