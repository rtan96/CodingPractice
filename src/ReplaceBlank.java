/**
 * Created by rashitandon on 2016-02-29.
 */
// write a code to replace all spaces in a string with %20
import java.util.Scanner;
import java.lang.StringBuilder;
public class ReplaceBlank
{
    public String replace(String input) {
        StringBuilder builder= new StringBuilder();
        int k=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                builder.append("%20");
            } else {
                builder.append(input.charAt(i));

            }
        }
        // System.out.println("The replacesd string is " + builder.toString());
        return(builder.toString());
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a line ");
        String line=s.nextLine();
        ReplaceBlank r = new ReplaceBlank();
        String k;
        k=r.replace(line);
        System.out.println("The replacesd string is "+ k);

    }
}

