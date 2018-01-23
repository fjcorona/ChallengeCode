/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge04;

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

    private int age;

    public Solution(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        String result;
        // Write code determining if this person's age is old and print the correct statement:
        if(this.age < 13) {
            result = "You are young.";
        } else if(this.age < 18) {
            result = "You are a teenager.";
        } else {
            result = "You are old.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Solution p = new Solution(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
