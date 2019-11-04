import java.util.Scanner;

public class Task_4 {
    public static void main (String[] arg)
    {
        int mas[];
        mas = new int[100];
        int sum = 0;
        int multipl = 1;
        Scanner Numbers = new Scanner(System.in);
        Scanner Count = new Scanner(System.in);
        System.out.print("Enter count:");
        int count = Count.nextInt();

            for (int i = 0; i <= count-1; i++) {
                System.out.print("Enter number " + (i+1) + ") ");
                int number = Numbers.nextInt();
                mas[i] = number;
            }
            for (int i = 0; i <= count - 1; i++){
                sum += mas[i];
                multipl = multipl * mas[i];
            }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Multiplication of numbers: " + multipl);
    }
}
