import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";
        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            if(!(age < 21))
            {
                System.out.println("You get a wrist band");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your age was " + trash);
            System.out.println("Run the program again and enter a valid age");


        }

    }
}
