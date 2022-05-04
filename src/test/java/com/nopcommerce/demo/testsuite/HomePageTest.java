package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void verifyUserShouldNavigateToComputerPage(){
        homePage.selectMenu("Computers");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Computers";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToElectronicsPage(){
        homePage.selectMenu("Electronics");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Electronics";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToApparelPage(){
        homePage.selectMenu("Apparel");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Apparel";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToDigitaldownloadsPage(){
        homePage.selectMenu("Digital downloads");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Digital downloads";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToBooksPage(){
        homePage.selectMenu("Books");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Books";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToJewelryPage(){
        homePage.selectMenu("Jewelry");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Jewelry";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToGiftCardsPage(){
        homePage.selectMenu("Gift Cards");
        String actualText = homePage.verifyTextOfTopMenuTab();
        String expectedText = "Gift Cards";
        Assert.assertEquals(expectedText,actualText);
    }
}
