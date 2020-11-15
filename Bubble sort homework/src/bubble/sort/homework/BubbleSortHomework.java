
package bubble.sort.homework;

import java.util.Scanner;

public class BubbleSortHomework {

    public static void main(String[] args) {
        
    
      
        int inputamount, i, j, temp;
    Scanner input = new Scanner(System.in);
 
    System.out.println("How many numbers would  you like to sort. Please input a regular number above 10");
    inputamount = input.nextInt();
 
    int array[] = new int[inputamount];
 
    System.out.println("Enter " + inputamount + " Numbers: ");
 
    for (i = 0; i < inputamount; i++) 
      array[i] = input.nextInt();
 
    for (i = 0; i < ( inputamount - 1 ); i++) {
      for (j = 0; j < inputamount - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
     
 
    System.out.println("Sorted list of integers:");
 
     System.out.println("Smallest number here ↓");
    
    for (i = 0; i < inputamount; i++) 
      System.out.println(array[i]);
 
    
    System.out.println("Biggest number here ↑");
   
    
    
    
    
    
    }
}

    }
    }
    
}
    
    
    
    
    
    
    
    
