package ru.sberbank.jd.lesson02;


import org.junit.Assert;
import org.junit.Test;

/**
 * Класс для тестирования NodImpl.
 */
public class NodImplTest {

    /**
     * Тест с двумя положительными числами.
     */
    @Test
    public void testPositive() {
        Nod n = new NodImpl();
        int result = n.calculate(17,9);
        Assert.assertEquals(result, 1);
    }

    /**
     * Тест с отрицательным числом.
     */
    @Test
    public void testNegative() {
        Nod n = new NodImpl();
        int result = n.calculate(-17,9);
        Assert.assertEquals(result, 1);
    }

    /**
     * Первый аргумент - ноль.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testZeroFirst() {
        Nod n = new NodImpl();
        int result = n.calculate(0,9);
        Assert.assertEquals(result, 0);
    }

    /**
     * Второй аргумент - ноль.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testZeroSecond() {
        Nod n = new NodImpl();
        int result = n.calculate(17,0);
        Assert.assertEquals(result, 0);
    }

    /**
     * Оба аргумента - ноли.
     */
    @Test
    public void testZeroBoth() {
        Nod n = new NodImpl();
        int result = n.calculate(0,0);
        Assert.assertEquals(result, 0);
    }
}
