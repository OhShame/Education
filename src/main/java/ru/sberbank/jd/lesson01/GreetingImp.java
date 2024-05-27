/**
 * пакет с задачами для урока 1.
 */

package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс по заданию 1.
 */
public class GreetingImp implements Greeting {

    /**
     * Объявляем переменную имени.
     */
    private final String firstName;

    /**
     * Объявляем переменную фамилии.
     */
    private final  String lastName;

    /**
     * Объявляем переменную даты рождения.
     */
    private final int birthYear;

    /**
     * Объявляем переменную для хобби.
     */
    private final Set<String> hobbies;

    /**
     * Объявляем переменную для урла репозитория.
     */
    private final String repoUrl;

    /**
     * Объявляем переменную для телефона.
     */
    private final String phone;

    /**
     * Объявляем переменную для ожиданий.
     */
    private final Set<String> courseExpectations;

    /**
     * Конструктор класса с параметрами.
     */

    @SuppressWarnings("checkstyle:HiddenField")
    public GreetingImp(String firstName, String lastName, int birthYear,
                       Collection<String> hobbies, String repoUrl,
                       String phone, Collection<String> courseExpectations) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.hobbies = Collections.unmodifiableSet(new HashSet<>(hobbies));
        this.repoUrl = repoUrl;
        this.phone = phone;
        this.courseExpectations =
                Collections.unmodifiableSet(new HashSet<>(courseExpectations));
    }

    /**
     *Геттер для имени (перегружен от интерфейса).
     */
    @Override
    public String getFirstName() {
        return firstName;
    }
    /**
     *Геттер для фамилии (перегружен от интерфейса).
     */

    @Override
    public String getLastName() {
        return lastName;
    }
    /**
     *Геттер длядаты рождения (перегружен от интерфейса).
     */

    @Override
    public int getBirthYear() {
        return birthYear;
    }
    /**
     *Геттер для коллекции с хобби (перегружен от интерфейса).
     */

    @Override
    public Collection<String> getHobbies() {
        return hobbies;
    }
    /**
     *Геттер для репозитория (перегружен от интерфейса).
     */

    @Override
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     *Геттер для телефона (перегружен от интерфейса).
     */

    @Override
    public String getPhone() {
        return phone;
    }
    /**
     *Геттер для ожиданий от курса(перегружен от интерфейса).
     */

    @Override
    public Collection<String> getCourseExpectations() {
        return courseExpectations;
    }
    /**
     *псвм метод для инициализации объекта (себя х).
     */

    public static void main(String[] args) {
        String firstName = "Анна";
        String lastName = "Гасанова";
        int birthYear = 1995;
        Collection<String> hobbies = new ArrayList<>();
        hobbies.add("видеоигры");
        hobbies.add("чтение");
        String repoUrl = "https://github.com/OhShame/ForJava";
        String phone = "+79999999999";
        // У меня публичный репозиторий, так что тут девяточки х)
        Collection<String> courseExpectations = new ArrayList<>();
        courseExpectations.add("начать что-то понимать");

        GreetingImp annGasanova = new GreetingImp(firstName, lastName,
                birthYear, hobbies, repoUrl, phone, courseExpectations);
    }
}
