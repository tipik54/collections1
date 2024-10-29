package ru.kaznu.ruslan.collections;

import java.util.ArrayList;

public class Employee {

    public String name;
    public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//Создайте класс Сотрудник с полями: имя, возраст;
    //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    // и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
    // и проверяющий что средний возраст сотрудников превышает указанный аргумент;
    //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.

    public static void info(ArrayList<Employee> arrayLists) {
        for (int i = 0; i < arrayLists.size(); i++) {
            Employee employee = arrayLists.get(i);
            System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge());
        }

    }

    public static void elderThan(ArrayList<Employee> arrayLists, int age) {

        for (int i = 0; i < arrayLists.size(); i++) {
            Employee employee = arrayLists.get(i);
            if (employee.getAge() >= age) {
                System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge());
            }
        }

    }

    public static boolean minAverageAge(ArrayList<Employee> arrayLists, int averageAge) {
        int average = 0;
        for (int i = 0; i < arrayLists.size(); i++) {
            Employee employee = arrayLists.get(i);
            average += employee.getAge();
            System.out.println(employee.getAge());

        }
        if (average / arrayLists.size() >= averageAge) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static Employee findMin(ArrayList<Employee> arrayLists){
        int min = 100000;
        Employee youngest = null;
        for (int i = 0; i < arrayLists.size(); i++) {
            if (arrayLists.get(i).getAge() < min) {
                min = arrayLists.get(i).getAge();
                youngest = arrayLists.get(i);
            }
        }
        System.out.println("Name: " + youngest.getName() + " Age: " + youngest.getAge());
        return youngest;
    }
}
