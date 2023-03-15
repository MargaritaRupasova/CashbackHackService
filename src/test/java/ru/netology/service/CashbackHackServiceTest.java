package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainsIfBuy500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainsIfBuy999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainsIfNotBuy() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainsIfBuy1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainsIfBuy1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }
}