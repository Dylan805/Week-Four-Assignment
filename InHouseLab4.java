import java.util.Scanner;
import java.util.Arrays;

/**
 * Write a description of class alphabetize here.
 * 
 * @author Dylan Stai 
 */
public class alphabetize
{
    private Scanner word;

    /**
     * Constructor for objects of class alphabetize
     */
    public alphabetize()
    {
        word = new Scanner(System.in);
    }

   
    public void sort(String x)
    {
        x = x.toLowerCase();
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        String alphabetized = new String(chars);
        System.out.println(alphabetized);
    }
}
