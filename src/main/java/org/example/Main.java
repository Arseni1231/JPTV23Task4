package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                int random = (int) (Math.random() * 51) * 2 + 1;
                array[i] = random;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if((i + 1) % 10 == 0){
                    System.out.println();
                }
            }
            Arrays.sort(array);
            double sum = 0;
            for (int value : array) {
                sum += value;
            }
            double average = sum / array.length;
            System.out.println("Отсортированный массив");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if((i + 1) % 10 == 0){
                    System.out.println();
                }
            }
            System.out.println("Среднее арифметическое: " + average);
        }
    }
