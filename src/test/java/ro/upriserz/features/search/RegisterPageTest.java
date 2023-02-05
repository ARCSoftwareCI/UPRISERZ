package ro.upriserz.features.search;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import ro.upriserz.Utilities.Constants;

public class RegisterPageTest extends BaseTest{

//    @Test
//    public void registerWithEmptyFields(){
//        loginSteps.goToLogin();
//        loginSteps.clickOnNewAccountLink();
//        registerSteps.doRegisterWithEmptyFields();
//    }

    @Test
    public void verifyPage(){
        registerSteps.verifyRegisterPage();
    }

    @Test
    public void registerWithEmptyEmail(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.doRegisterWithEmptyEmailField("password1", "password1",Constants.RANDOM_FISRT_NAME,Constants.RANDOM_LAST_NAME,Constants.PHONE_NUMBER);
    }

    @Test
    public void registerWithWrongPasswordName(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithWrongPassword("test","test","emailtest@test.com","pass","password8",Constants.PHONE_NUMBER);
        registerSteps.ver
    }

    @Test
    public void verifyHomePageFromRegistration(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.verifyHomeButtonFromRegisterPage();
    }

    @Test
    public void verifyLoginButtonFromTopPage(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.verifyLoginButtonFromTop();
    }

    @Test
    public void verifyLoginButtonFromBottomPage(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.verifyLoginButtonFromBottom();
    }

    @Test
    public void verifyTermsCheckBox(){
        registerSteps.goToRegisterPage();
        registerSteps.isTermsCheckBoxDisplayed();
    }

    @Test
    public void verifyEmptyFieldRegisterPage(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyFields();
    }



}
