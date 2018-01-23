/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge05;

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
        int levels = scan.nextInt();
        
        //Print piramid levels
        for (int idx = 0; idx < levels; idx++) {
            //Int number spaces
            int nSpaces = (levels - idx - 1);
            //Int nMarks
            int nMarks = levels - nSpaces;
            
            //Declare a String to make the line
            String line = "";
            
            //Loop to concat the spaces part
            for(int sdx = 0; sdx < nSpaces; sdx++) {
                line += " ";
            }
            
            //Loop to concat the spaces part
            for(int mdx = 0; mdx < nMarks; mdx++) {
                line += "#";
            }
            //System.out.println(nSpaces + "," + nMarks);
            //Print made line
            System.out.println(line);
        }
    }
}
