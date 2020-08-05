/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiksha
 */
import java.util.Scanner;
public class Populate {
    public static void main(String []args){
        int n, number2 = 55;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements you was in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; ++i){
            a[i] = s.nextInt();
            number2 = number2 + a[i];}
        System.out.println("Sum: " + number2);
    }
}
