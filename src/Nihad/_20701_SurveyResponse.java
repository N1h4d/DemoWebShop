package Nihad;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _20701_SurveyResponse extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);

        WebElement loginPageButton = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginPageButton.click();
        MyFunc.Wait(2);

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='Email']"));
        emailInput.sendKeys("blacksea@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordInput.sendKeys("pass1234");
        MyFunc.Wait(2);

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
        MyFunc.Wait(2);

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        radioButton1.click();
        MyFunc.Wait(2);

        WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        voteButton.click();
        MyFunc.Wait(2);

        GozleBagla();
    }
}
