package com.company;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, 0, arr.length - 1, c);
    }

    public void quickSort(T[] arr, int begin, int end, Comparator<T> c) {
        // Create an auxiliary stack
        int[] stack = new int[end - begin + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of begin and end to stack
        stack[++top] = begin;
        stack[++top] = end;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop end and begin
            end = stack[top--];
            begin = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = partition(arr, begin, end, c);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > begin) {
                stack[++top] = begin;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < end) {
                stack[++top] = p + 1;
                stack[++top] = end;
            }
        }
    }

    public int partition(T[] arr, int low, int high, Comparator<T> c) {
        T pivot = arr[high];

        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {

            if (c.compare(arr[j], pivot) <= 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}