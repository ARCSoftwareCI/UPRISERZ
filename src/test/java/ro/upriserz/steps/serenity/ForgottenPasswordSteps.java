package ro.upriserz.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.upriserz.pages.ForgottenPasswordPage;

public class ForgottenPasswordSteps extends BaseSteps{
    private ForgottenPasswordPage forgottenPassword;
    private LoginSteps loginSteps;


    @Step
    public void clickOnHomeButtonFromForgottenPasswordPage(){
        forgottenPassword.clickOnHomeButton();
    }

    @Step
    public void completeEmailFieldForgottenPassword(String email){
        forgottenPassword.completeEmailField(email);
    }

    @Step
    public void clickOnSendLinkForPassword(){
        forgottenPassword.clickOnSendLinkButton();
    }

    @Step
    public void verifyEmptyEmailFieldMessage(){
        forgottenPassword.verifyNecessaryEmail();
    }

    @Step
    public void clickOnBackToLoginPage(){
        forgottenPassword.clickOnBackToLoginPage();
    }

    @Step
    public void verifyWrongEmail(){
        forgottenPassword.verifyWrongEmail();
    }

    @Step
    public void verifyEmailForCompleteForgotPassword(){
        forgottenPassword.verifyCompleteForgottenPassword();
    }

    @Step
    public void doForgotYourPasswordCompleteWithWrongEmail(String email){
        completeEmailFieldForgottenPassword(email);
        clickOnSendLinkForPassword();
        verifyWrongEmail();
    }

    @Step
    public void doForgottenPasswordWithEmptyEmailField(){
        clickOnSendLinkForPassword();
        verifyEmptyEmailFieldMessage();
    }

    @Step
    public void doForgotYourPasswordCompleteWithEmail(String email){
        completeEmailFieldForgottenPassword(email);
        clickOnSendLinkForPassword();
        verifyEmailForCompleteForgotPassword();

    }


}
