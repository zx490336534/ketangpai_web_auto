package com.zhongxin.homework;

import com.zhongxin.common.BaseCase;
import com.zhongxin.common.Constants;
import com.zhongxin.pags.CoursePages;
import com.zhongxin.pags.IndexPages;
import com.zhongxin.pags.LetterPages;
import com.zhongxin.pags.LoginPages;
import com.zhongxin.common.UploadFile;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//web自动化阶段项目考核
//项目：课堂派
//加入考核班级邀请码：7J6JC7
//需要用自动化框架实现的功能(需要自己设计用例，ps: 手工点点点怎么点的用例就怎么设计)如下：前置、步骤、断言
//1.1 课堂：加入班级、进入班级、 退课
//1.2 作业：上传作业、作业留言、查看作业提交状态
//1.3 私信：发送私信
//of course，你可以实现的更多！我不拦着！！
//ps：在考核班级里，测试以上功能。
//提交内容：allure与jenkins集成的测试报告的截图、代码结构截图
//这个可以提炼成项目经验哈。一定要自己独立独立独立实现。实现过程当中，遇到的问题大家记得解决&总结，积累经验哦！
//另外：如果你是用自己公司项目来实战，那么这个作业就提交你在公司项目上做的成果即可！！
public class HomeWork extends BaseCase {
    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = open(Constants.BROWSER_TYPE);
        driver.get(Constants.LOGIN_URL);
        LoginPages loginPages = new LoginPages(driver);
        loginPages.inputusername(Constants.USEARNAME);
        loginPages.inputpassword(Constants.PASSWORD);
        loginPages.clicklogin();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, Constants.INDEX_URL);
    }

    @Test
    @Description("1.1 课堂：加入班级、进入班级、 退课")
    public void test1() throws InterruptedException {
        //1.1 课堂：加入班级、进入班级、 退课
        IndexPages indexPages = new IndexPages(driver);
        indexPages.exitClass();
        indexPages.addClass();
        Thread.sleep(2000);
        indexPages.exitClass();
    }

    @Test
    @Description("私信：发送私信")
    public void test2() throws InterruptedException {
        //1.2 作业：上传作业、作业留言、查看作业提交状态
        IndexPages indexPages = new IndexPages(driver);
        indexPages.addClass();
        indexPages.intoClass();
        CoursePages coursePages = new CoursePages(driver);
        coursePages.doaddHomework();
        UploadFile uploadFile = new UploadFile();
        uploadFile.uploadFile("/Users/zhongxin/Pictures/Clarity Wallpaper/20201008102512.png");
        Thread.sleep(3000);
        coursePages.finallyadd();
    }

    @Test
    @Description("Some detailed test description")
    public void test3() throws InterruptedException {
        driver.get(Constants.CHAT_URL);
        LetterPages letterPages = new LetterPages(driver);
        letterPages.chat();

    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        close(driver);
    }
}
