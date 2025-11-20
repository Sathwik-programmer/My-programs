import java.util.Scanner;
class Arithemitic_Switch
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\t                                       Program to find the value of arithemetic operations");
        double a=0,b=0,op;
        int x;
        System.out.println("Enter the type of operation you want to do");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulus");
        x=in.nextInt();
        System.out.println("Enter number 1");
        a=in.nextDouble();
        System.out.println("Enter number 2");
        b=in.nextDouble();
        switch(x)
        {
            case 1:
                op=a+b;
                System.out.println("The answer for the operation is: "+op);
                break;

            case 2:
                op=a-b;
                System.out.println("The answer for the operation is: "+op);
                break;

            case 3:
                op=a*b;
                System.out.println("The answer for the operation is: "+op);
                break;

            case 4:
                op=a/b;
                System.out.println("The answer for the operation is: "+op);
                break;

            case 5:
                op=a%b;
                System.out.println("The answer for the operation is: "+op);
                break;

            default :
                System.out.println("INVALD INPUT");
        }
        in.close();
    }
}