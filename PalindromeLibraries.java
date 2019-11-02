import java.util.*;
import java.io.*;
import java.lang.reflect.*; 

public class PalindromeLibraries
{
    private int x;
    public static void main(String[] args)
    {
        int r = 0;
        String u; 
        Scanner scan = new Scanner(System.in);
        do 
        {
        u = keyInput.inString("Please enter a word to test palindrome\n");
        String palindrome = new StringBuffer(u).reverse().toString(); 
        if(palindrome.equals(u)) 
            { 
                System.out.println("Palindrome");
            } 
            else 
            {
                System.out.println("Not Palindrome");
            } 
            System.out.println("Would you like to test another word?(Y/N)\n");
            r = scan.next().charAt(0);
        }
        while(r == 'Y' || r == 'y');
    }
}