package Farid;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QrupIsi2Demo_Shop extends BaseDriver {
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


        WebElement loginBtn = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginBtn.click();
        MyFunc.Wait(2);

        WebElement gMail2 = driver.findElement(By.xpath("//input[@id='Email']"));
        gMail2.sendKeys(randomEmail);
        MyFunc.Wait(2);

        WebElement logPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        logPassword.sendKeys("12345678");
        MyFunc.Wait(2);

        WebElement loginBtn2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn2.click();
        MyFunc.Wait(2);

        WebElement productClick = driver.findElement(By.xpath("//*[text()='Build your own expensive computer']"));
        productClick.click();
        MyFunc.Wait(2);

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-74']"));
        addToCart.click();
        MyFunc.Wait(5);

        WebElement shopCart = driver.findElement(By.xpath("//*[@id='topcartlink']"));
        shopCart.click();
        MyFunc.Wait(2);

        WebElement webSelect = driver.findElement(By.xpath("//*[@class='country-input valid']"));

        Select javaSelect = new Select(webSelect);
        javaSelect.selectByIndex(17);
        MyFunc.Wait(2);

        GozleBagla();
    }
}

