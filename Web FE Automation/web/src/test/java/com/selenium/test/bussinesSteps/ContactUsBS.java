package com.selenium.test.bussinesSteps;

import com.selenium.framework.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("cucumber-glue")
public class ContactUsBS extends SeleniumBase {

    public void selectOptionAndClick(WebElement we, String option){
        we.click();
        List<WebElement> listOptions = we.findElements(By.tagName("option"));

        for(WebElement w : listOptions){
            if(w.getText().equals(option)){
                w.click();
                break;
            }
        }
    }

    public ContactUsBS(WebDriver driver) {
        super(driver);
    }
}
