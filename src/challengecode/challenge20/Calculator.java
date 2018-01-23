/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge20;

import java.util.Arrays;

/**
 *
 * @author fjcorona
 */
public class Calculator implements AdvancedArithmetic {
    
    private int[] divisors;
    
    public Calculator () {
    }
    
    private int numOfDivisos(int n) {
        int count = 0;
        for(int idx = 1; idx <= n; idx ++) {
            if(n % idx == 0) {
                count++;
            }
        }
        return count;
    }
    
    private void makeDivisors (int n) {
        this.divisors = new int[this.numOfDivisos(n)];
        int count = 0;
        for (int idx = 1; idx <= n; idx++) {
            if(n % idx == 0) {
                this.divisors[count++] = idx;
            }
        }
    }
    
    @Override
    public int divisorSum(int n) {
        this.makeDivisors(n);
        if(this.divisors.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int idx = 0; idx < this.divisors.length; idx++) {
            sum += this.divisors[idx];
        }
        return sum;
    }
}
