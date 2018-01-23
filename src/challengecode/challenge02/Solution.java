/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challengecode.challenge02;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * ((double)tipPercent/(double)100); //Porcentaje decimal
        double tax = mealCost * ((double)taxPercent/(double)100); //Porcentaje decimal
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}