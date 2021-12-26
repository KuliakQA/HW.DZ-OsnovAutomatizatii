package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldAdd100() {
        int amount = 900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd0() {
        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddBig() {
        int amount = 100;
        int expected = 900;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd1() {
        int amount = 999;
        int expected = 1;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddHalf() {
        int amount = 43500;
        int expected = 500;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddMoreHalf() {
        int amount = 35387;
        int expected = 613;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddNothing() {
        int amount = 15000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAddFastThousand() {
        int amount = 10;
        int expected = 990;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

}