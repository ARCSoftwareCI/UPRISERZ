package ro.upriserz.features.search;

import org.junit.Test;
import ro.upriserz.Utilities.Constants;

public class RegisterTest extends BaseTest{

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
        registerSteps.doRegisterWithEmptyEmailField("password1", "password1",Constants.RANDOM_FISRT_NAME,Constants.RANDOM_LAST_NAME,78945612);
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



}
