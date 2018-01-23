/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fjcorona
 */
//Write your code here
class Calculator {

    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}