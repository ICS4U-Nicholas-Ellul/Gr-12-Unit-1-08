/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program lists 10 random numbers between 1 and 99 then shows the 
 *    max and min values.
 *
 ****************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        	//variables
        int maxValue = 99;
    	int arrayLength = 10;
    	int[] rngArray = new int[arrayLength];
   	    int randomNumber;
        Random rng = new Random();
        
        	//populate array 
    	for (int counter = 0; counter < arrayLength; counter++) {
    			randomNumber = rng.nextInt(maxValue) +1;
      			rngArray[counter] = randomNumber;
      			System.out.println(rngArray[counter]);
    	}
    
    		 //sorting array
    	Arrays.sort(rngArray);
  		
  			//output
   		System.out.println("Max: " + rngArray[arrayLength-1]);
   		System.out.println("Min " + rngArray[0]);
    }
}
