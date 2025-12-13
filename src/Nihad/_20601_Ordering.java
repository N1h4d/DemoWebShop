package Nihad;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _20601_Ordering extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);

        WebElement loginPageButton = driver.findElement(By.xpath("//*[@class='ico-login']"));
        loginPageButton.click();
        MyFunc.Wait(2);

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='Email']"));
        emailInput.sendKeys("caps.team104@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordInput.sendKeys("pass1234");
        MyFunc.Wait(2);

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
        MyFunc.Wait(2);

        WebElement computerSection = driver.findElement(By.xpath("//*[@class='top-menu']/li[2]/a"));
        computerSection.click();
        MyFunc.Wait(2);

        WebElement notebooksCategory = driver.findElement(By.xpath("//h2[@class='title']/a[@title='Show products in category Notebooks']"));
        notebooksCategory.click();
        MyFunc.Wait(2);

        WebElement laptop = driver.findElement(By.xpath("//div[@class='product-item']/div[@class='picture']/a[@title='Show details for 14.1-inch Laptop']"));
        laptop.click();
        MyFunc.Wait(2);

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addToCart.click();
        MyFunc.Wait(2);

        Assert.assertEquals(
                "(1)",
                driver.findElement(By.xpath("//span[@class='cart-qty']")).getText()
        );

        MyFunc.Wait(2);

        WebElement shoppingCart = driver.findElement(By.xpath("//li[3]/a[@class='ico-cart']"));
        shoppingCart.click();
        MyFunc.Wait(2);

        WebElement countrySelectElement = driver.findElement(By.xpath("//select[@id='CountryId']"));
        Select countrySelect = new Select(countrySelectElement);
        countrySelect.selectByVisibleText("Azerbaijan");

        WebElement postalCodeInput = driver.findElement(By.xpath("//input[@id='ZipPostalCode']"));
        postalCodeInput.sendKeys("AZ1000");
        MyFunc.Wait(2);

        WebElement agreeCheckbox = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agreeCheckbox.click();
        MyFunc.Wait(2);

        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
        MyFunc.Wait(2);

        countrySelectElement = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        countrySelect = new Select(countrySelectElement);
        countrySelect.selectByVisibleText("Azerbaijan");

        WebElement cityInput = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
        cityInput.sendKeys("Baku");

        WebElement adress1 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
        adress1.sendKeys("Apartment 12");

        WebElement billingPostalCode = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
        billingPostalCode.sendKeys("AZ1000");

        WebElement phoneNumberInput = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
        phoneNumberInput.sendKeys("+994503001122");
        MyFunc.Wait(3);

        WebElement continueButton = driver.findElement(By.xpath("//div[@id='billing-buttons-container']/input[@class='button-1 new-address-next-step-button']"));
        continueButton.click();
        MyFunc.Wait(2);

        continueButton = driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input[@class='button-1 new-address-next-step-button']"));
        continueButton.click();
        MyFunc.Wait(2);

        WebElement shippingMethod = driver.findElement(By.xpath("//div/input[@id='shippingoption_1']"));
        shippingMethod.click();
        MyFunc.Wait(1);
        continueButton = driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input[@class='button-1 shipping-method-next-step-button']"));
        continueButton.click();
        MyFunc.Wait(2);

        WebElement creditCardButton = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        creditCardButton.click();
        MyFunc.Wait(2);

        continueButton = driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input[@class='button-1 payment-method-next-step-button']"));
        continueButton.click();
        MyFunc.Wait(2);

        WebElement cardHolderName = driver.findElement(By.xpath("//input[@id='CardholderName']"));
        cardHolderName.sendKeys("capsacademy");

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='CardNumber']"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement selectYear = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        Select yearOption = new Select(selectYear);
        yearOption.selectByVisibleText("2032");

        WebElement cardCode = driver.findElement(By.xpath("//input[@id='CardCode']"));
        cardCode.sendKeys("123");
        MyFunc.Wait(2);
        continueButton = driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input[@class='button-1 payment-info-next-step-button']"));
        continueButton.click();
        MyFunc.Wait(2);

        WebElement confirmButton = driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input[@class='button-1 confirm-order-next-step-button']"));
        confirmButton.click();
        MyFunc.Wait(3);
        String orderNumber = driver.findElement(By.xpath("//*[@class='details']/li[1]")).getText();

        driver.findElement(By.xpath("//div[@class='header-logo']/a")).click();
        MyFunc.Wait(3);

        WebElement orders = driver.findElement(By.xpath("//div[@class='column my-account']/ul/li[2]/a"));
        orders.click();
        WebElement myAccountOrders = driver.findElement(By.xpath("//div[@class='section order-item']/div[@class='title']/strong"));
        MyFunc.Wait(3);

        Assert.assertTrue(
                "Order nomresi duzgun deyil",
                orderNumber.substring(orderNumber.length() - 7).trim()
                        .equals(myAccountOrders.getText().substring(myAccountOrders.getText().length() - 7).trim())
        );

        System.out.println("Order Number: " + orderNumber.substring(orderNumber.length() - 7).trim());
        System.out.println("My Account Orders -> Order Number: " + myAccountOrders.getText().substring(myAccountOrders.getText().length() - 7).trim());
        GozleBagla();

    }
}
