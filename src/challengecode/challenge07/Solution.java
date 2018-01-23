/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challengecode.challenge07;

import java.io.*;
import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        //Number of words
        for(int idx = 0; idx < number; idx++) {
            String word     = scan.nextLine();
            String evens    = "";
            String odds     = "";
            
            //Number of letters in each word
            for(int jdx = 0; jdx < word.length(); jdx++) {
                //Evens
                if(jdx % 2 == 0) {
                    evens += word.charAt(jdx);
                //Odds
                } else {
                    odds += word.charAt(jdx);
                }
            }
            //Print
            System.out.println(evens + " " + odds);
        }
    }
}
