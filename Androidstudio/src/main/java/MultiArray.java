/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiksha
 */
public class MultiArray {
    public static void main(String []args){
        int [][]a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},
        }; 
        System.out.println("The length of row 1: " + a[0].length);
        System.out.println("The lenth of row 2: " + a[1].length);
        System.out.println("The length of row 3: " + a[2].length);
    }
}
