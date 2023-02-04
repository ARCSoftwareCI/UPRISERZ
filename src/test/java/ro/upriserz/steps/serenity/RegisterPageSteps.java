package ro.upriserz.steps.serenity;


import net.thucydides.core.annotations.Step;
import ro.upriserz.pages.HomePage;
import ro.upriserz.pages.LoginPage;
import ro.upriserz.pages.RegisterPage;

public class RegisterPageSteps extends BaseSteps{
    private RegisterPage registerPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void clickOnHomeButtonFromRegisterPage(){
        registerPage.clickHomeButtonFromRegisterPage();
    }

    @Step
    public void clickOnLoginButtonFromTop(){
        registerPage.clickLoginButtonFromTop();
    }

    @Step
    public void clickOnLoginButtonFromBottom(){
        registerPage.clickLoginButtonFromBottom();
    }


    @Step
    public void completeTheFirstNameField(String firstName){
        registerPage.completeFirstNameField(firstName);
    }

    @Step
    public void completeTheLastNameField(String lastName){
        registerPage.completeLastNameField(lastName);
    }

    @Step
    public void completeTheEmailField(String email){
        registerPage.completeEmailField(email);
    }

    @Step
    public void completeThePhoneNumberField(double phoneNumber){
        registerPage.completePhoneNumber(phoneNumber);
    }

    @Step
    public void completeThePasswordField(String password){
        registerPage.completePasswordField(password);
    }

    @Step
    public void completeTheConfirmPasswordField(String confirmPassword){
        registerPage.completePasswordField(confirmPassword);
    }
    @Step
    public void clickOnTermsCheckBox(){
        registerPage.clickTermsCheckBox();
    }

    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

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
    public void doRegisterWithEmptyEmailField(String password, String confirmPassword, String firstName, String lastName, double phoneNumber){
        registerPage.completeFirstNameField(firstName);
        registerPage.completeLastNameField(lastName);
        registerPage.completePhoneNumber(phoneNumber);
        registerPage.completePasswordField(password);
        registerPage.completeConfirmPasswordField(confirmPassword);
        registerPage.clickTermsCheckBox();
        registerPage.clickRegisterButton();
        registerPage.verifyEmptyEmailFieldText();

    }

    @Step
    public void doRegisterWithEmptyFirstNameField(String password, String confirmPassword, String email, String lastName, double phoneNumber){
        registerPage.completeEmailField(email);
        registerPage.completeLastNameField(lastName);
        registerPage.completePhoneNumber(phoneNumber);
        registerPage.completePasswordField(password);
        registerPage.completeConfirmPasswordField(confirmPassword);
        registerPage.clickTermsCheckBox();
        registerPage.clickRegisterButton();
        registerPage.verifyEmptyFirstNameFieldText();

    }

    @Step
    public void doRegisterWithEmptyLastNameField(String password, String confirmPassword, String email, String firstName, double phoneNumber){
        completeTheFirstNameField(firstName);
        completeTheEmailField(email);
        completeThePhoneNumberField(phoneNumber);
        completeThePasswordField(password);
        completeTheConfirmPasswordField(confirmPassword);
        clickOnTermsCheckBox();
        clickRegisterButton();
        registerPage.verifyEmptyLastNameFieldText();

    }

    @Step
    public void doRegisterWithEmptyPhoneNumberField(String password, String confirmPassword, String email, String firstName, String lastName) {
        completeTheLastNameField(lastName);
        completeTheFirstNameField(firstName);
        completeTheEmailField(email);
        completeThePasswordField(password);
        completeTheConfirmPasswordField(confirmPassword);
        clickOnTermsCheckBox();
        clickRegisterButton();
        registerPage.verifyEmptyPhoneNumberFieldText();
    }


    @Step
    public void doRegisterWithEmptyPasswordField(String lastName, String confirmPassword, String email, String firstName, double phoneNumber) {
        completeTheLastNameField(lastName);
        completeTheFirstNameField(firstName);
        completeTheEmailField(email);
        completeThePhoneNumberField(phoneNumber);
        completeTheConfirmPasswordField(confirmPassword);
        clickOnTermsCheckBox();
        clickRegisterButton();
        registerPage.verifyEmptyPasswordFieldtext();
    }

    @Step
    public void verifyLoginButtonFromTop(){
        clickOnLoginButtonFromTop();
        loginPage.verificationLoginPageText();
    }

    @Step
    public void verifyLoginButtonFromBottom(){
        clickOnLoginButtonFromBottom();
        loginPage.verificationLoginPageText();
    }

    @Step
    public void verifyHomeButtonFromRegisterPage(){
        clickOnHomeButtonFromRegisterPage();
        homePage.verifyHomePageText();
    }



}
