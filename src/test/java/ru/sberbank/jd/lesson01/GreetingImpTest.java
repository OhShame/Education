/**
 * пакет с задачами для урока 1
 */
package ru.sberbank.jd.lesson01;

import org.junit.*;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Тестовый класс GreetingImpTest.
 */
public class GreetingImpTest {
    /**
     * Тест для класса GreetingImp.
     */
    @Test
    public void testGreetingImp() {
        GreetingImp greetingImp = new GreetingImp("Анна", "Гасанова", 1995,
                Collections.singleton("Хихи"), "репозиторий", "Телефон",
                Collections.singleton("ожидания"));
        assertEquals("Анна", greetingImp.getFirstName());
        assertEquals("Гасанова", greetingImp.getLastName());
        assertEquals(1995, greetingImp.getBirthYear());
        assertEquals(Collections.singleton("Хихи"), greetingImp.getHobbies());
        assertEquals("репозиторий", greetingImp.getRepoUrl());
        assertEquals("Телефон", greetingImp.getPhone());
        assertEquals(Collections.singleton("ожидания"), greetingImp.getCourseExpectations());


    }

}