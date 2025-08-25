import java.util.Scanner;
class Print_series
{   
       public static void main(String[] args)
    {
       int n=0,s=0,tn=0;
        Scanner in=new Scanner (System.in);
       System.out.println("\nEnter the total number of terms(n):");
       n=in.nextInt();
       for(tn=1;tn<=n;tn=tn+1)
       {
           s=tn*2;
           System.out.print(" "+s);
       }
    }
}