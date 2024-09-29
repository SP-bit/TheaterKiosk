import java.sql.SQLOutput;
import java.util.Scanner;
public class Main // class Main
{
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        int age = 0; // age = 0
        String trash = "";
        System.out.print("Enter your age: "); // output "Enter your age"
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            if(!(age < 21)) // if age !< 21
            {
                System.out.println("You get a wrist band"); // output "You get a wristband"
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your age was " + trash);
            System.out.println("Run the program again and enter a valid age");


        }

    } // return
} // end class
