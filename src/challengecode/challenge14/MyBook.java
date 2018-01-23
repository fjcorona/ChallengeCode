/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge14;

/**
 *
 * @author fjcorona
 */
public class MyBook extends Book {

    // Declare the price instance variable
    private int price;
    
    /**
     * Class Constructor
     *
     * @param title The book's title.
     * @param author The book's author.
     * @param price The book's price.
    *
     */
    // Write your constructor here
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     *
     * Print the title, author, and price in the specified format.
    *
     */
    @Override
    void display() {
        System.out.println(
            "Title: "  + super.title   + "\n" +
            "Author: " + super.author  + "\n" +
            "Price: "  + this.price
        );
    }

}