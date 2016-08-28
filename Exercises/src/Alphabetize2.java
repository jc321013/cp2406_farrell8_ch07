import java.util.Scanner;

/**
 * Created by jc321013 on 29/08/16.
 */
public class Alphabetize2 {
    public static void main(String[] args) {
        String StringOne, StringTwo, StringThree;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        StringOne = in.nextLine();
        System.out.print("Enter the 2nd string: ");
        StringTwo = in.nextLine();
        System.out.print("Enter the 3rd string: ");
        StringThree = in.nextLine();

        if (StringOne.toLowerCase().compareTo(StringTwo.toLowerCase()) < 0)
            if (StringTwo.toLowerCase().compareTo(StringThree.toLowerCase()) < 0)
            System.out.println(StringOne + " " + StringTwo + " " + StringThree + " ");
            else
            if(StringThree.toLowerCase().compareTo(StringOne.toLowerCase()) < 0)
                System.out.println(StringThree + " " + StringOne + " " + StringTwo);
            else
            if(StringOne.toLowerCase().compareTo(StringTwo.toLowerCase()) < 0)
                if(StringTwo.toLowerCase().compareTo(StringThree.toLowerCase()) < 0)
                    System.out.println(StringOne + " " + StringTwo + " " + StringThree);
                else
                    System.out.println(StringOne + " " + StringThree + " " + StringTwo);
            else
            if(StringOne.toLowerCase().compareTo(StringThree.toLowerCase()) < 0)
                System.out.println(StringTwo + " " + StringOne + " " + StringThree);
            else
            if(StringThree.toLowerCase().compareTo(StringTwo.toLowerCase()) < 0)
                System.out.println(StringThree+ " " + StringTwo + " " + StringOne);
            else
                System.out.println(StringTwo + " " + StringThree + " " + StringOne);

    }
}


