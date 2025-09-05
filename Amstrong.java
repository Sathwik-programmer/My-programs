import java.util.Scanner;
class Amstrong 
{
    public static void main(String[] args)
    {
        int n, r, temp, sum = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number");
            n = in.nextInt();
            temp = n;
            while (n != 0)
            {
                r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
            if (temp == sum)
            {
                System.out.println("Amstrong number");
            }
            else
            {
                System.out.println("Not an Amstrong number");
            }
        }
    }
}