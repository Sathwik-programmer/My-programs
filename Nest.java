import java.util.Scanner;

public class Nest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,r,h=0;
		r=in.nextInt();
		n=r;
		while(n!=0)
		{
             if(n%10==0){
                 h++;
             }
			n=n/10;
            
		}
		if(h>=1)
         System.out.println("Nest");
         else 
         System.out.println("Not nest");
		in.close();
	}
}
