package com.zhongxin.pags;

import com.zhongxin.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages extends BasePage {
    public LoginPages(WebDriver driver) {
        super(driver);
    }

    public By usernameBy = By.xpath("//input[@placeholder='邮箱/账号/手机号']");
    public By passwordBy = By.xpath("//input[@placeholder='密码']");
    public By loginBy = By.xpath("//div[@class='padding-cont pt-login']//a[@class='btn-btn']");

    public void inputusername(String username) {
        input(usernameBy, username);
    }

    public void inputpassword(String password) {
        input(passwordBy, password);
    }

    public void clicklogin() {
        click(loginBy);
    }
}
