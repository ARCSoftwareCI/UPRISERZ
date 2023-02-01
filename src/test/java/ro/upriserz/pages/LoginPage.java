package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;

public class LoginPage extends BasePage{

    @FindBy (css = ".mx-auto")
    private WebElementFacade homeButton;

    @FindBy (css = ".mt-2 .font-medium")
    private WebElementFacade newAccountLink;

    @FindBy (id = "email")
    private WebElementFacade emailField;
    @FindBy (id = "password")
    private WebElementFacade passwordField;
    @FindBy (css = "button.justify-center")
    private WebElementFacade  loginButton;

    @FindBy (id = "remember_me")
    private WebElementFacade checkBoxLogin;

    @FindBy (css = ".mt-6 .text-sm .font-medium")
    private WebElementFacade forgotPassword;

    @FindBy (css = ".bg-white div:first-of-type .text-red-500")
    private WebElementFacade necesaryEmail;

    @FindBy (css = ".mt-6 .text-red-500")
    private WebElementFacade necesaryPassword;

    @FindBy (css = "sc-1q9fwvy-0 gHHEeh")
    private WebElementFacade helpButton;


    public void clickHomeButton(){
        clickOn(homeButton);
    }



    public void clickNewAccount(){
        clickOn(newAccountLink);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }
    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void clickCheckBox(){
        clickOn(checkBoxLogin);
    }

    public void clickForgotPassword(){
        clickOn(forgotPassword);
    }

    public void wrongEmailText(){
        necesaryEmail.shouldContainOnlyText("Nu există un cont cu această adresă de e-mail. Te rugăm să ne contactezi pentru mai multe detalii.");
    }
    public void emptyEmailText(){
        necesaryEmail.shouldContainOnlyText("Câmpul `Adresa de e-mail` este obligatoriu.");
    }
    public void emptyPasswordText(){
        necesaryPassword.shouldContainOnlyText("Câmpul `Parolă` este obligatoriu.");
    }
    public void wrongPasswordText(){
        necesaryEmail.shouldContainOnlyText("Datele de identificare nu pot fi confirmate.");
    }

    public void clickHelpButton(){
        clickOn(helpButton);
    }








}
