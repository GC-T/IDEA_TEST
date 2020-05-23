package org.tanggc.ClassicSorc;


import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class FastSortTest {

    public static void selectSort(int[] arr) {


        System.out.println("adsfs");
        System.out.println("adsfs");



        if (arr == null || arr.length == 0){
            return ;
        }
        for (int i = 0; i < arr.length -1  ;i++ ){
            for (int j = i + 1 ;j < arr.length ;j++){
                if (arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }




    public static  void fastSort(int[] arr){
        if (arr == null || arr.length == 0){
            return ;
        }

        fastSort( arr, 0, arr.length - 1) ;

    }

    public static  void fastSort(int[] arr, int l, int r){

        if (l < r){
            swap(arr, l + (int)(Math.random() * (r - l + 1)),r);
            int[] p = partition(arr, l ,r);
            fastSort(arr, l, p[0]);
            fastSort(arr, p[1], r);
        }

    }


    private static int[] partition(int[] arr, int l ,int r){
        int less = l - 1;
        int more = r + 1;
        int compare = arr[r];
        while (l < more){
            if (arr[l] < compare){
                swap(arr,++less,l++);
            }else if(arr[l] > compare){
                swap(arr,--more, l);
            }else{
                l++;
            }
        }
        return new int[]{less,more};
    }








    public static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }




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

    private static void comparator(int[] arr) {
        Arrays.sort(arr);
    }


    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length] ;
        for (int i = 0; i < arr.length; i++) {
        }
        return res;
    }

    // for test
    private static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //(int) ((maxValue + 1) * Math.random())  产生1-100范围的值
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        System.out.println();
        return arr;
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



    public static void main(String[] args) {


//        int[] arr = generateRandomArray(111, 111);
//        insertionSort(arr);
//        printArray(arr);
//       int tar = BinarySearch(arr,arr[13]);
//        System.out.println("after sort" + tar);


        int testTime = 100000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            fastSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        selectSort(arr);
        System.out.println("after sort");

        printArray(arr);

    }















}




