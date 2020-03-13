package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        1. Приветствовать любого пользователя при вводе его имени через командную строку.

        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

*/

//        2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        /*
        for (int i = args.length - 1; i >= 0; i-- ) {
            int x = Integer.parseInt(args[i]);
            System.out.println(x);
        }*/

//        3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

        /*
        int[] a = {1, 2, 3, 4, 5};
        for (int i: a) {
            System.out.println(i);
            System.out.print (i);
        }*/

//        4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

/*
        System.out.println("Enter your password");
        Scanner scanner = new Scanner(System.in);
        String password1 = scanner.nextLine();
        String password2 = "test";
        if (password1.equals(password2)) {
            System.out.println("Success");
        }
        else {
            System.out.println("False");
        }*/

//        5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer numbers:");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Total number: " + sum)
        System.out.println();


    }
}
