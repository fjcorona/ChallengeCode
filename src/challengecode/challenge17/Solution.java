/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge17;

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

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        try {
            int m = Integer.parseInt(n);
            System.out.println(m);
        } catch(Exception e) {
            System.out.println("Bad String");
        }
        
    }
}