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
public class Input{
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        //print a statement for the user....ex: "What is your favorite number?"
        int number = input.nextInt();
        //print a statement to confirm what the user entered.....ex:"You entered: " + number
        System.out.println("You enetered + " + number);

        input.close();
    }
}