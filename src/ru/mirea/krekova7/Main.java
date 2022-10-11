package ru.mirea.krekova7;

import java.util.Scanner;
import java.util.*;
public class Main {
    static int sum(int number) {
        return (number == 0) ? 0 : (number % 10) + sum(number / 10);
    }
    static int one() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return one() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return one() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return one() + n + m;
            } else {
                return n + m;
            }
        }
    }
    static void triangle(int amount) {
        int k = 0;
        int j = 1;
        int result = 0;
        for (int i = 1; i <= amount; i++) {
            result += i;
        }
        for (int i = 0; i < result; i++) {
            System.out.print(j + " ");
            k++;
            if (j == k) {
                k = 0;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("#1 Треугольная последовательность. Дана монотонная последовательность, в которой каждое натуральное число k встречается \n" +
                "    ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,… По данному натуральному n выведите первые n членов этой последовательности.");
        triangle(5);
        System.out.println();
        System.out.println("#5 Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр.");
        Scanner in = new Scanner(System.in);
        System.out.print("  Введи число N: ");
        int N = in.nextInt();
        System.out.println("  Сумма цифр числа N: " + sum(N));
        System.out.println("#11 Количество единиц. Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой последовательности встречается число 1.");
        System.out.println("  Введи числа: ");
        System.out.print("  Результат: " + one());

    }
}