package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import ro.upriserz.Utilities.Constants;


public class BasePage extends PageObject {

    @FindBy(css = ".text-center.px-5 .font-black")
    private WebElementFacade homePageTextOne;
    @FindBy (css = ".text-center.px-5 .font-light.text-3xl")
    private WebElementFacade homePageTextTwo;


    public void verifyHomePageText(){
        homePageTextOne.shouldContainOnlyText("Apasă accelerația");
        homePageTextTwo.shouldContainOnlyText("în afacerea sau cariera ta");
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


    @FindBy (css = ".text-gray-700.mt-8")
    private WebElementFacade registerPageText;

    public void verifyRegisterPageText(){
        registerPageText.shouldContainOnlyText("Ai deja un cont? Autentifică-te");
    }

    @FindBy (css = ".font-bold.mb-12.mt-8")
    private WebElementFacade dashboardHomePage;

    public void verifyDashboardPage(String userName){
        dashboardHomePage.shouldContainOnlyText("Bine ai venit, "+ userName +"! Ești gata pentru următoarea lecție?");

    }


}
