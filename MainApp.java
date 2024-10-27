package ru.kaznu.ruslan.collections;

import java.util.ArrayList;
import java.util.Arrays;

import static ru.kaznu.ruslan.collections.Employee.findMin;
import static ru.kaznu.ruslan.collections.Employee.info;


public class MainApp {
    public static void main(String[] args) {

        //Создайте класс Сотрудник с полями: имя, возраст;
        //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
        //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
        // и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
        //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
        // и проверяющий что средний возраст сотрудников превышает указанный аргумент;
        //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.

        ArrayList<Employee> arrayLists = new ArrayList<>(Arrays.asList(
                new Employee("Alexey", 40),
                new Employee("Ruslan", 20),
                new Employee("Dias", 18),
                new Employee("Ilya", 22),
                new Employee("Beksultan", 21)
        ));
//        info(arrayLists);
//        Employee.elderThan(arrayLists, 21);
//        Employee.minAverageAge(arrayLists, 25);
        findMin(arrayLists);
    }
}
