package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ForgottenPasswordPage extends BasePage{

    @FindBy (css = ".mx-auto")
    private WebElementFacade homeButton;

    @FindBy (id= "email")
    private WebElementFacade emailField;

    @FindBy (css = ".bg-white div:first-of-type .text-red-500")
    private WebElementFacade necessaryEmail;

    @FindBy (css = ".bg-white div:first-of-type .text-red-500")
    private WebElementFacade wrongEmail;

    @FindBy (css = ".mt-6 .block")
    private WebElementFacade sendLinkButton;

    @FindBy (css = ".mt-6 a")
    private WebElementFacade backToLoginPage;

    @FindBy (css = ".text-green-600")
    private WebElementFacade correctEmail;

    public void clickOnHomeButton(){
        clickOn(homeButton);
    }

    public void completeEmailField(String email){
        typeInto(emailField, email);
    }

    public void verifyNecessaryEmail(){
        necessaryEmail.shouldContainOnlyText("Câmpul `Adresa de e-mail` este obligatoriu.");
    }

    public void verifyWrongEmail(){
        wrongEmail.shouldContainOnlyText("Nu există niciun utilizator cu această adresă de e-mail.");
    }

    public void clickOnSendLinkButton(){
        clickOn(sendLinkButton);
    }

    public void clickOnBackToLoginPage(){
        clickOn(backToLoginPage);
    }

    public void verifyCompleteForgottenPassword(){
        correctEmail.shouldContainOnlyText("Ți-am trimis link-ul de resetare a parolei pe email.");
    }



}
