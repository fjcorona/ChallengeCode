/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge14;

import java.util.*;

/**
 *
 * @author fjcorona
 */
abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title  = title;
        this.author = author;
    }

    abstract void display();
}
