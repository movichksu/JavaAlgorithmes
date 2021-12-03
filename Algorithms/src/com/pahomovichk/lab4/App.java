package com.pahomovichk.lab4;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        long timeTotal = 0L;
        initRandomArray(array);
        printArray(array);
        long start = System.nanoTime();
        quickBubbleSort(array);
        long finish = System.nanoTime();
        timeTotal = (finish - start);
        printArray(array);
        System.out.println("Words array length: " + n);
        System.out.println("Average time in nano-seconds: " + timeTotal);
    }

    public static void quickBubbleSort(int[] arr) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
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
