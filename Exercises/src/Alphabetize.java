/**
 * Created by jc321013 on 29/08/16.
 */
import java.util.*;

public class Alphabetize
{
    public static void main(String[] args)
    {
        String StringOne, StringTwo, StringThree;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        StringOne = in.nextLine();
        System.out.print("Enter the 2nd string: ");
        StringTwo = in.nextLine();
        System.out.print("Enter the 3rd string: ");
        StringThree = in.nextLine();

        if(StringOne.toLowerCase().compareTo(StringTwo.toLowerCase()) < 0 &&
                StringTwo.toLowerCase().compareTo(StringThree.toLowerCase()) < 0)
            System.out.println("Strings one, two and three that you entered are in alphabetical order");
        else
            System.out.println("Strings one, two and three that you entered are not in alphabetical order");
    }
}
