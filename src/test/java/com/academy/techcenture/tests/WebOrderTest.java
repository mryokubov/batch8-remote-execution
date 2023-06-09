package com.academy.techcenture.tests;

import com.academy.techcenture.pages.LoginPage;
import com.academy.techcenture.pages.OrdersPage;
import org.testng.annotations.Test;

public class WebOrderTest extends BaseTest{

    @Test
    public void viewOrdersTest(){
        LoginPage loginPage = new LoginPage(driver);
        OrdersPage ordersPage = new OrdersPage(driver);

        loginPage.navigateToLoginPage();
        loginPage.login();
        ordersPage.clickOnViewAllOrdersLink();
        ordersPage.checkAllOrders();
        ordersPage.uncheckAllOrders();
        ordersPage.deleteOrder();
        ordersPage.logout();
    }
}
