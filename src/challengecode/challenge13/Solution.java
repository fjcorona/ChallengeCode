/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge13;

import java.util.Scanner;

/**
 *
 * @author fjcorona
 */
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int current = 0;
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            //Only acept number between 0 and 100
            do {
                current = scan.nextInt();
            } while (current < 0 || current > 100);
            //Add de validated number
            testScores[i] = current;
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
