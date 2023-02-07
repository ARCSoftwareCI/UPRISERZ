package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RegisterPage extends BasePage{



    @FindBy (css = ".hidden .inline-block")
    private WebElementFacade loginButtonFromTop;

    @FindBy (id = "first_name")
    private WebElementFacade firstNameField;

    @FindBy (id = "last_name")
    private WebElementFacade lastNameField;

    @FindBy (id = "email")
    private WebElementFacade emailField;

    @FindBy (id = "MazPhoneNumberInput-5_country_selector ")
    private List<WebElementFacade> countrySelector;

    @FindBy (id = "MazPhoneNumberInput-9_phone_number")
    private WebElementFacade phoneNumberField;

    @FindBy (css = ".input-phone-number.is-valid")
    private WebElementFacade validPhoneNumberField;

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

    public boolean isCheckBoxDisplayed(){
        if(termsCheckBox.isSelected()){
            return true;
        }

        return false;
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

    public void completeEmailField(String email){
        typeInto(emailField, email);
    }
    public void selectCountry(){
        countrySelector.get(5);
    }

    public void completePhoneNumber(String phoneNumber){
         typeInto(phoneNumberField, phoneNumber);
    }

    public boolean validPhoneNumber(){
        if(validPhoneNumberField.isDisplayed()){
            return true;
        }
        return false;
    }

    public void completePasswordField(String password){
        typeInto(passwordField, password);
    }
    public void completeConfirmPasswordField(String confirmPassword){
        typeInto(confirmPasswordField, confirmPassword);
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

    public void verifyEmptyPasswordFieldText(){
        passwordNecessaryText.shouldContainOnlyText("Câmpul `Parolă` este obligatoriu.");
    }

    public void verifyWrongPasswordFieldText(){
        passwordNecessaryText.shouldContainOnlyText("Câmpul `Parolă` trebuie să aibă cel puțin 8 caractere.");
    }

    public void verifyEmptyCheckBoxText(){
        checkBoxNecessaryText.shouldContainOnlyText("Câmpul `Politica de Confidențialitate și Termenii și Condițiile` este obligatoriu.");
    }

    public void verifyWrongEmptyConfirmPassword(){
        passwordNecessaryText.shouldContainOnlyText("Confirmarea `Confirmă parola` nu se potrivește.");
    }

    public void verifyWrongEmailField(){
        emailNecessaryText.shouldContainOnlyText("Câmpul `Adresa de e-mail` trebuie să fie o adresă de e-mail validă.");
    }

    public void verifySameEmailText(){
        emailNecessaryText.shouldContainOnlyText("Câmpul `Adresa de e-mail` a fost deja folosit.");
    }

}
