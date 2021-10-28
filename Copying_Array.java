package com.company;

//Array.toString()- Returns a string representation of the contents of the specified array.
//The string representation consists of a list of the array's elements, enclosed in square brackets

import java.util.Arrays;

public class Copying_Array {

    public static void main(String[] args) {
        // original array
        int arr[] = {10, 20, 30, 40, 50};

        // copy array using assignment operator
        int newArr[] = arr;

        // display array
        System.out.println("Original Array = " + Arrays.toString(arr));
        System.out.println("Copied Array = " + Arrays.toString(newArr));
    }

}
