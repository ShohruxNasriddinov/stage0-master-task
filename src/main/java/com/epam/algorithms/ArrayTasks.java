package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String season[]={"winter", "spring", "summer", "autumn"};
        return season;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] num = new int[length];
        for (int i = 1; i < length; i++) {
            num[i]=i;
        }
        return num;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            a+=arr[i];
        }
        return a;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number)
                return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int i=0;
        int j = arr.length-1;
        while (arr.length/2>i) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                count++;
        }
        int[] newArr=new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                newArr[i]=arr[i];
            }
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j+1; k < arr[i].length; k++) {
                    if (arr[i][j]>arr[i][k]){
                        int temp=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=temp;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].length > arr[i + 1].length){
                int[] a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
        }
        return arr;
    }

}
