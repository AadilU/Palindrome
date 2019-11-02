import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        int i = 0;
        int t = 0;
        char r;
        
        do
        {
        i = 0;
        t = 0;
        System.out.println("Enter a word");
        word = scan.next();
        boolean answer = test1(word, i, t);
        
            if(answer == true)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        System.out.println("Would you like to try another word?(Y/N)");
        r = scan.next().charAt(0);
        }
        while(r == 'y' || r == 'Y');
    }
    
    public static boolean test1(String w, int ch, int ti)
    {
        if(ch <= (w.length() - 1))
        {
            if(w.charAt(ch) == w.charAt(((w.length() - 1) - ch)))
            {
                ch++;
                ti++;
                test1(w, ch, ti);
            }
        }
        if(ti == 1)
        {
            return true;
        }
        else
            return false;
    }
}
