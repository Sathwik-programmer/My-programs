import java.util.*;
class Series
{
    public static void main()
    {
     Scanner in=new Scanner(System.in);
     int n;
     double sum=0 ,product=1;
     System.out.println("Enter the number of terms:");
     n=in.nextInt();
     for (int i = 1; i <= n; i++) 
        {

            for (int j = 1; j <= i; j++) 
            {
                    product*=j;
            }
            sum+=product;
        }
        System.out.println("The sum of the series1 is: "+sum);

        for (int i = 1; i <= 5; i++) 
        {

            for (int j = 1; j <= i; j++) 
            {
                    product*=j;
            }
            sum+=product/sum;
        }
        System.out.println("The sum of the series1 is: "+sum);
        in.close();
    }
}