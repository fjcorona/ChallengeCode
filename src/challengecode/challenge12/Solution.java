/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge12;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author fjcorona
 */
public class Solution {
    
    //Matrix example
    /*
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0
    */
    
    // Fill Array
    public static void fillArray(int[][] arr, int n, int m) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }
    
    //Sum an hourglass
    //First horglass example with d element like center
    /*
        1   1   1
            1
        1   1   1
    
        (i - 1, j - 1) (i - 1, j  ) (i - 1, j + 1)
                       (i    , j  )              
        (i + 1, j - 1) (i + 1, j  ) (i + 1, j + 1)
    */
    public static int sumHourGlass(int[][] arr, int i, int j) {
        return  arr[i - 1][j - 1] + arr[i - 1][j    ] + arr[i - 1][j + 1] +
                                    arr[i    ][j    ] +
                arr[i + 1][j - 1] + arr[i + 1][j    ] +  arr[i + 1][j + 1];
    }
    
    // Calculate number of valid hourglasess in the matrix
    public static int numberOfHourglasses(int n, int m) {
        // If there is not enougth espace to save an hour glass return 0
        if (!(n >= 2 && m >= 2)) {
            return 0;
        }
        // Other case retur the formule general
        return (n - 2) * (m - 2);
    }

    // return array with the length of number of glases
    public static int[] sumsHGlasses(int tam) {
        int[] sHGlasses = new int[tam];
        for (int idx = 0; idx < sHGlasses.length; idx++) {
            sHGlasses[idx] = 0;
        }
        return sHGlasses;
    }

    // Get the biggest hourglass
    public static int maxHourglass(int[][] arr, int n, int m) {
        // Array to save the sums
        int[] hourGlasesSums = sumsHGlasses(numberOfHourglasses(n, m));

        // To control the current hourglass
        int number = 0;

        // Go int i index
        for (int i = 1; i < n - 1; i++) {
            // Go int j index
            for (int j = 1; j < m - 1; j++) {
                // calculate sum
                int sum = sumHourGlass(arr, i, j);
                // Add sum to array
                hourGlasesSums[number++] = sum;
            }
        }

        // Order array
        Arrays.sort(hourGlasesSums);

        // The last element is the max, return it
        return hourGlasesSums[hourGlasesSums.length - 1];
    }

    public static void main(String[] args) {
        // Set the the square matrix dimension
        int dimension = 6;
        // Declare a int matrix
        int arr[][] = new int[dimension][dimension];
        // Feel the matrix
        fillArray(arr, dimension, dimension);
        //Get the max sum
        System.out.println(maxHourglass(arr, dimension, dimension));
    }
}