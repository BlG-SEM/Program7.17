package ru.vsu.cs.utils;

import java.util.Random;
import java.util.Scanner;

public class MyArrayUtils {

    public static int[] generateArr(int size, int bound) {
        Random rnd = new Random();
        // int size = rnd.nextInt(bound);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            int value = rnd.nextInt(bound);

            if (rnd.nextBoolean()) {
                value *= -1;
            }

            arr[i] = value;
        }
        return arr;
    }

    public static int[] readArrayFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input array[" + i + "] element:");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        return arr;
    }

}
