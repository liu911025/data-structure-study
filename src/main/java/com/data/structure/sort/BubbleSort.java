package com.data.structure.sort;

public class BubbleSort {

    static int[] arr = {3, 5, 4, 1, 2, 6};

    public static void main(String[] args) {
        sort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
    }

    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                System.out.println("arr[" + i + "]:" + arr[i]);
                System.out.println("arr[" + j + "]:" + arr[j]);
                print(arr);
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("===================");
            }
        }
    }
}
