package com.selenium.test.pages;

import com.google.inject.internal.asm.$ClassWriter;
import com.selenium.framework.base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("cucumber-glue")
public class HomePage extends SeleniumBase {

    //Login
    @FindBy(css = "div.dropdown.dropdown-login.dropdown-tab")
    public static WebElement myAccount;
    @FindBy(css = "a.dropdown-item.active.tr")
    public static WebElement login;
    @FindBy(name = "username")
    public static WebElement email;
    @FindBy(name = "password")
    public static WebElement password;
    @FindBy(css = "button.btn.btn-primary.btn-lg.btn-block.loginbtn")
    public static WebElement loginbutton;
    @FindBy(css = "img.img-responsive.go-right.img-thumbnail")
    public static WebElement photo;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public static WebElement home;
    @FindBy(css = "div.menu-horizontal-wrapper-02")
    public static WebElement menu;

    //Booking
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/div/div[2]/div[1]/figure/a")
    public static WebElement tour;
    @FindBy(id = "selectedAdults")
    public static WebElement adults;
    @FindBy(xpath = "//*[@id=\"selectedAdults\"]/option[1]")
    public static WebElement adultsOption1;
    @FindBy(id = "selectedChild")
    public static WebElement child;
    @FindBy(xpath = "//*[@id=\"selectedChild\"]/option[1]")
    public static WebElement childOption1;
    @FindBy(id = "selectedInfants")
    public static WebElement infant;
    @FindBy(xpath = "//*[@id=\"selectedInfants\"]/option[1]")
    public static WebElement infantOption1;
    @FindBy(css = "button.btn.btn-secondary.btn-block.mt-20.btn-action.btn-lg.loader")
    public static WebElement booknow;
    @FindBy(css = "button.btn.btn-success.btn-lg.btn-block.completebook")
    public static WebElement confirmBooking;
    @FindBy(css = "button.btn.btn-default.arrivalpay")
    public static WebElement arrivalpay;

    //Reserved status
    @FindBy(xpath = "//h4[contains(text(),'Your booking status is Unpaid')]")
    public static WebElement status;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
