/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengecode.challenge23;

import java.util.*;

/**
 *
 * @author fjcorona
 */
public class Solution {

    public static int getHeight(Node root) {
        int hLeft  = (root.left  != null) ? getHeight(root.left)  + 1 : 0;
        int hRight = (root.right != null) ? getHeight(root.right) + 1 : 0;
        return (hLeft > hRight) ? hLeft : hRight;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}