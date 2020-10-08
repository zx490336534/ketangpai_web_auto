package com.zhongxin.pags;

import com.zhongxin.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursePages extends BasePage {
    public CoursePages(WebDriver driver) {
        super(driver);
    }

    //作业
    public By homework = By.linkText("作业");
    //上传作业
    public By uploadHomework = By.linkText("上传作业");
    //添加作业文件
    public By addHomework = By.xpath("//*[@id=\"viewer-handup\"]/div[2]/div[2]/div/div/a");
    //提交
    public By upload = By.linkText("提交");

    public void doaddHomework() {
        click(homework);
        click(uploadHomework);
        click(addHomework);
    }

    public void finallyadd() {
        click(upload);
    }

}
