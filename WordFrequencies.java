package prereq;

import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      // STEP 1: Read the number of words into an integer
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter the number of words:");
      int numWords = scnr.nextInt();
      int l = 0;
      // STEP 2: Read the words, one-at-a-time into an ArrayList
      String[] arr = new String[numWords];
      for (int i =0; i<numWords; i++){
         System.out.println("Enter word " + (i+1) + ":");
         arr[i] = scnr.next();
      }
      // STEP 3: Find the number of times the *first* word appears in the ArrayList.
      //         Print out this number in the required format.
      
      for (int i =0; i<numWords; i++){
         if (arr[i].equals(arr[0])){
            l+=1;
            System.out.println("The word 'first' appears " + l + " times.");
            
         }}
      
      // STEP 4: Question - What do you need to change in your Step 3 code
      //                    to find the number of times the *second* word
      //                    appears in the ArrayList?
      for (int i =0; i<numWords; i++){
         if (arr[i].equals(arr[0])){
            l+=1;
            System.out.println("The word 'first' appears " + l + " times.");
            
         }}
      //         Question - What about the *third* word?
      for (int i =0; i<numWords; i++){
         if (arr[i].equals(arr[0])){
            l+=1;
            System.out.println("The word 'first' appears " + l + " times.");
            
         }}
      //         Question - Do you see a pattern emerging?


      // STEP 5: Turn your code in Step 3 into a loop that checks every word in the ArrayList
      for (int i =0; i<numWords; i++){
         l=0;
         for (int j =0; j<numWords; j++){
            if (arr[j].equals(arr[i])){
               l+=1;
            }
         }
         System.out.println("The word '" + arr[i] + "' appears " + l + " times.");
      }
   }
}