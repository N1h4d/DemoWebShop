package Nihad;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _20702_SurveyResponse_Negative extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        radioButton1.click();
        MyFunc.Wait(2);

        WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        voteButton.click();

        WebElement voteError = driver.findElement(By.xpath("//div[@id='block-poll-vote-error-1']"));
        String result = voteError.getCssValue("display");

        Assert.assertTrue("Bildiriş mesajı ekranda çıxmadı",result.equals("block"));

        GozleBagla();
    }
}
