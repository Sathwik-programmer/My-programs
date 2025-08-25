/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        String name;
        double s_v,commision;
        System.out.println("Enter your name");
        name=in.next();
        System.out.println("Enter your sales value");
        s_v=in.nextDouble();
        if(s_v<=5000)
        commision=s_v*5.0/100;
        else if(s_v>=5001 && s_v<=10000)
        commision=s_v*10.0/100;
        else
        commision=s_v*15.0/100;
        System.out.println("Your commision is: "+commision);
	}
}

