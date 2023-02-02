package ro.upriserz.features.search;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import ro.upriserz.Utilities.Constants;




public class LoginTest extends BaseTest {


    @Test
    public void goToLogin(){
        loginSteps.goToLogin();
        loginSteps.verifyLoginPageText();
    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.goToLogin();
        loginSteps.doCompleteLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.loginVerifycation(Constants.USER_COMPLETE_NAME);
    }

    @Test
    public void loginWithEmptyFields(){
        loginSteps.goToLogin();
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyFieldsLoginText();
    }

    @Test
    public void loginWIthWrongEmail(){
        loginSteps.goToLogin();
        loginSteps.completeEmailField("emailtest@test.com");
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongEmailText();
    }

    @Test
    public void loginWithWrongPassword() {
        loginSteps.goToLogin();
        loginSteps.completeEmailField(Constants.USER_EMAIL);
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongPasswordText();
    }

    @Test
    public void goToHomePageFromLoginPage() {
        loginSteps.goToLogin();
        loginSteps.clickHomeButtonFromLoginPage();
        homePageSteps.verifyHomePageText();
    }

    @Test
    public void goToCreateNewAccount() {
        registerSteps.verifyRegisterPage();
    }

    @Test
    public void goToForgottenPassword() {
        loginSteps.goToLogin();
        loginSteps.clickOnForgotPassword();
        forgottenPasswordSteps.verifyForgottenPasswordPageText();
    }


    @Test
    public void verifyRememberMeCheckboxStatus() {
        loginSteps.isCheckboxChecked();
    }


}
