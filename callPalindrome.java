import java.util.*;
public class callPalindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose palindrome method(1 - 3):\n1. Recursion\n2. For loops\n3. Libraries");
        int labNum;
        
        labNum = scan.nextInt();
        
        switch(labNum)
        {
            case 1:
            {
                callPalindrome1();
                break;
            }
            
            case 2:
            {
                callPalindrome2();
                break;
            }
            
            case 3: 
            callPalindrome3();
            break;
            
        }
    }
    
    public static void callPalindrome1()
    {
        String[] arg = {""};
        palindrome.main(arg);
    }
    
    public static void callPalindrome2()
    {
        String[] arg = {""};
        PalindromeForLoop.main(arg);
    }
    
    public static void callPalindrome3()
    {
        String[] arg = {""};
        PalindromeLibraries.main(arg);
    }
}
