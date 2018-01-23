/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge13;

/**
 *
 * @author fjcorona
 */
class Student extends Person {

    private int[] testScores;

    /*	
     *   Class Constructor
     *   
     *   @param firstName       A string denoting the Person's first name.
     *   @param lastName        A string denoting the Person's last name.
     *   @param id              An integer denoting the Person's ID number.
     *   @param testScores      An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] testScores) {
        // TODO Auto-generated constructor stub
        super(firstName, lastName, id);
        this.testScores = testScores;

    }

    private int average() {
        int sum = 0;
        for (int idx = 0; idx < this.testScores.length; idx++) {
            sum += this.testScores[idx];
        }
        return (this.testScores.length > 0) ? sum / this.testScores.length : sum;
    }

    /*	
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int avg = this.average();

        if (90 <= avg && avg <= 100) {
            return 'O';
        } else if (80 <= avg && avg < 90) {
            return 'E';
        } else if (70 <= avg && avg < 80) {
            return 'A';
        } else if (55 <= avg && avg < 70) {
            return 'P';
        } else if (40 <= avg && avg < 55) {
            return 'D';
        } else if (0 <= avg && avg < 40) {
            return 'T';
        } else {
            return Character.MIN_VALUE;
        }
    }

}