package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    Helper helper = new Helper();

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    public LoginPage inputUserNameOrEmail(String userNameOrEmail){
        helper.sendKeys(userNameEmailInput, userNameOrEmail);
        return this;
    }
    public LoginPage inputPassword(String password) {
        helper.sendKeys(passwordInput, password);
        return this;
    }
        public LoginPage clickButton(){
        helper.click(loginButton);
        return this;


        }





}
