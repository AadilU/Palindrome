import java.util.*;
import java.io.*;
import java.lang.reflect.*; 

public class PalindromeLibraries
{
    private int x;

    public static void main(String[] args)
    {
        int repeat = 0;
        String user; 
        do 
        {
        user = keyInput.inString("Please enter a word to test palindrome\n");
        String palindrome = new StringBuffer(user).reverse().toString(); 
        if(palindrome.equals(user)) 
            { 
                System.out.println("Palindrome");
            } 
            else 
            {
                System.out.println("Not Palindrome");
            } 
            repeat = keyInput.inInt("Would you like to test another word?\n");
        }
        while(repeat != 0);
    }
}