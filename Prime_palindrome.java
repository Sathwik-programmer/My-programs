import java.util.*;
class prime_palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,temp,flag=0,r=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        temp=n;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;  
            }
        }
    

          if(flag==0)
          {
            while(n!=0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            if(temp==r)
            {
                System.out.println("The number is a prime palindrome");
            }
            else
            {
                System.out.println("The number is prime but not a palindrome");
            }
          }
          else
          {
              System.out.println("The number is not prime");
          }
          sc.close();
        }
    }
        