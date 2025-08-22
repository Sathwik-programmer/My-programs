import java.util.Scanner;
class Math_Methods
{
    public static void main(String[]args)
    {
        Scanner in= new Scanner(System.in);
        double a,b,c,d,e,f,g,h,i,j,k,l,m,n;
        System.out.println("Enter a");
        a=in.nextDouble();
        System.out.println("Enter b");
        b=in.nextDouble();
        System.out.println(Math.max(a,b));
        System.out.println("Enter c");
        c=in.nextDouble();
        System.out.println("Enter d");
        d=in.nextDouble();
        System.out.println(Math.min(c,d));
        System.out.println("Enter e");
        e=in.nextDouble();
        System.out.println(Math.sqrt(e));
        System.out.println("Enter f");
        f=in.nextDouble();
        System.out.println(Math.cbrt(f));
        System.out.println("Enter g");
        g=in.nextDouble();
        System.out.println(Math.abs(g));
        System.out.println("Enter h");
        h=in.nextDouble();
        System.out.println("Enter i");
        i=in.nextDouble();
        System.out.println(Math.pow(h,i));
        System.out.println("Enter j");
        j=in.nextDouble();
        System.out.println(Math.round(j));
        System.out.println("Enter k");
        k=in.nextDouble();
        System.out.println(Math.ceil(k));
        System.out.println("Enter m");
        m=in.nextDouble();
        System.out.println(Math.floor(m));
        System.out.println("Enter n");
        System.out.println(Math.random());
    }
}
