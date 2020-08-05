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
public class InputTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //created Scanner object
        System.out.println("Enter float:"); //user enters float number
        float myFloat = input.nextFloat(); //taking input from user
        System.out.println("Float entered: " + myFloat); //confirming user's input float number
        System.out.println("Enter double:"); //user enters double number
        double myDouble = input.nextDouble(); //taking input from user
        System.out.println("Double entered: " + myDouble); //confirming user's input double number
        System.out.println("Enter String: ");
        String myString = input.next();
        System.out.println("String entered: " + myString);
        input.close();
    }
}
    
