package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Utility {
    //==========userShouldNavigateToRegisterPageSuccessfully()==========
    //navigate to "register" and click on it\
    By Register = By.xpath("//a[contains(text(),'Register')]");
    public void clickOnRegister() {
        clickOnElement(Register);
    }
    // validate text
    By RegisterText = By.xpath("//h1[contains(text(),'Register')]");
    public String verifyRegisterText(){
        return getTextFromElement(RegisterText);
    }

// ================= userSholdRegisterAccountSuccessfully()===================

    //Select gender radio button
    By Gender = By.xpath("//input[@id='gender-female']");
    public void selectGender(){
        clickOnElement(Gender);
    }
    //Enter First name
    By FirstName = By.xpath("//input[@id='FirstName']");
    public void enterFirstName(String name){
        sendTextToElement(FirstName,name);
    }
    //Enter Last name
    By LastName = By.xpath("//input[@id='LastName']");
    public void enterLastName(String lastname){
        sendTextToElement(LastName,lastname);
    }
    //Select Day Month and Year
    By Day = By.xpath("//select[@name='DateOfBirthDay']");
    public void selectDayFromIndex(int day){
        selectByIndexFromDropDown(Day,day);
    }
    By Month = By.xpath("//select[@name='DateOfBirthMonth']");
    public void selectMonthFromDropDown(String month){
        selectByValueFromDropdown(Month,month);
    }

    By Year = By.xpath("//select[@name='DateOfBirthYear']");
    public void selectYearFromDropDown(String year){
        selectByVisibleTextFromDropDown(Year,year);
    }

    //Enter Email address
    By  Email = By.xpath("//input[@id='Email']");
    public void enterEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(Email,"username" + randomInt + "@gmail.com");
        System.out.println("username" + randomInt + "@gmail.com" );


    }

    //Enter Password
    By Password = By.xpath("//input[@id='Password']");
    public void enterPassword(String password){
        sendTextToElement(Password,password);
    }
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    public void enterConfirmPassword(String confirmpassword){
        sendTextToElement(ConfirmPassword,confirmpassword);
    }
    By Register1 = By.id("register-button");
    public void clickOnRegister1(){
        clickOnElement(Register1);
    }
    By RegisterText1 = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String verifyRegisterText1(){
        return getTextFromElement(RegisterText1);
    }
}
