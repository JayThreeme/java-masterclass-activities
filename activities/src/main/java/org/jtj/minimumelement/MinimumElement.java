package org.jtj.minimumelement;

import java.util.Arrays;
import java.util.Scanner;
public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int cmv = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < cmv) {
                cmv = array[i];
            }
        }
        return cmv;
    }

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println("Array: " + Arrays.toString(array));
        int findmin = findMin(array);
        System.out.println("Min: "+findmin);
    }
}


//Minimum Element
//Write a method called readInteger() that has no parameters and returns an int.
//
//It needs to read in an integer from the user - this represents how many elements the user needs to enter.
//
//
//
//Write another method called readElements() that has one parameter of type int
//
//The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
//
//
//
//And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
//
//
//
//The scenario is:
//
//        1. readInteger() is called.
//
//        2. The number returned by readInteger() is then used to call readElements().
//
//        3. The array returned from readElements() is used to call findMin().
//
//        4. findMin() returns the minimum number.
//
//        [Do not try and implement this. It is to give you an idea of how the methods will be used]
//
//
//
//TIP: Assume that the user will only enter numbers, never letters.
//
//        TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.
//
//        TIP: Be extremely careful about spaces in the printed message.
//
//
//
//        NOTE: All methods should be defined as private static.
//
//NOTE: Do not add a main method to the solution code.
//
//NOTE: Classes that are not in the java.lang package should be manually imported.