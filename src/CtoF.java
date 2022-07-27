import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        double C = 0;
        double F = 0;
        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);

        do
        {

            System.out.print("Enter your temperature in celsius: ");
            if(in.hasNextDouble())
            {
                C = in.nextDouble();
                in.nextLine(); // clear input buffer
                if (C >= -273.15 && C <= 1000)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [-273.15 to 1000]: " + C);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid temperature: " + trash);
            }

        } while (!done);
        F = C * 9 / 5 + 32;
        System.out.println("The equivalent temperature in celsius is: " + F);
    }

}
