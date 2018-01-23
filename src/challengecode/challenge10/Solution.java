/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge10;

import java.io.*;
import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {

    static int factorial(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}