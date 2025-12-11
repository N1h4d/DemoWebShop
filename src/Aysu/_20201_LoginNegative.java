package Aysu;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _20201_LoginNegative extends BaseDriver {

    @Test
    public void test2() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerClick = driver.findElement(By.className("ico-register"));
        registerClick.click();
        MyFunc.Wait(2);

        WebElement gender = driver.findElement(By.id("gender-female"));
        gender.click();
        MyFunc.Wait(2);

        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Team");
        MyFunc.Wait(2);

        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("twelve");
        MyFunc.Wait(2);

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("capss12@gmail.com");
        MyFunc.Wait(2);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass1234");
        MyFunc.Wait(2);

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("pass1234");
        MyFunc.Wait(2);

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        MyFunc.Wait(2);

        WebElement negativeMessage = driver.findElement(By.xpath("//*[@class='message-error']"));

        Assert.assertTrue(negativeMessage.getText().equals("The specified email already exists"));

        GozleBagla();
    }
}
