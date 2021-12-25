package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void should() {
        int amount = 900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void should1() {
        int amount = 100;
        int expected = 900;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void should2() {
        int amount = 999;
        int expected = 1;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void should3() {
        int amount = 43500;
        int expected = 500;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void should4() {
        int amount = 35387;
        int expected = 613;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void should5() {
        int amount = 10;
        int expected = 990;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

}