/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge22;

/**
 *
 * @author fjcorona
 */
public class Printer <T> {

    /**
     * Method Name: printArray Print each element of the generic array on a new
     * line. Do not return anything.
     *
     * @param A generic array
    *
     */

    // Write your code here
    static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
