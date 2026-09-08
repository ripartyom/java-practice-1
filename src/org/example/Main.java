package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int YEAR = 2026;
        int year;
        task2();
        task3();
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.print("Введите ваш год рождения:");
            year = in.nextInt();

            if(year > YEAR) {
                System.out.println("Ошибка, год слишком большой!");
            } else {
                break;
            }
        }

        int age = YEAR - year;

        if(age < 18){
            System.out.println("Вы несовершеннолетний.");
        } else if (age >= 18 && age <= 65){
            System.out.println("Вы взрослый.");
        } else {
            System.out.println("Вы пенсионер.");
        }
    }





    public static void task2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                count++;
            }
        }

        System.out.println("Сумма чётных элементов: " + sum);
        System.out.println("Кол-во нечётных элементов: " + count);
    }


    public static void task3() {
        for (int i = 1; i <= 5; i++) {
            for (int g = 1; g <= 10; g++) {
                System.out.println(i + " * " + g + " = " + (i * g));
            }
            System.out.println();
        }
    }
}



