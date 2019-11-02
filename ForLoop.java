import java.util.Scanner;
import chn.util.*; 
import apcslib.*; 
import java.util.Random;

public class ForLoop
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args)
    {
        // initialise instance variables
        Scanner scan = new Scanner(System.in);  
        String u;  
        char [] array, r_array;
       
        int x = 0, y = 0, repeat = 0, length; 
     do 
     {
         y = 0;
          u = keyInput.inString("Enter in a string"); 
          length = u.length(); 
          array = u.toCharArray();
          r_array = u.toCharArray();
           
            for(x = length - 1; x >= 0; x--) 
            {
                r_array[y] = array[x]; 
                y++;
            }
            String reverse = new String(r_array);
          
            if(u.equals(reverse)) 
            {  
                System.out.println("Palindrome");
            } 
            else 
            {
                System.out.println("Not Palindrome");
            }
            repeat = keyInput.inInt("Would you like to test another word?(1, 0)\n");
           } 
           while(repeat == 1);
    }
}