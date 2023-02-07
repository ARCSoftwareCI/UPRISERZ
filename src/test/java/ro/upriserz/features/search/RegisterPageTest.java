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
    public void registerWithWrongPassword(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithWrongPassword("test","test","emailtest@test.com","12345678","password1234",Constants.PHONE_NUMBER);

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
    public void verifyRegistrationWithEmptyEmailField(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyEmailField("1234567890","1234567890","test","test",Constants.PHONE_NUMBER);
    }

    @Test
    public void verifyRegistrationWithEmptyFirstNameField(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyFirstNameField("1234567890","1234567890","test@test.com","test",Constants.PHONE_NUMBER);
    }

    @Test
    public void verifyRegistrationWithEmptyLastNameField(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyLastNameField("1234567890","1234567890","test@test.com","test",Constants.PHONE_NUMBER);
    }

    @Test
    public void verifyRegistrationWithEmptyPasswordField(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyPasswordField("test","1234567890","test@test.com","test",Constants.PHONE_NUMBER);
    }

    @Test
    public void verifyRegistrationWithEmptyConfirmPasswordField(){
        registerSteps.goToRegisterPage();
        registerSteps.doRegisterWithEmptyConfirmPasswordField("test","1234567890","test@email.com","test",Constants.PHONE_NUMBER);
    }

    @Test
    public void verifyRegistrationWithoutCheckingTermsBox(){
        registerSteps.goToRegisterPage();
        registerSteps.completeAllRegistrationFields("test","test","test@test.com",Constants.PHONE_NUMBER,"1234567890","1234567890");
        registerSteps.clickRegisterButton();
        homePageSteps.waitingStep(3000);
        registerSteps.verifyEmptyTermsCheckBoxTest();
    }

    @Test
    public void verifySameEmailRegistration(){
        registerSteps.goToRegisterPage();
        registerSteps.completeAllRegistrationFields("test","test","test@test.com",Constants.PHONE_NUMBER,"1234567890","1234567890");
        registerSteps.clickRegisterButton();
        homePageSteps.waitingStep(3000);
        registerSteps.verifySameEmailAddressText();
    }

    @Test
    public void phoneNumberTest(){
        registerSteps.goToRegisterPage();
        registerSteps.completeThePhoneNumberField("123456789");
        registerSteps.clickRegisterButton();

    }

}
