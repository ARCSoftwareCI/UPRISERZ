package ro.upriserz.features.search;

import org.junit.Test;
import ro.upriserz.Utilities.Constants;

public class ForgottenPasswordTest extends BaseTest{

    @Test
    public void goToForgottenPasswordPage(){
        loginSteps.goToLogin();
        loginSteps.clickOnForgotPassword();
        forgottenPasswordSteps.verifyForgottenPasswordPageText();
    }

    @Test
    public void forgottenPasswordWithNoEmail(){
        loginSteps.goToLogin();
        loginSteps.clickOnForgotPassword();
        forgottenPasswordSteps.doForgottenPasswordWithEmptyEmailField();
    }

    @Test
    public void forgottenPasswordWithWrongEmail(){
        loginSteps.goToLogin();
        loginSteps.clickOnForgotPassword();
        forgottenPasswordSteps.doForgotYourPasswordCompleteWithWrongEmail(Constants.RANDOM_EMAIL);
    }



}
