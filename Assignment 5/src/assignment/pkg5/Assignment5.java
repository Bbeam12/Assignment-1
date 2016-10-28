/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Scanner;

/**
 *
 * @author Bryson.Beam
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a Whole Number:");
    int num = reader.nextInt();
    int i = num;
    do{
        System.out.println(i);
        i--;
                }while (i > -1);
    
    }
    }
    
