/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challengecode.challenge08;

import java.io.*;
import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int idx = n - 1; idx >= 0; idx--) {
            System.out.print(arr[idx]);
            if(idx > 0) {
                System.out.print(" ");
            }
        }
    }
}