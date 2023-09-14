package externalExercise;

import java.util.ArrayList;

// import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayArray {

    static void getIndexFromIntArray(int[] array, int items) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == items) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    static ArrayList<Integer> extractSubset(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array1.length == 0) {
            return result;
        }

        for (int i = 0; i < array1.length; i++) {
            if (Arrays.binarySearch(array2, array1[i]) < 0) {
                result.add(array1[i]);
            }
        }
        return result;
    }

    // general method for get subset????????

    public static void main(String[] args) {
        int[] myintarray = { 2, 3, 121, 4, 5 };
        // // find index of an int array
        // // solution 1: loop
        // int element = 1;
        // getIndexFromIntArray(myintarray, element);
        // //solution 2: .binarySearch()
        // int index = Arrays.binarySearch(myintarray, 1);
        // System.out.println(index);

        // // .length Arrays.copyOf()
        // myintarray = Arrays.copyOf(myintarray, myintarray.length + 2);
        // myintarray[myintarray.length - 3] = 10;
        // myintarray[myintarray.length - 2] = 6;
        // myintarray[myintarray.length - 1] = 7;
        // myintarray = Arrays.copyOf(myintarray, myintarray.length - 5);
        // System.out.println(Arrays.toString(myintarray));

        // // find different elements in 2 arrays
        int[] myintarray2 = { 1, 3, 121 };
        // // interator??????
        // for (int i = 0; i < myintarray.length; i++) {
        // for (int j = 0; j < myintarray2.length; j++) {
        // if (myintarray[i] == myintarray2[j]) {
        // myintarray[i] = 0;
        // }
        // }
        // }

        // general solution??????????????????/

        System.out.println(extractSubset(myintarray, myintarray2).toString());
        // System.out.println(extractSubset(myintarray, myintarray2).toString());

        // // for loop to print, output: 3,4,5
        // for (int i = 0; i < myintarray.length; i++) {
        // if (myintarray[i] != 0)
        // System.out.println(myintarray[i]);
        // }

        // // for each loop: print elements in array one by one. output: 3,4,5
        // for (int number : myintarray) {
        // if (number != 0) {
        // System.out.println(number);
        // }
        // }

        // // Arrays.toString(): print the array. Output: [0,0,3,4,5]
        // System.out.println(Arrays.toString(myintarray));

        // // add an ArrayList, output:[3, 4, 5]
        // ArrayList<Integer> myintarray3 = new ArrayList<>();
        // for (int number : myintarray) {
        // if (number != 0) {
        // myintarray3.add(number);
        // }
        // }
        // System.out.println(myintarray3.toString());

        // String[] tries = new String[5];
        // tries[0] = "hi";
        // // there is no method indexOf();
        // System.out.println(tries.indexOf("hi"));
        // System.out.println(tries2.indexOf("hi1"));

        // System.out.println(tries[0]);
        // System.out.println(Arrays.toString(tries));

        // // put default array in ArrayList. Attention!: the type
        // Integer[] myintarray4 = { 7, 8, 3, 4, 5 };
        // ArrayList<Integer> x = new ArrayList<>(Arrays.asList(myintarray4));
        // for (int a : x) {
        // System.out.println(a);
        // }
        // System.out.println(x.toString());

        // // convert ArrayList to size fixed array
        // ArrayList<Integer> myintarray5 = new ArrayList<Integer>();
        // myintarray5.add(1);
        // myintarray5.add(2);
        // myintarray5.add(3);
        // Integer[] myintarray6 = new Integer[myintarray5.size()];
        // // solution 1
        // myintarray6 = myintarray5.toArray(myintarray6);
        // System.out.println(Arrays.toString(myintarray6));
        // // solution 2 Attention! .get()
        // for (int i = 0; i < myintarray5.size(); i++) {
        // myintarray6[i] = myintarray5.get(i);
        // }
        // System.out.println(myintarray5.toString());

        // convert size fixed array to ArrayList
        // int[] myintarray8 = { 1, 2, 3, 4, 5 };
        // ArrayList<Integer> myintarray9 = new ArrayList<>();
        // for (int number : myintarray8) {
        // myintarray9.add(number);
        // }
        // System.out.println(myintarray9.toString());

    }

}
