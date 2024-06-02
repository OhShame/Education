package ru.sberbank.jd.lesson02;

/**
 * Класс для реализации интерфейса Nod.
 */
public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     * Перегружен из интерфейса.
     */
    @Override
    public int calculate(int first, int second) {
        if (first == 0 || second == 0) {
            return 0;
        }
        int result = first;
        while (second != 0) {
            int temp = second;
            second = result % second;
            result = temp;
        }
        return result;
    }
}
