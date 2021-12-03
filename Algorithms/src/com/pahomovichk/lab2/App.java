package com.pahomovichk.lab2;

import java.util.Scanner;

/*Разработать алгоритм и программу простого линейного поиска
с циклом For. В качестве исходных данных использовать строку
текста, из которой необходимо выделить слова. Аргумент поиска –
слово.*/
public class App {

    public static void main(String[] args) {
        //Задаём строку текста и делим её на слова
        String str = Text.text5();
        String wordToFind;
        String[] words;
        words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter word");
        wordToFind = scanner.nextLine();

        // Выполнение алгоритма
        int wordPosition = -1;
        long timeTotal = 0L;
        for (int i = 0; i < 3; i++) {
            long start = System.nanoTime();
            wordPosition = linearAlgorithm(words, wordToFind);
            if (wordPosition == -1) {
                System.out.println("Word not found");
            }
            System.out.println("Position of word \"" + wordToFind + "\" is " + wordPosition);
            long finish = System.nanoTime();
            timeTotal = (finish - start);
        }
        long rez = timeTotal / 3;
        System.out.println("Words array length: " + words.length);
        System.out.println("Average time in nano-seconds: " + rez);

        // Вывод результатов

    }

    private static int linearAlgorithm(String[] array, String word) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                position = i;
            }
        }
        return position;
    }
}
