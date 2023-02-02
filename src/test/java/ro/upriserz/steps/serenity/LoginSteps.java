package ro.upriserz.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
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
        loginPage.clickForgotPassword();
    }

    @Step
    public void clickOnNewAccountLink(){
        loginPage.clickNewAccount();
    }

    @Step
    public void clickRememberMeCheckBox(){
        loginPage.clickCheckBox();
    }

    @Step
    public void verifyWrongEmailText(){
        loginPage.wrongEmailText();
    }

    @Step
    public void verifyWrongPasswordText(){
        loginPage.wrongPasswordText();
    }

    @Step
    public void verifyEmptyPasswordFieldText(){
        loginPage.emptyPasswordText();
    }

    @Step
    public void verifyEmptyEmailFieldText(){
        loginPage.emptyEmailText();
    }

    @Step
    public void verifyEmptyFieldsLoginText(){
        loginPage.emptyPasswordText();
        loginPage.emptyEmailText();
    }

    @Step
    public void isCheckboxChecked(){
        goToLogin();
        loginPage.clickCheckBox();
        loginPage.clickLoginButton();
        loginPage.isCheckBoxDisplayed();

    }

    @Step
    public void loginVerifycation(String userName){
        loginPage.verifyDashboardPage(userName);
    }





}
