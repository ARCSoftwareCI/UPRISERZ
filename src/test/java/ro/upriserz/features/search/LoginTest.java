package ro.upriserz.features.search;

import org.junit.Test;
import ro.upriserz.Utilities.Constants;




public class LoginTest extends BaseTest {


    @Test
    public void goToLogin(){
        loginSteps.goToLogin();
    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.goToLogin();
        loginSteps.doCompleteLogin(Constants.CASIAN_EMAIL, Constants.CASIAN_PASSWORD);

    }
}
