import java.util.Scanner;
import chn.util.*; 
import apcslib.*; 
import java.util.Random;

public class PalindromeForLoop
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args)
    {
        // initialise instance variables
        Scanner scan = new Scanner(System.in);  
        String u;  
        char [] array, i;
       
        int x = 0, y = 0, length; 
        char r;
     do 
     {
         y = 0;
          u = keyInput.inString("Enter in a word"); 
          length = u.length(); 
          array = u.toCharArray();
          i = u.toCharArray();
           
            for(x = length - 1; x >= 0; x--) 
            {
                i[y] = array[x]; 
                y++;
            }
            String reverse = new String(i);
          
            if(u.equals(reverse)) 
            {  
                System.out.println("Palindrome");
            } 
            else 
            {
                System.out.println("Not Palindrome");
            }
            System.out.println("Would you like to enter another word?(Y/N)");
            r = scan.next().charAt(0);
           } 
           while(r == 'Y' || r == 'y');
    }
}