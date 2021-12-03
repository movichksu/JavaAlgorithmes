package com.pahomovichk.lab1;

import java.math.BigDecimal;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        int n = 5_000;
        int[][] arr = new int[n][n];
        initRandomMatrix(arr, 2);
       // printArray(arr);
        elementsProduct(arr);
        System.out.println("Current Time in milliseconds = " + System.currentTimeMillis());
    }

    static void elementsProduct(int[][] arr) {
        BigDecimal product = new BigDecimal(1);
        BigDecimal element = new BigDecimal(1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                element = new BigDecimal(arr[i][j]);
                product = product.multiply(element);
            }
        }
        System.out.println("THE PRODUCT OF ELEMENTS = " + product);
    }

    public static void initRandomMatrix(int[][] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(n) + 1;
            }
        }
    }

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
