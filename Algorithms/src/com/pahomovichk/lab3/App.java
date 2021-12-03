package com.pahomovichk.lab3;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int x = 54;
        long timeTotal = 0L;
        int n = 5000;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);

        long start = System.nanoTime();
        int index = recursiveLinearSearch(array, 0, array.length - 1, x);
        long finish = System.nanoTime();
        timeTotal = (finish - start);

        printArray(array);

        if (index != -1) System.out.println("Position of element \"" + x + "\" is " + index);
        else System.out.println("Element " + x + " was not found");
        System.out.println("Words array length: " + n);
        System.out.println("Average time in nano-seconds: " + timeTotal);
    }

    static int recursiveLinearSearch(int[] arr, int l, int r, int x) {
        if (r < l) return -1;
        if (arr[l] == x) return l;
        if (arr[r] == x) return r;
        return recursiveLinearSearch(arr, l + 1, r - 1, x);
    }

    public static void initRandomArray(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((2 * n + 1)) - n;
        }
    }

    static void initArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
