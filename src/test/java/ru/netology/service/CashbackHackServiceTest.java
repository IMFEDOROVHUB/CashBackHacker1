package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testKashbackMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testKashbackMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testKashbackEqual() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
