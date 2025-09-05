import java.util.Scanner;
class Perfect_number
{
    public static void main(String[] args)
    {
            int n, sum = 0;
             try (Scanner input = new Scanner(System.in))
    {
            System.out.println("Enter a number");
            n = input.nextInt();
            int i = 1;
            while (i < n)
            {
                if (n % i == 0)
                {
                    sum += i;
                }
                i++;
            }
            if (sum == n)
            {
                System.out.println("It is a perfect number");
            }
            else
            {
                System.out.println("It is not a perfect number");
            }
        }
    }
}