package ro.upriserz.features.search;

import org.junit.Test;
import ro.upriserz.Utilities.Constants;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithEmptyFields(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.doRegisterWithEmptyFields();
    }

    @Test
    public void verifyPage(){
        registerSteps.verifyRegisterPage();
    }

    @Test
    public void registerWithEmptyEmail(){
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        registerSteps.doRegisterWithEmptyEmailField(Constants.RANDOM_FISRT_NAME,Constants.RANDOM_LAST_NAME,"78945612");
    }

}
