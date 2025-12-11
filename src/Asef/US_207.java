package Asef;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_207 extends BaseDriver {

    @Test
    public void Test() {

        //TC_208 Kupon və Hədiyyə Kartı Olmadığı halda İstifadə Cəhdi Ssenarisi

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);
        System.out.println("Gorunen URL: " + driver.getCurrentUrl());
        Assert.assertEquals("URL eyni deyil", "https://demowebshop.tricentis.com/", driver.getCurrentUrl());

        MyFunc.Wait(2);
        // Login
        WebElement LoginBtn = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a[@class='ico-login']"));
        LoginBtn.click();
        MyFunc.Wait(2);

        WebElement EmailCell = driver.findElement(By.xpath("//input[@id='Email']"));
        EmailCell.sendKeys("caps.team12@gmail.com");
        MyFunc.Wait(2);
        WebElement PasswordCell = driver.findElement(By.xpath("//input[@id='Password']"));
        PasswordCell.sendKeys("pass1234");
        MyFunc.Wait(2);
        WebElement LoginBtnInput = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        LoginBtnInput.click();
        MyFunc.Wait(2);

        WebElement UserInfo = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        Assert.assertEquals("Istifadechi adi uygun deil", "caps.team12@gmail.com", UserInfo.getText());
        System.out.println("Sehifede gorunen istifadechi adi: " + UserInfo.getText());

        WebElement ListComputerBtn = driver.findElement(By.xpath("//div[@class='listbox']/ul/li[2]/a"));
        ListComputerBtn.click();
        MyFunc.Wait(2);

        WebElement SubListNotebook = driver.findElement(By.xpath("//ul[@class='sublist']/li[2]/a"));
        SubListNotebook.click();
        MyFunc.Wait(2);

        WebElement ProductLaptop = driver.findElement(By.xpath("//h2[@class='product-title']/a"));
        ProductLaptop.click();
        MyFunc.Wait(2);
        WebElement AddtoCartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        AddtoCartBtn.click();
        MyFunc.Wait(2);
        WebElement ShoppingCartBtn = driver.findElement(By.xpath("//*[@id='topcartlink']"));
        ShoppingCartBtn.click();
        MyFunc.Wait(2);

        WebElement PrdctinCart = driver.findElement(By.xpath("//*[@class='product']/a"));
        Assert.assertEquals("Mehsul eyni deyil", "14.1-inch Laptop", PrdctinCart.getText());
        System.out.println("Sebetdeki mehsulun adi:  " + PrdctinCart.getText());
        MyFunc.Wait(2);
        //ChatGPT Edition
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 300).perform(); // 300 px ashagi
        MyFunc.Wait(2);

        WebElement ApplyCpnBtn = driver.findElement(By.xpath("//input[@value='Apply coupon']"));
        ApplyCpnBtn.click();
        MyFunc.Wait(2);
        //ChatGPT Edition
        Actions actions2 = new Actions(driver);
        actions2.scrollByAmount(0, 300).perform(); // 300 px ashagi
        MyFunc.Wait(2);

        WebElement CouponMsg = driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertEquals("Mesaj eyni deyil",
                "The coupon code you entered couldn't be applied to your order", CouponMsg.getText());
        System.out.println("Coupon xeta mesaji: " + CouponMsg.getText());

        Actions GftBtn = new Actions(driver);
        GftBtn.scrollByAmount(0, 300).perform(); // 300 px ashagi
        MyFunc.Wait(2);

        WebElement ApplyGftBtn = driver.findElement(By.xpath("//input[@value='Add gift card']"));
        ApplyGftBtn.click();
        MyFunc.Wait(2);

        Actions GftMsg = new Actions(driver);
        GftMsg.scrollByAmount(0, 300).perform(); // 300 px ashagi
        MyFunc.Wait(2);

        WebElement ApplyGftMsg = driver.findElement(By.xpath("//div[@class='giftcard-box']/div[@class='message']"));
        Assert.assertEquals("Mesaj eyni deyil",
                "The coupon code you entered couldn't be applied to your order", ApplyGftMsg.getText());
        System.out.println("Gift xeta mesaji: " + ApplyGftMsg.getText());
        MyFunc.Wait(2);

        GozleBagla();


    }
}
