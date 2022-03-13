
public class Assignment {

  public static void main(String[] args) {
    
//    Coding Step 1: Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
      System.out.println("Coding Step 1: **Create an array of int called ages that contains values: 3, 9, 23, 64, 2, 8, 28, 93.***"); 
                    int[] ages = {3,9,23,64,2,8,28,93};     //length of 8

                                            
//    Coding Step 1a: Programmatically subtract the value of the first element in the array from the value in the 
//                    last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.   
      System.out.println("\nCoding Step 1a: **Subtract the value of the first element from the value of the last element.***");   
        
                      System.out.println(ages[ages.length-1]-ages[0]);

                      
//     Coding Step 1b: Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
       System.out.println("\nCoding Step 1b: ***Add a new age to your array and repeat the step above. ***");
        
                      int[] ages2 = {3,9,23,64,2,8,28,93,76};
       
                      System.out.println(ages2[ages2.length-1]-ages2[0]);
 
        
//     Coding Step 1c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//                     Using ages = {3,9,23,64,2,8,28,93}
       System.out.println("\nCoding Step 1c: ***Using a loop calculate the average age (Note: I used this age array {3,9,23,64,2,8,28,93}.***");
        
                      double sumOfAges = 0;
        
                      for(int i = 0; i < ages.length; i++) {
                        sumOfAges += ages[i];
                      } 
                      System.out.println(sumOfAges / ages.length);
        

//     Coding Step 2: Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
                      String[] names = new String[6];
            
                      names[0] = "Sam";
                      names[1] = "Tommy";
                      names[2] = "Tim";
                      names[3] = "Sally";
                      names[4] = "Buck";
                      names[5] = "Bob";
            
            
//    Coding Step 2b: Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.     
      System.out.println("\nCoding Step 2a: ***Use a loop to iterate through the array and calculate the average number of letters per name. Print to the console.***");
             
                      String sumName = ""; 
                      
                      for(int i = 0; i < names.length; i++) {
                        sumName += names[i];
                      }
                      double changeInt2Double = sumName.length();
                      System.out.println(changeInt2Double / names.length);
             
           
            
//   Coding Step 2b: Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print to the console. 
     System.out.println("\nCoding Step 2b: ***Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print to the console.***");
            
            
                      double countOfNames = names.length;
                      String name = ""; 
                      char space = ' ';
            
                      for(int i = 0; i < names.length; i++) {
                        name += names[i] += space;
                      }                  
                      System.out.println(name);
                  
           
//    Coding Step 3: How do you access the last element of any array?  I created a new String array called farmAnimalsArray.   
      System.out.println("\nCoding Step 3: ***How do you access the last element of any array?  Note: I created a new String array called farmAnimalsArray{\"Cat\", \"Dog\", \"Horse\", \"Cow\", \"Pig\"}.***");
                  
                     String[] farmAnimalsArray = {"Cat", "Dog", "Horse", "Cow", "Pig"};
               
               
                     System.out.println(farmAnimalsArray[farmAnimalsArray.length -1]);    
               
//     Coding Step 4: How do you access the first element of any array?  Note: I created a new String array called farmAnimalsArray;                 
       System.out.println("\nCoding Step 4: ***How do you access the last element of any array?  Note: I created a new String array called farmAnimalsArray{\"Cat\", \"Dog\", \"Horse\", \"Cow\", \"Pig\"}.***");   
               
                     System.out.println(farmAnimalsArray[0]);
   
                     
//    Coding Step 5: Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.           
      System.out.println("\nCoding Step 5: ***Create a new array of int called nameLengths. Write a loop to iterate over the previously created names");
      System.out.println( "                   array and add the length of each name to the nameLengths array.***");
    
                    int[] nameLengths = new int[names.length];
                    int count =0;
              
                    for(int i=0; i<names.length; i++) {
                      nameLengths[i] = names[i].length();
                     // System.out.println(nameLengths[i]);    //commented out as assignment did not request print to console.
                    }
              
        
//    Coding Step 6: Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
      System.out.println("\nCoding Step 6: ***Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.***");
               
                    int totalElementsInArray = 0;
              
                    for( int sumNameLengths : nameLengths) {
                      totalElementsInArray += sumNameLengths;
                    }  
                    System.out.println(totalElementsInArray);
  
  
//    Coding Step 7: Write a method that takes a String word, and an int n, as arguments and returns the word concatenated to itself n number of times 
//                   (i.e. if I pass in "Hello" and 3, I would expect the method to return "HelloHelloHello". 
      System.out.println("\nCoding Step 7: Calls repeatWord method.");
   
                     repeatWord("Alive", 5);
    
               
//     Coding Step 8: Write a method that takes 2 Strings firstName and lastName, and returns a full name 
//                    (the full name should be the first and the last name as a String separated by a space).
       System.out.println("\nCoding Step 8: Calls concatFirstNameLastName method.");     
        
                    concatFirstNameLastName("Tom","Jerry");

               
//     Coding Step 9: Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.               
       System.out.println("\nCoding Step 9: Calls intArray.");
        
                   int[] intArray = {10, 5, 33, 17, 1, 48};
                    
                    intArrayGreaterThan100(intArray);
              
//      Coding Step 10: Write a method that takes an array of double and returns the average of all the elements in the array.
        System.out.println("\nCoding Step 10: Calls doubleNumbersArray.");    
              
                    double[] doubleNumbersArray = {22.4, 77, 15.9, 2.3, 62.1, 33.0, 19.76};
              
                    avgOfDoubleArray(doubleNumbersArray);
              
              
//      Coding Step 11: Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
//                      is greater than the average of the elements in the second array.
        System.out.println("\nCoding Step 11: Calls method avgOfFirstArrayGreaterThanAvgOfSecondArray."); 
              
                   double[] firstArrays = {17.5, 13.76, 9.43, 2.2};
                   double[] secondArrays = {22.3, 5.4, 2, 3.3, 6.997};
               
               avgOfFirstArrayGreaterThanAvgOfSecondArray(firstArrays, secondArrays);   
               
               
//        Coding Step 12: Write a method called willBuyDrink that takes a boolean isHotOutside and a double moneyInPocket and returns true
//                        if it is hot outside and if moneyInPocket is greater than 10.50.    
          System.out.println("\nCoding Step 12: Calls method willBuyDrink");  
            
                    boolean isHotOutside = true;
                    double moneyInPocket = 11.50;
               
                    willBuyDrink(isHotOutside, moneyInPocket);
      
               
//        Coding Step 13: Write a method of your own that solves a problem. 
//                        Create a method called operatingMarginOutcome that takes double called totalRevenue and double called totalExpense 
//                        and calculates operatingMarginPercent.  If operatingMarginPercent is greater than 5% prints out to console "Good Job!" and operating margin percent. 
//                        Otherwise it prints to console "Room for improvement." and lists operating margin percent.  Note, only include 2 digits after decimal for percentage.
//                        I wrote this because financial calculations are a huge part of any business.  Operating Margin being one of those.  It tells a story of how the company is doing.
             
          System.out.println("\nCoding Step 13: Calls method operatingMarginOutcome"); 
                    double totalRevenue = 400000;
                    double totalExpense = 375000;
                    double netIncome = (totalRevenue - totalExpense);
               
                    System.out.println(operatingMarginOutcome(netIncome, totalRevenue));
               
               
               
               
  }             
//** METHODS BELOW ************************************************************************************************************************************************//

//Coding Step 7: Method repeats Alive concatenated to itself 5 times.
            public static String repeatWord( String word, int n) {
                String concatWord = "";
                for(int i = 1; i<=n; i++) {
                  concatWord += word;
                }
                return concatWord;
             }
  
  
//Coding Step 8: Method that concatenates 2 Strings firstName and lastName, separated with a space.
            public static String concatFirstNameLastName(String firstName, String lastName) {
                 String fullName = firstName + " " + lastName;
                 return fullName;
            }

            
//Coding Step 9: Method that returns true if sum of array "intArray" is greater than 100.
            public static boolean intArrayGreaterThan100(int[] intArray) {
                 int counter = 0;
                 boolean result = true;
                  
                 for(int sumArray : intArray) {
                   counter += sumArray; 
                 if(counter>100) {
                   result = true;
                 } else {
                   result = false;
                 }
                 }
                 return result;
              }
  
            
//Coding Step 10: Method sums double array and returns the avg of elements of array.
            public static double avgOfDoubleArray(double[] doubleNumbersArray) {
                
                 double sumOfDoubleNumbersArray = 0;
                
                 for(double doubleNumber : doubleNumbersArray) {
                   sumOfDoubleNumbersArray += doubleNumber; 
                 }
                   return sumOfDoubleNumbersArray / doubleNumbersArray.length;
            }

            
//Coding Step 11: Method takes two arrays of double and returns true if avg of elements in 1st array > avg of elements in 2nd array.
            public static boolean avgOfFirstArrayGreaterThanAvgOfSecondArray(double[] firstArrays, double[] secondArrays) {
                double sumOfFirstArray = 0;  
                double sumOfSecondArray = 0; 
                 //boolean result; 
                 
                for(double firstArray : firstArrays) {                 
                   sumOfFirstArray += firstArray; 
                }
                        for(double secondArray : secondArrays) {                          
                           sumOfSecondArray += secondArray; 
                        }        
                          
                  return (sumOfFirstArray / firstArrays.length) > (sumOfSecondArray / secondArrays.length);
            }    


//Coding Step 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//                and returns true if it is hot outside and if moneyInPocket is greater than 10.50.            
             public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
                
                if(isHotOutside && moneyInPocket > 10.50) {
                   return true;
                } else {
                   return false;
                }
            }
                      
 
//oding Step 13: Write a method of your own that solves a problem. 
//          Create a method called operatingMarginOutcome that takes double called totalRevenue and double called totalExpense 
//          and calculates operatingMarginPercent.  If operatingMarginPercent is greater than 5% prints out to console "Good Job!" and displays operating margin percent. 
//          Otherwise it prints to console "Room for improvement." and displays operating margin percent.
//          I wrote this because financial calculations are a huge part of any business.  Operating Margin being one of those.  It tells a story of how the company is doing.
            
              public static String operatingMarginOutcome(double netIncome, double totalRevenue) {
             
                if(netIncome / totalRevenue > .05) {
                  //return ("Good Job!  Operating Margin " + ((netIncome / totalRevenue)*100) + "%");
                  return String.format("Good Job!  Operating Margin is %.2f%%", (netIncome / totalRevenue)*100);
                }else {
                  return String.format("Room for improvement.  Operating Margin is %.2f%%", (netIncome / totalRevenue)*100);
                }
            }
            
//** STOP ************************************************************************************************************************************************//            
}