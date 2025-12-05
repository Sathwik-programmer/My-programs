import java.util.Scanner;
public class T_C
{
    public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    int d,am;
    System.out.println("Enter the distance");
    d=in.nextInt();
    if (d==10)
    am=80;
    else if(d>=10 && d<=20)
    am=80+(6*d);
    else if(d>21 && d<=30)
    am=80+(6*d)+(5*d);
    else
    am=80+(6*d)+(5*d)+(4*d);
    System.out.println("Price is :"+am);
in.close();
}

}