package Farid;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QrupIsi2Demo_Shop_Negative extends BaseDriver {
    @Test
    public void Qrup_isi_2() {

        MyFunc.Wait(2);
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerClick = driver.findElement(By.xpath("//*[@class='ico-register']"));
        registerClick.click();
        MyFunc.Wait(2);

        WebElement maleBtn = driver.findElement(By.xpath("//*[@id='gender-male']"));
        maleBtn.click();
        MyFunc.Wait(2);

        WebElement name = driver.findElement(By.xpath("//*[@id='FirstName']"));
        name.sendKeys("Farid");
        MyFunc.Wait(2);

        WebElement surName = driver.findElement(By.xpath("//*[@id='LastName']"));
        surName.sendKeys("Misirov");
        MyFunc.Wait(2);

        String randomEmail = "random" + (int)(Math.random() * 100000) + "@gmail.com";

        WebElement gMail = driver.findElement(By.xpath("//*[@id='Email']"));
        gMail.sendKeys(randomEmail);
        MyFunc.Wait(2);

        WebElement passWord = driver.findElement(By.xpath("//*[@id='Password']"));
        passWord.sendKeys("12345678");
        MyFunc.Wait(2);

        WebElement conPass = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        conPass.sendKeys("12345678");
        MyFunc.Wait(2);

        WebElement registerAcceptBtn = driver.findElement(By.xpath("//*[@id='register-button']"));
        registerAcceptBtn.click();
        MyFunc.Wait(2);

        WebElement continueBtn = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
        continueBtn.click();
        MyFunc.Wait(2);

        WebElement logOutBtn = driver.findElement(By.xpath("//*[@class='ico-logout']"));
        logOutBtn.click();
        MyFunc.Wait(2);

        WebElement loginBtn1 = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginBtn1.click();
        MyFunc.Wait(2);

        WebElement gMail3 = driver.findElement(By.xpath("//input[@id='Email']"));
        gMail3.sendKeys("");
        MyFunc.Wait(2);

        WebElement logPassword1 = driver.findElement(By.xpath("//input[@id='Password']"));
        logPassword1.sendKeys("");
        MyFunc.Wait(2);

        WebElement loginBtn3 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn3.click();
        MyFunc.Wait(2);

        WebElement loginBt2 = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginBt2.click();
        MyFunc.Wait(2);

        WebElement gMail4 = driver.findElement(By.xpath("//input[@id='Email']"));
        gMail4.sendKeys(randomEmail);
        MyFunc.Wait(2);

        WebElement logPassword3 = driver.findElement(By.xpath("//input[@id='Password']"));
        logPassword3.sendKeys("");
        MyFunc.Wait(2);

        WebElement loginBtn4 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn4.click();
        MyFunc.Wait(2);

        WebElement loginBt3 = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginBt3.click();
        MyFunc.Wait(2);

        WebElement gMail5 = driver.findElement(By.xpath("//input[@id='Email']"));
        gMail5.sendKeys("");
        MyFunc.Wait(2);

        WebElement logPassword4 = driver.findElement(By.xpath("//input[@id='Password']"));
        logPassword4.sendKeys("123456789");
        MyFunc.Wait(2);

        WebElement loginBtn5 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn5.click();
        MyFunc.Wait(2);

        WebElement loginBt4 = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginBt4.click();
        MyFunc.Wait(2);

        WebElement gMail6 = driver.findElement(By.xpath("//input[@id='Email']"));
        gMail6.sendKeys("wrongGmail4679@gmail.com");
        MyFunc.Wait(2);

        WebElement logPassword5 = driver.findElement(By.xpath("//input[@id='Password']"));
        logPassword5.sendKeys("321654987");
        MyFunc.Wait(2);

        WebElement loginBtn6 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn6.click();
        MyFunc.Wait(2);


        GozleBagla();
    }
}

