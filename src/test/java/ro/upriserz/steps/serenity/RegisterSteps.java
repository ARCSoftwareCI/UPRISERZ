package ro.upriserz.steps.serenity;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.yecht.Data;
import ro.upriserz.pages.HomePage;
import ro.upriserz.pages.LoginPage;
import ro.upriserz.pages.RegisterPage;

public class RegisterSteps extends BaseSteps{
    private RegisterPage registerPage;
    private HomePage homePage;
    private LoginPage loginPage;


    @Step
    public void verifyRegisterPage(){
        openHomePage();
        homePage.clickOnLoginButton();
        loginPage.clickNewAccount();
        registerPage.verifyRegisterPageText();
    }

    @Step
    public void doRegisterWithEmptyFields(){
        registerPage.clickRegisterButton();
        registerPage.verifyEmptyFirstNameFieldText();
        registerPage.verifyEmptyLastNameFieldText();
        registerPage.verifyEmptyEmailFieldText();
        registerPage.verifyEmptyPasswordFieldtext();
        registerPage.verifyEmptyPhoneNumberFieldText();
        registerPage.verifyEmptyCheckBoxText();
    }

    @Step
    public void doRegisterWithEmptyEmailField(String firstName, String lastName, String phoneNumber){
        registerPage.completeFirstNameField(firstName);
        registerPage.completeLastNameField(lastName);
        registerPage.completePhoneNumber(phoneNumber);
        registerPage.completePasswordField();
        registerPage.completeConfirmPasswordField();
        registerPage.clickTermsCheckBox();
        registerPage.clickRegisterButton();
        registerPage.verifyEmptyEmailFieldText();

    }




}
