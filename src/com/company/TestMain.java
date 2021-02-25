package com.company;

import java.util.Comparator;

public class TestMain {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[10];
        intArr[0] = 5;
        intArr[1] = 2;
        intArr[2] = 1;
        intArr[3] = 6;
        intArr[4] = 9;
        intArr[5] = 3;
        intArr[6] = 7;
        intArr[7] = 8;
        intArr[8] = 4;
        intArr[9] = 0;

        String[] stringArr = new String[10];
        stringArr[0] = "5";
        stringArr[1] = "2";
        stringArr[2] = "1";
        stringArr[3] = "6";
        stringArr[4] = "9";
        stringArr[5] = "3";
        stringArr[6] = "7";
        stringArr[7] = "8";
        stringArr[8] = "4";
        stringArr[9] = "0";

        Sorter<Object> sorter = (Sorter) MiFactory.getInstance();

        sorter.sort(intArr, Comparator.comparing(a -> (Integer) a));
        sorter.sort(stringArr, Comparator.comparing(a -> (String) a));

        System.out.println(java.util.Arrays.toString(intArr));
        System.out.println(java.util.Arrays.toString(stringArr));

    }
}
