import java.util.*;
class dicerium
{
    public static void main()
    {
     Scanner in=new Scanner(System.in);
     int n, digitCount;
     double sum=0;
     System.out.println("Enter the number of terms:");
     n=in.nextInt();
     int temp = n;
     digitCount = 0;
     while(temp != 0) {
         digitCount++;
         temp /= 10;
     }
     while(n!=0)
     {
        int digit = n % 10; 
            sum += Math.pow(digit, digitCount); 
            digitCount--; 
            n /= 10;
     }
     System.out.println("Dicerium number");
     System.out.println("Sum: " + sum);
     in.close();
    }
}