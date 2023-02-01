package ro.upriserz.features.search;

import org.junit.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void verifyHomePage(){
        homePageSteps.openHomePage();
        homePageSteps.verifyHomePageText();
    }

    @Test
    public void verifyHomePageText(){
        loginSteps.goToLogin();
        homePageSteps.clickHomeButtonFromLoginPage();
        homePageSteps.verifyHomePageText();
    }
}
