package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testUnderThousand() {

        CashbackHackService test = new CashbackHackService();
        int expected = 1;
        int actual = test.remain(999);

        Assert.assertEquals(actual, expected);

    }

    @Test
    // еще на 1000 докупить предлагает
    public void testThousand() {

        CashbackHackService test = new CashbackHackService();
        int expected = 1000;
        int actual = test.remain(1000);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void aboveTheThousand() {

        CashbackHackService test = new CashbackHackService();
        int expected = 500;
        int actual = test.remain(1500);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testZero() {

        CashbackHackService test = new CashbackHackService();
        int expected = 1000;
        int actual = test.remain(0);

        Assert.assertEquals(actual, expected);

    }

}