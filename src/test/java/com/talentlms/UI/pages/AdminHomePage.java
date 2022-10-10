package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage extends BasePage {

    public AdminHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Helper helper = new Helper();

    @FindBy(xpath = "//span[@class='tl-box-title-options']")
    public WebElement adminHomeTitle;
}
