package com.example.hp.laba2;

import android.os.Build;
import android.support.annotation.RequiresApi;


import java.util.ArrayList;

import java.util.List;

import static java.lang.System.out;


public class Factorial {

    static int calculate_1() {
        int result = 1;
        int a = 10;

        for (int x = 1; x <= a; x++) {
            result = result * x;
        }
        return result;
    }

}

class FuzzBuzz {


    public static void process() {
        for (int x = 1; x <= 20; x++) {
            out.println(calculate_1(x));
        }
    }

    public static String calculate_1(int x) {
        if (x % 3 != 0 && x % 5 != 0) {
            return Integer.toString(x);
        }
        return (x % 3 == 0 ? "Fuzz" : "") + (x % 5 == 0 ? "Buzz" : "");
    }
}


class OddEven {

    public static boolean isEven(int number) {

        return (number % 2) == 0;
    }


    public static List<Integer> filterEven(List<Integer> numbers) {

        List<Integer> list1 = new ArrayList<>();


        for (Integer x : numbers)
            if (x % 2 == 0) list1.add(x);


        return list1;
    }

    public static List<Integer> filterOdd(List<Integer> numbers) {

        List<Integer> list = new ArrayList<>();

        for (Integer x : numbers) {
            if (x % 2 != 0) list.add(x);
        }

        return list;
    }
}


class Result {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        OddEven x1 = new OddEven();
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        Integer c = new Integer(3);
        Integer d = new Integer(4);
        Integer e = new Integer(5);
        Integer f = new Integer(6);
        List<Integer> list = new ArrayList<>();


        out.println("Факториал 10 равен: " + factorial.calculate_1());
        fuzzBuzz.process();
        out.println();
        out.println(x1.isEven(24));
        out.println();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);


        out.println("Вывести четные числа из списка: " + x1.filterEven(list) + " ");
        out.print("Вывести нечетные числа из списка: " + x1.filterOdd(list) + " ");


    }
}

