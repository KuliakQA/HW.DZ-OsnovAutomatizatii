package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdd0() {
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd100() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddBig() {
        int amount = 100;
        int expected = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd1() {
        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddHalf() {
        int amount = 43500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThanAHalf() {
        int amount = 35387;
        int expected = 613;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddAlmostAThousand() {
        int amount = 10;
        int expected = 990;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}