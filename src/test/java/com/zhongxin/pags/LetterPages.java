package com.zhongxin.pags;

import com.zhongxin.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LetterPages extends BasePage {

    public LetterPages(WebDriver driver) {
        super(driver);
    }

    //查找聊天人员
    public By searchName = By.xpath("//*[@id=\"chat\"]/div[2]/div[1]/input");
    //聊天输入框
    public By chatView = By.xpath("//*[@id=\"chat\"]/div[3]/div[3]/textarea");
    //发送按钮
    public By sendMessage = By.xpath("//*[@id=\"chat\"]/div[3]/div[3]/div[2]/a");


    public void chat() {
        input(searchName, "柠檬班-星星");
        click(By.xpath("//span[@title=\"柠檬班-星星\"]"));
        input(chatView, "作业测试。。。");
        click(sendMessage);
    }
}
