package ro.upriserz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://upriserz.ro")
public class HomePage extends BasePage {

    @FindBy(id = "onetrust-close-btn-container")
    private WebElementFacade cookiesButton;
//    You have to close the cookies before you continue



    @FindBy(css = "nav div")
    private WebElementFacade loginButton;
//    Autentifică-te
    @FindBy(css = "nav a svg")
    private WebElementFacade homeButton;

    public void clickOnHomeButton(){
        clickOn(homeButton);
    }

    public void cickOnCookiesButton(){
        clickOn(cookiesButton);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }







}
