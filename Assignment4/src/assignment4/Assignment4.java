/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Bryson.Beam
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.println("Enter a Whole Number");
       int num = reader.nextInt();
       int x = num;
       while (x > -1){
           System.out.println(x);
           x--;
       }
       
    }
    
}
