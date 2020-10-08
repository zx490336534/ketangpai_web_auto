package com.zhongxin.pags;

import com.zhongxin.common.BasePage;
import com.zhongxin.common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IndexPages extends BasePage {

    public IndexPages(WebDriver driver) {
        super(driver);
    }

    //加入课程
    public By addClassBy = By.xpath("//div[@class='ktcon1l fr']");
    //输入课程码
    public By addCodeInputBy = By.xpath("//input[@placeholder='请输入课程加课验证码']");
    //加入按钮
    public By doAddBy = By.xpath("//li[@class='cjli2']//a[@class='btn btn-positive']");
    //新课程
    public By newClassBy = By.xpath("//a[contains(text(),'Java-Web阶段考核项目专用')]");
    //新课程更多
    public By moreBy = By.xpath("//dt[@class='bgclass2']//a[@class='kdmore']");
    //退课
    public By exitClassBy = By.xpath("//dt[@class='bgclass2']//li[@class='kdli3']//a");
    //退课提示
    public By exitClassTipBy = By.xpath("//div[@class='deletetop cl']//span");
    //退课验证
    public By exitClassCodeBy = By.xpath("//input[@placeholder='请输入登录密码验证']");
    //退课按钮
    public By exitClassBtnBy = By.xpath("//li[@class='dli2']//a[@class='btn btn-positive']");

    public void addClass() {
        click(addClassBy);
        input(addCodeInputBy, Constants.CLASS_CODE);
        click(doAddBy);
    }

    public void intoClass(){
        click(newClassBy);
    }

    public void exitClass() {
        click(moreBy);
        click(exitClassBy);
        String text = getElementText(exitClassTipBy);
        Assert.assertEquals(text, Constants.NEW_CLASS_NAME);
        input(exitClassCodeBy, Constants.PASSWORD);
        click(exitClassBtnBy);
    }

}

