package ro.upriserz.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.upriserz.pages.HomePage;
import ro.upriserz.pages.LoginPage;

public class LoginSteps extends BaseSteps {
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void goToLogin(){
        openHomePage();
        homePage.clickOnLoginButton();
        loginPage.verificationLoginPageText();
    }

    @Step
    public void completeEmailField(String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void completePasswordField(String password){
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickOnLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void doCompleteLogin(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void clickOnForgotPassword(){
        loginPage.clickOnForgotPassword();
    }



}
