package ru.netology.cashback;

public class CashBackTest {
    @org.junit.Test
    public void cashBackAverageValue() {
        CashBack service = new CashBack();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test   ////bag
    public void cashBackLimitValue() {
        CashBack service = new CashBack();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void cashBackLessLimitValue() {
        CashBack service = new CashBack();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void cashBackOverLimitValue() {
        CashBack service = new CashBack();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void cashBackZeroValue() {
        CashBack service = new CashBack();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void cashBackOneValue() {
        CashBack service = new CashBack();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void cashBackNegativeValue() {
        CashBack service = new CashBack();
        int amount = -1;
        int expected = 1001;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }
}
