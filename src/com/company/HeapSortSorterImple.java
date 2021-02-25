package com.company;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {

        int size = arr.length;

        // build heapSort (rearrange array)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i, c);

        // one by one extract an element from heapSort
        for (int i = size - 1; i >= 0; i--) {
            // move current root to end
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heapSort
            heapify(arr, i, 0, c);
        }
    }

    // to heapify a subtree rooted with node i which is an index in array[]
    void heapify(T[] arr, int size, int i, Comparator<T> c) {
        int max = i; // initialize max as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // if left child is larger than root
        if (left < size && c.compare(arr[left], arr[max]) > 0)
            max = left;

        // if right child is larger than max
        if (right < size && c.compare(arr[right], arr[max]) > 0)
            max = right;

        // if max is not root
        if (max != i) {
            // swap
            T temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            // recursively heapify the affected sub-tree
            heapify(arr, size, max, c);
        }
    }
}