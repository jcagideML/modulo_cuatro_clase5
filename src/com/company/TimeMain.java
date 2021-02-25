package com.company;

import java.util.Comparator;

public class TimeMain {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[100000];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 99999 - i;
        }

        Time time = new Time();

        BubbleSortSorterImple<Integer> sorter = new BubbleSortSorterImple<Integer>();

        time.start();
        sorter.sort(intArr, Comparator.comparingInt(a -> a));
        time.stop();

        System.out.println("BubbleSort: " + time.elapsedTime());

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 99999 - i;
        }

        QuickSortSorterImple<Integer> sorter2 = new QuickSortSorterImple<>();

        time.start();
        sorter2.sort(intArr, Comparator.comparingInt(a -> a));
        time.stop();

        System.out.println("QuickSort: " + time.elapsedTime());

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 99999 - i;
        }

        HeapSortSorterImple<Integer> sorter3 = new HeapSortSorterImple<>();

        time.start();
        sorter3.sort(intArr, Comparator.comparingInt(a -> a));
        time.stop();

        System.out.println("HeapSort: " + time.elapsedTime());
    }
}
