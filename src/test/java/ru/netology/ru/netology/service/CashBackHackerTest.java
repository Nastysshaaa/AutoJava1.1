package ru.netology.ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {
    CashBackHacker service = new CashBackHacker();
    @Test
    public void shouldLeaveRemainder1() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldLeaveRemainder2() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeaveTheRemainder3() {
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeaveTheRemainder4() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeaveTheRemainder5() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}