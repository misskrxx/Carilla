package activities;

public class Tasksheet117 {
    public static void main(String[] args) {
    
       int num1 = 5;
       int num2 = 8; 
       int num3 = 3;         
        
               
       System.out.println("The numbers are: \"" + num1 + "\", \"" + num2 + "\", \"" + num3 + "\"");
                 
                
        if (num1 == num2 && num2 == num3) {
         System.out.println("All numbers are equal: \"" + num1 + "\"");
                } else {           
                    
                    int largest = num1;
                    if (num2 > largest) {
                        largest = num2;
                    }
                    if (num3 > largest) {
                        largest = num3;
                    }
                    System.out.println("The largest number is: \"" + largest + "\"");
                }        

                
            }
        }
        
