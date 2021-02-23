package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginLibrary {

    public loginLibrary(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    //first methid where we don't have to pass username, password
    public void loginPageAsStudent(){
        username.sendKeys("student70@library");
        password.sendKeys("FPEDLRY3");
        signInButton.click();
    }

    public void loginPageAsLibrarian(){
        username.sendKeys("librarian18@library");
        password.sendKeys("rKG2sP88");
        signInButton.click();
    }
}
