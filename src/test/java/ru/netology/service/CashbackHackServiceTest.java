package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainsIfBuy500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainsIfBuy999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainsIfBuy1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainsIfBuy1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainsIfNotBuy() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}