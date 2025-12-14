package Asef;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_208 extends BaseDriver {

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

        WebElement ListComputerBtn = driver.findElement(By.xpath("//div[@class='listbox']/ul/li[2]/a"));
        ListComputerBtn.click();
        System.out.println("Computer list kliklendi");
        MyFunc.Wait(2);

        WebElement SubListNotebook = driver.findElement(By.xpath("//ul[@class='sublist']/li[2]/a"));
        SubListNotebook.click();
        System.out.println("Notebook alt list kliklendi");
        MyFunc.Wait(2);

        WebElement ProductLaptop = driver.findElement(By.xpath("//h2[@class='product-title']/a"));
        ProductLaptop.click();
        System.out.println("Alinacaq mehsul kliklendi");
        MyFunc.Wait(2);
        WebElement AddtoCartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        AddtoCartBtn.click();
        System.out.println("Add to Cart kliklendi");
        MyFunc.Wait(2);
        WebElement ShoppingCartBtn = driver.findElement(By.xpath("//*[@id='topcartlink']"));
        ShoppingCartBtn.click();
        System.out.println("Shoping Cart kliklendi");
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


        WebElement country= driver.findElement(By.xpath(
                "//select[@id='CountryId']/option[@value='8']"));
        country.click();
        System.out.println("Country bolmesinde olke sechildi");
        MyFunc.Wait(2);

        WebElement Zipcode= driver.findElement(By.xpath(
                    "//input[@id='ZipPostalCode']"));
        Zipcode.sendKeys("AZ1234");
        System.out.println("Zip kod daxil edildi ");
        MyFunc.Wait(2);


        WebElement AgreeBox=driver.findElement(By.xpath(
                    "//input[@id='termsofservice']"));
        AgreeBox.click();
        System.out.println("Agree box kliklendi");
        MyFunc.Wait(2);

        WebElement Checkout= driver.findElement(By.xpath(
                    "//button[@id='checkout']"));
        Checkout.click();
        System.out.println("Checkout duymesi kliklendi");
        MyFunc.Wait(2);

        WebElement select= driver.findElement(By.xpath(
                "//select[@id='billing-address-select']"));
        Select slctopt=new Select(select);
        slctopt.selectByValue("4616388");
        System.out.println("Billind adress bolmesinden sechim edildi");
        MyFunc.Wait(2);

        WebElement cntne=driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='Billing.save()']"));
        cntne.click();
        System.out.println("Continue duymesi kliklendi");
        MyFunc.Wait(2);
        WebElement cntneShp= driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='Shipping.save()']"));
        cntneShp.click();
        System.out.println("Continue Shiping kliklendi");
        MyFunc.Wait(2);

        WebElement Shipmtd=driver.findElement(By.xpath(
                "//ul[@class='method-list']/li[2]/div/input[@id='shippingoption_1']"));
        Shipmtd.click();
        System.out.println("Shipping methodlardan 1 sechildi");
        MyFunc.Wait(2);
        WebElement cntneShpmtd= driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='ShippingMethod.save()']"));
        cntneShpmtd.click();
        System.out.println("Continue duymesi kliklendi");
        MyFunc.Wait(2);

        WebElement Pymetd= driver.findElement(By.xpath(
                "//div[@class='payment-details']/input[@id='paymentmethod_2']"));
        Pymetd.click();
        System.out.println("payment method sechildi");
        MyFunc.Wait(2);

        WebElement cntnePymtd= driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='PaymentMethod.save()']"));
        cntnePymtd.click();
        System.out.println("Continue duymesi kliklendi");
        MyFunc.Wait(2);
        WebElement PymInfo=driver.findElement(By.xpath(
                "//select[@id='CreditCardType']"));
        Select selectop=new Select(PymInfo);
        selectop.selectByValue("MasterCard");
        System.out.println("Odenish metodu MasterCard sechildi");
        MyFunc.Wait(2);

        WebElement Crdhldnme=driver.findElement(By.xpath(
                "//input[@id='CardholderName']"));
        Crdhldnme.sendKeys("ASAF VALIYEV");
        System.out.println("Card holder name daxil edildi");
        MyFunc.Wait(2);

        WebElement CrdNum=driver.findElement(By.xpath(
                "//input[@id='CardNumber']"));
        CrdNum.sendKeys("1111 2222 3333 4444");
        System.out.println("Card number daxil edildi");
        MyFunc.Wait(2);

        WebElement DateMonth= driver.findElement(By.xpath(
                "//select[@id='ExpireMonth']"));
        Select slectMonth=new Select(DateMonth);
        slectMonth.selectByValue("4");
        System.out.println("Tarix daxiletmelerinden ay sechildi");
        MyFunc.Wait(2);

        WebElement ExpireYear= driver.findElement(By.xpath(
                "//select[@id='ExpireYear']"));
        Select slectYear=new Select(ExpireYear);
        slectYear.selectByValue("2025");
        System.out.println("Tarix daxiletmelerinden il sechildi");
        MyFunc.Wait(2);

        WebElement CrdCode= driver.findElement(By.xpath(
                "//input[@id='CardCode']"));
        CrdCode.sendKeys("1234");
        System.out.println("Card kodu daxil edildi");
        MyFunc.Wait(2);

        WebElement cntnePymInfo= driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='PaymentInfo.save()']"));
        cntnePymInfo.click();
        System.out.println("Continue duymesi kliklendi");
        MyFunc.Wait(2);

        WebElement OrderInfo= driver.findElement(By.xpath(
                "//div[@class='order-review-data']"));
        OrderInfo.getText();
        Assert.assertEquals("Duzgun deyil","Billing Address\n" +
                "Team Twelve\n" +
                "Email: caps.team12@gmail.com\n" +
                "Phone: +994503001122\n" +
                "Fax:\n" +
                "sdfgsdgsd\n" +
                "baku , az123123\n" +
                "Azerbaijan\n" +
                "Payment Method\n" +
                "Credit Card\n" +
                "Shipping Address\n" +
                "Team Twelve\n" +
                "Email: caps.team12@gmail.com\n" +
                "Phone: 1212121212121\n" +
                "Fax:\n" +
                "sasas\n" +
                "sasas , 121212\n" +
                "Azerbaijan\n" +
                "Shipping Method\n" +
                "Next Day Air",OrderInfo.getText());
        System.out.println("OrderInfo = " + OrderInfo.getText());
        System.out.println("Odenish melumatlarinin duzgundluyu yoxlanildi");

        MyFunc.Wait(2);

        WebElement Confirm= driver.findElement(By.xpath(
                "//div[@class='buttons']/input[@onclick='ConfirmOrder.save()']"));
        Confirm.click();
        System.out.println("Confirm duymesi kliklendi");
        MyFunc.Wait(2);

        WebElement OrderMsg= driver.findElement(By.xpath(
                "//div[@class='page-body checkout-data']/div/div[@class='title']"));
        System.out.println("OrderMsg = " + OrderMsg.getText());

        Assert.assertEquals("Eyni deyil",
                "Your order has been successfully processed!",OrderMsg.getText());
        System.out.println("Order message yoxlanildi"+OrderMsg.getText());









        GozleBagla();


    }
}
