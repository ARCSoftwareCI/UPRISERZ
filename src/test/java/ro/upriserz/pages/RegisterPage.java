package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class RegisterPage extends BasePage{


    @FindBy(css = ".flex-shrink-0.flex ")
    private WebElementFacade homeButtonFromRegisterPage;

    @FindBy (css = ".hidden .inline-block")
    private WebElementFacade loginButtonFromTop;

    @FindBy (id = "first_name")
    private WebElementFacade firstNameField;

    @FindBy (id = "last_name")
    private WebElementFacade lastNameField;

    @FindBy (id = "email")
    private WebElementFacade emailField;

    @FindBy (css = ".input-country-selector ")
    private List<WebElementFacade> countrySelector;

    @FindBy (css = ".input-phone-number")
    private WebElementFacade phoneNumberField;

    @FindBy (id = "password")
    private WebElementFacade passwordField;

    @FindBy (id = "password-confirm")
    private WebElementFacade confirmPasswordField;

    @FindBy (id = "terms")
    private WebElementFacade termsCheckBox;

    @FindBy (css = ".w-full .justify-center")
    private WebElementFacade registerButton;

    @FindBy (css = ".mt-8 .text-blue-500")
    private WebElementFacade loginButtonFromBottom;

    @FindBy (css = ".mt-6 .text-red-500")
    private WebElementFacade firstNameNecessaryText;

    @FindBy (css = "form > div:nth-child(3) > p")
    private WebElementFacade lastnameNecessaryText;

    @FindBy (css = "form > div:nth-child(4) > p")
    private WebElementFacade emailNecessaryText;

    @FindBy (css = "form > div:nth-child(5) > p")
    private WebElementFacade phoneNumberNecessaryText;

    @FindBy (css = "form > div:nth-child(6) > p")
    private WebElementFacade passwordNecessaryText;

    @FindBy (css = "form >p")
    private WebElementFacade checkBoxNecessaryText;

    @FindBy (css = ".text-gray-700.mt-8")
    private WebElementFacade registerPageText;

    public void clockHomeButtonFromRegisterPage(){
        clickOn(homeButtonFromRegisterPage);
    }

    public void clickLoginButtonFromTop(){
        clickOn(loginButtonFromTop);
    }

    public void completeFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void completeLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void selectCountry(){
        countrySelector.get(5);
    }

    public void completePhoneNumber(String phoneNumber){
        typeInto(phoneNumberField, phoneNumber);
    }

    String password= RandomStringUtils.randomAlphabetic(5)+RandomStringUtils.randomNumeric(3);
    public void completePasswordField(){
        typeInto(passwordField, password);
    }
    public void completeConfirmPasswordField(){
        typeInto(confirmPasswordField, password);
    }

    public void clickTermsCheckBox(){
        clickOn(termsCheckBox);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void clickLoginButtonFromBottom(){
        clickOn(loginButtonFromBottom);
    }

    public void verifyEmptyFirstNameFieldText(){
        firstNameNecessaryText.shouldContainOnlyText("Câmpul `Prenume` este obligatoriu.");
    }

    public void verifyEmptyLastNameFieldText(){
        lastnameNecessaryText.shouldContainOnlyText("Câmpul `Nume` este obligatoriu.");
    }

    public void verifyEmptyEmailFieldText(){
        emailNecessaryText.shouldContainOnlyText("Câmpul `Adresa de e-mail` este obligatoriu.");
    }

    public void verifyEmptyPhoneNumberFieldText(){
        phoneNumberNecessaryText.shouldContainOnlyText("Câmpul `Număr de telefon` nu este valid.");
    }

    public void verifyEmptyPasswordFieldtext(){
        passwordNecessaryText.shouldContainOnlyText("Câmpul `Parolă` este obligatoriu.");
    }

    public void verifyWrongPasswordFieldText(){
        passwordNecessaryText.shouldContainOnlyText("Câmpul `Parolă` trebuie să aibă cel puțin 8 caractere.");
    }

    public void verifyEmptyCheckBoxText(){
        checkBoxNecessaryText.shouldContainOnlyText("Câmpul `Politica de Confidențialitate și Termenii și Condițiile` este obligatoriu.");
    }

    public void verifyRegisterPageText(){
        registerPageText.shouldContainOnlyText("Ai deja un cont? Autentifică-te");
    }


}
