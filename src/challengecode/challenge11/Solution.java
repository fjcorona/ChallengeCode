/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge11;

import java.io.*;
import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String binary = Integer.toString(decimal, 2);
        //System.out.println(binary);
        String[] parts = binary.split("0");
        //System.out.println(parts.length);
        int lng = 0;
        for (String element : parts) {
            lng = (element.length() > 0 && element.length() > lng) ? element.length() : lng;
        }
        System.out.println(lng);
    }
}