package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class LoginPage extends Utility {
    //==================userShouldNavigateToLoginPageSuccessfully====================
// click on LogIn link
    By LogIn = By.xpath("//a[@class='ico-login']");

    public void clickOnLogIn() {
        clickOnElement(LogIn);
    }

    By VerifyLoginText = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/h1");
    public String VerifyLoginText(){
        return getTextFromElement(VerifyLoginText);
    }

//==================userShouldLoginSuccessfullyWithValidCredentials====================

    By Email = By.id("Email");
    public void enterEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(Email,"username" + randomInt + "@gmail.com");
    }
    public void enterEmail1(String email){
        sendKeysToElement(Email,email);

    }

    By PassWord = By.id("Password");
    public void enterPassword(String password){
        sendKeysToElement(PassWord,password);
    }

    By LogIn1 =By.xpath("//button[@class='button-1 login-button']");
    public void clickOnLogIn1() {
        clickOnElement(LogIn1);
    }
    By LogOutText = By.xpath("//a[contains(text(),'Log out')]");
    public String verifyLogoutText() {
        return getTextFromElement(LogOutText);
    }

//========================= verifyTheErrorMessage==========================


    By ErrorText = By.xpath("//div[@class='message-error validation-summary-errors']");
    public String verifyErrorText(){
        return getTextFromElement(ErrorText);
    }
}
