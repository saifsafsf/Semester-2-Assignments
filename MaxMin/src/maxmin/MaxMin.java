/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 * @author Saif Ullah
 */
public class MaxMin {

    /**
     * Takes an array, displays max & min elements
     */
    public static void main(String[] args) {
        // object input of class Scanner
        Scanner input = new Scanner( System.in );
        
        // length of the array
        System.out.print("Enter number of elements you want to add: ");
        int len;
        len = input.nextInt();
        
        // variables used
        double[] array = new double[len];
        double max, min;
        
        for (int i = 0; i < len; i++) {
            
            // taking input
            System.out.printf("Enter element %d: ", i+1);
            array[i] = input.nextDouble();
            
        } // end of for loop
        
        max = array[0];
        min = array[0];
        
        for (int j = 1; j < len; j++) {
            
            // if maximum num found
            if (array[j] > max) {
                max = array[j];
                continue;
                
            } // end of if body
            
            // if minimum num found
            if (array[j] < min)
                min = array[j];
            
        } // end of for loop
        
        // Displaying output
        System.out.printf("\nMaximum Number: %.1f\n", max);
        System.out.printf("Minimum Number: %.1f\n", min);
        
    } // end of main method
    
} // end of MaxMin class
