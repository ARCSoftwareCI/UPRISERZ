package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{


    @FindBy(css = ".flex-shrink-0.flex ")
    private WebElementFacade homeButtonFromRegisterPage;

    @FindBy (css = ".hidden .inline-block")
    private WebElementFacade loginButtonTop;

    @FindBy (id = "first_name")
    private WebElementFacade firstNameField;

    @FindBy (id = "last_name")
    private WebElementFacade lastNameField;

    @FindBy (id = "email")
    private WebElementFacade emailField;

    @FindBy (css = ".input-phone-number")
    private WebElementFacade phoneNumberField;

    @FindBy (id = "password")
    private WebElementFacade passwordField;

    @FindBy (id = "password-confirm")
    private WebElementFacade passwordConfirmField;

    @FindBy (id = "terms")
    private WebElementFacade termsCheckBox;

    @FindBy (css = ".w-full .justify-center")
    private WebElementFacade registerButton;

    @FindBy (css = ".mt-8 .text-blue-500")
    private WebElementFacade loginButtonBottom;

    @FindBy (css = ".mt-6 .text-red-500")
    private WebElementFacade firstNameNecessaryText;



}
