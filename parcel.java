
import java.util.Scanner;
public class parcel
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int w,amount;
		System.out.println("Enter the weight");
		w=in.nextInt();
		if (w<=100)
			amount=10*w;
		else if(w>=101 && w<=200)
			amount=(10*w)+(15*w);
		else if (w>=201 && w<=300)
			amount=(10*w)+(15*w)+(17*w);
		else
			amount=(10*w)+(15*w)+(17*w)+(20*w);
		System.out.println("The amount is: "+amount);
	}
}
