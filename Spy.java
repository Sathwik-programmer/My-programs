import java.util.Scanner;

class Spy {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, temp, product = 1, sum = 0;
        System.out.println("Enter a number:");
        n = in.nextInt();
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            temp = temp / 10;
            product *= r;
            sum += r;
        }
        if (product == sum) {
            System.out.println("It is a spy number");
        } else {
            System.out.println("It is not a spy number");
        }
        in.close();
    }
}

