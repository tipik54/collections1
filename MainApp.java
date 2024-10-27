package ru.kaznu.ruslan.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //Реализуйте метод, принимающий в качестве аргументов числа min и max,
        // и возвращающий ArrayList с набором последовательных значений в
        // указанном диапазоне (min и max включительно, шаг - 1);
        //Реализуйте метод, принимающий в качестве аргумента список целых чисел,
        // суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
        //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        // метод должен переписать каждую заполненную ячейку списка указанным числом;
        //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        // увеличивающий каждый элемент списка на указанное число;

//        addFromMinToMax(5,10);
//        listSum(1,2,3,4,5,6);
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        sumListElementWithValue(1, (ArrayList<Integer>) myList);
//        setListElementWithValue(4, (ArrayList<Integer>) myList);

    }

    public static void sumListElementWithValue (int value, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + value);
        }
        System.out.println(arrayList);
    }

    public static void setListElementWithValue (int value, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, value);
        }
        System.out.println(arrayList);
    }

    public static void listSum (int... nums){
        int sum = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            arrayList.add(nums[i]);
        }
        for (int j = 0; j < arrayList.size(); j++){
            arrayList.get(j);
            if (arrayList.get(j) > 5){
               sum += arrayList.get(j);
            }
        }
        System.out.println(sum);
    }

    public static void addFromMinToMax (int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
    }

}
