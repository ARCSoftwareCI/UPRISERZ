package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;



public class BasePage extends PageObject {

    @FindBy(css = ".text-center.px-5 .font-black")
    private WebElementFacade homeTextOne;
    @FindBy (css = ".text-center.px-5 .font-light.text-3xl")
    private WebElementFacade homeTextTwo;


    public void verifyHomePageText(){
        homeTextOne.shouldContainOnlyText("Apasă accelerația");
        homeTextTwo.shouldContainOnlyText("în afacerea sau cariera ta");
    }

    @FindBy(css = ".mt-6.text-center ")
    private WebElementFacade  loginPageText;

    public void verificationLoginPageText(){
        loginPageText.shouldContainOnlyText("Autentificare");
    }

    @FindBy (css = ".mt-6.text-center")
    private WebElementFacade forgottenPasswordPageText;

    public void verifyForgottenPasswordPage(){
        forgottenPasswordPageText.shouldContainOnlyText("Resetează parola");
    }



}
