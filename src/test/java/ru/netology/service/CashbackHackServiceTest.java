package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    void testKashbackMin(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    void testKashbackMax(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    void testKashbackEqual(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
