/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge15;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author fjcorona
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }
    
    private int numOfElements(int n) {
        if (n == 0) {
            return 0;
        }
        return n + numOfElements(n - 1);
    }
    
    public void computeDifference() {
        int num = this.numOfElements(this.elements.length - 1);
        //System.out.println(num);
        int difs[] = new int[num];
        
        // Init difs
        for(int idx = 0; idx < difs.length; idx++) {
            difs[idx] = 0;
        }
        
        int number = 0;
        
        for (int idx = 0; idx < this.elements.length - 1; idx ++) {
            for (int jdx = idx + 1; jdx < this.elements.length; jdx++) {
                difs[number++] = Math.abs(this.elements[idx] - this.elements[jdx]);
            }
        }
        
        Arrays.sort(difs);
        //System.out.println(Arrays.toString(difs));
        this.maximumDifference = difs[difs.length - 1];
        //System.out.println(this.maximumDifference);
    }
}
