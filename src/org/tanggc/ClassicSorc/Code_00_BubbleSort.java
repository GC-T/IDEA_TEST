package org.tanggc.ClassicSorc;

import org.jetbrains.annotations.Contract;
import org.junit.Test;

import java.util.Arrays;

/**
 * Create by GcTang on 2018/7/1
 */
public class Code_00_BubbleSort {

    private static void bubbleSort(int[] arr) {
        System.out.println("adsf");
        System.out.println("adsf");
        System.out.println("adsf");

        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void  quickSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }


    public static void  quickSort(int[] arr , int l ,int r){

        if (l < r){
            swap(arr,  l + (int)(Math.random()*(r - l + 1)), r);
            int[] p = partition(arr,l,r);
            quickSort(arr, l, p[0]);
            quickSort(arr, l, p[0]);
            quickSort(arr, p[1], r );
        }
    }

    private static int[]  partition(int[] arr , int l ,int r){
        int less = l - 1;
        int more = r + 1;
        int flag = arr[r];
        while (l < more) {
            if (arr[l] < flag) {
                swap(arr, ++less, l++);
            } else if (arr[l] > flag) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        return new int[] { less, more };
    }
    private static int[]  partitionNew(int[] arr , int l ,int r){
        int less = l - 1;
        int more = r + 1;
        System.out.println();
        int flag = arr[r];
        while (l < more) {
            if (arr[l] < flag) {
                swap(arr, ++less, l++);
            } else if (arr[l] > flag) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        return new int[] { less, more };
    }







    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
    private static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    private static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //(int) ((maxValue + 1) * Math.random())  产生1-100范围的值
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    @Contract(value = "null -> null", pure = true)
    @SuppressWarnings("ManualArrayCopy")
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length] ;
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    @Contract(value = "null, !null -> false; !null, null -> false; null, null -> true", pure = true)
    private static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    private static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {

//        int[] arr = generateRandomArray(100, 100);
//        printArray(arr);
//        quickSort(arr);
//        System.out.println("==================");
//        printArray(arr);



        int testTime = 10000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            bubbleSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
//        bubbleSort(arr);
        quickSort(arr);
        printArray(arr);
    }

    @Test
    public void test(){

    }

}
