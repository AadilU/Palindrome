import java.util.*;
public class palindrome
{
    public static int i;
    public static int t;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        char r;
        
        do
        {
        i = 0;
        t = 0;
        word = keyInput.inString("Enter a word\n");
        word = word.toLowerCase();
        word = word.replaceAll("[\\W]", "");
        //word = word.replaceAll("[\\W]", "");
        boolean answer = test1(word);
        
            if(answer == true)
            {
                keyInput.printPrompt("true\n");
            }
            else
                keyInput.printPrompt("false\n"); 
        r = keyInput.inString("Enter a word(Y/N)\n").charAt(0);
        }
        while(r == 'y' || r == 'Y');
    }
    
    public static boolean test1(String w)
    {
        if(i <= (w.length() - 1))
        {
            if(w.charAt(i) == w.charAt(((w.length() - 1) - i)))
            {
                i++;
                t++;
                test1(w);
            }
        }
        if(t == w.length())
        {
            return true;
        }
        else
        if (t != w.length())
            return false;
            else
                return true;
    }
}