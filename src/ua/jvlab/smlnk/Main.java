package ua.jvlab.smlnk;

/*Array of random numbers. Manipulation with it.*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = new int[15];

        for (int i = 0; i < arr1.length; i++) {
            // fills with random numbers;
            arr1[i] = (int) (Math.random() * 1000 + 777);
        }
        System.out.println(Arrays.toString(arr1) + "\n");

        // get an array of lengths x 2 for the original, but the data is copied from the original;
        int[] arr2 = Arrays.copyOf(arr1, arr1.length * 2);

        System.out.println(Arrays.toString(arr2) + "\n");


        for (int i = arr1.length; i < arr2.length; i++) {
            if (i >= arr1.length) {
                //double the initial;
                arr2[i] = arr1[i - arr1.length] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2) + "\n");
    }
}
