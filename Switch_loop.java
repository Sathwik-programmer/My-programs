import java.util.Scanner;
class Switch_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Armstrong number\n2. Spy number\n3. Perfect number\n4. Abundant number(n)");
        System.out.println("Enter the First Character of your choice of the operation you want to perform:");
        char ch = in.next().charAt(0);

        switch (ch) {
            case 'A' ->  {
                System.out.println("Enter a number:");
                int n = in.nextInt();
                int temp = n, sum = 0;
                while (n != 0) {
                    int r = n % 10;
                    sum = sum + r * r * r;
                    n = n / 10;
                }
                if (temp == sum) {
                    System.out.println("Armstrong number");
                } else {
                    System.out.println("Not an Armstrong number");
                }
            }
            case 'S' ->  {
                System.out.println("Enter a number:");
                int n = in.nextInt();
                int temp = n, product = 1, sum = 0;
                while (temp != 0) {
                    int r = temp % 10;
                    product *= r;
                    sum += r;
                    temp = temp / 10;
                }
                if (product == sum) {
                    System.out.println("It is a spy number");
                } else {
                    System.out.println("It is not a spy number");
                }
            }
            case 'P' ->  {
                System.out.println("Enter a number:");
                int n = in.nextInt();
                int sum = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
                if (sum == n) {
                    System.out.println("It is a perfect number");
                } else {
                    System.out.println("It is not a perfect number");
                }
            }
            case 'N' ->  {
                System.out.println("Enter a number:");
                int number = in.nextInt();
                int sum = 0;
                for (int i = 1; i <= number / 2; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                if (sum > number) {
                    System.out.println(number + " is an Abundant Number.");
                } else {
                    System.out.println(number + " is NOT an Abundant Number.");
                }
            }
            default -> System.out.println("Invalid choice!!!!!");
        }
    }
    // Close the scanner after main method execution
    // This prevents resource leaks
    // and resolves syntax errors
}
