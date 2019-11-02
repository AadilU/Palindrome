import java.util.*;
import java.io.*;
import java.lang.reflect.*; 

public class Libraries
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args)
    {
        // initialise instance variables
        int repeat = 0;
        String user; 
        do 
        {
        user = keyInput.inString("Please enter a string for the palindrome checker\n");
        String palindrome = new StringBuffer(user).reverse().toString(); 
        if(palindrome.equals(user)) 
            { 
                System.out.println("It is a Palindrome!");
            } 
            else 
            {
                System.out.println("It is not a Palindrome");
            } 
            repeat = keyInput.inInt("Would you like to test another string?\n");
        }
        while(repeat != 0);
    }
}