package Asef;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_209 extends BaseDriver {
    @Test

    public void Test(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);
        System.out.println("Gorunen URL: " + driver.getCurrentUrl());
        Assert.assertEquals("URL eyni deyil", "https://demowebshop.tricentis.com/", driver.getCurrentUrl());

        MyFunc.Wait(2);
        // Login
        WebElement LoginBtn = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a[@class='ico-login']"));
        LoginBtn.click();
        System.out.println("Login kliklendi ");
        MyFunc.Wait(2);

        WebElement EmailCell = driver.findElement(By.xpath("//input[@id='Email']"));
        EmailCell.sendKeys("caps.team12@gmail.com");
        System.out.println("Email = caps.team12@gmail.com");
        MyFunc.Wait(2);
        WebElement PasswordCell = driver.findElement(By.xpath("//input[@id='Password']"));
        PasswordCell.sendKeys("pass1234");
        System.out.println("Password = pass1234");
        MyFunc.Wait(2);
        WebElement LoginBtnInput = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        LoginBtnInput.click();
        System.out.println("Login klik edildi");
        MyFunc.Wait(2);

        WebElement UserInfo = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        Assert.assertEquals("Istifadechi adi uygun deil", "caps.team12@gmail.com", UserInfo.getText());
        System.out.println("Sehifede gorunen istifadechi adi: " + UserInfo.getText());

        WebElement username=driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        username.click();
        System.out.println("Username  klik edildi");
        MyFunc.Wait(2);

        WebElement Order= driver.findElement(By.xpath(
                "//div[@class='listbox']/ul/li[3]/a"));
        Order.click();
        System.out.println("Order duymesine klik edildi ");
        MyFunc.Wait(2);

        WebElement Pagetitle= driver.findElement(By.xpath(
                "//div[@class='page-title']"));
        Pagetitle.getText();
        Assert.assertEquals(
                "Bashliq eyni deyil","My account - Orders",Pagetitle.getText());
        Pagetitle.getText();
        System.out.println("Pagetitle = " + Pagetitle.getText());
        MyFunc.Wait(2);

        WebElement DetailsBtn= driver.findElement(By.xpath(
                "//div[@class='order-list'][1]/div[1]/div[2]"));
        DetailsBtn.click();
        System.out.println("Details  duymesine klik edildi");
        MyFunc.Wait(2);

        WebElement PDFinv= driver.findElement(By.xpath(
                "//div[@class='page-title']/a[@class='button-2 pdf-order-button']"));
        PDFinv.click();
        System.out.println("PDFinv duymesine klik edildi " );


        GozleBagla();



    }
}
