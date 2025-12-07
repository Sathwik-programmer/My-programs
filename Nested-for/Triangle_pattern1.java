public class Triangle_pattern1 
{
    public static void main(String[] args) 
     {

         int rows = 1; 

         for (int i = 5; i >= rows; i--) 
          { 
             for (int j = 1; j <= i; j++) 
            { 
                 System.out.print("* ");
             }
             System.out.println();
          }
     }
}