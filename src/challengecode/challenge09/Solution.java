/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challengecode.challenge09;

import java.io.*;
import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {
    public static void main(String []argh) {
        Map<String, Integer> agenda = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            agenda.put(name, phone);
        }
        while(in.hasNext()) {
            String s = in.next();
            if(agenda.containsKey(s)) {
                System.out.println(s + "=" + agenda.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}