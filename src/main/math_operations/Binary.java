package main.math_operations;

public class Binary {
    public static int[] arr = {0, 1, 2, 55, 67, 102, 33, 34};

    public static int number(int val, int[] arr, int fI, int lasI) {
        int mid = fI + (lasI - fI) / 2;
        if (val < arr[mid]) {
            return number(val, arr, fI, mid - 1);
        } else if (val > arr[mid]) {
            return number(val, arr, mid + 1, lasI);
        } else {
            return mid;
        }
    }

}