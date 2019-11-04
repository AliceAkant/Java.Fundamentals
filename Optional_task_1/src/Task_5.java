import java.util.Scanner;

public class Task_5 {
    public static void main(String[] arg) {
        int mas[];
        mas = new int[100];
        Scanner Numbers = new Scanner(System.in);
        Scanner Count = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = Count.nextInt();

        for (int i = 0; i <= count - 1; i++) {
            System.out.print("Enter number " + (i + 1) + ") ");
            int number = Numbers.nextInt();
                mas[i] = number;
        }

        int evenKol = 0;
        int kol = 0;
        int even = 0, uneven = 0;

        for (int i = 0; i <= count - 1; i++) {
            uneven = even = 0;
            while (mas[i] != 0) {
                if ((mas[i] % 10) % 2 == 0) {
                    mas[i] = mas[i] / 10;
                    even++;
                } else {
                    mas[i] = mas[i] / 10;
                    uneven++;
                }
            }
            if (even == uneven) {
                kol++;
            }else {
                if (uneven == 0)
                    evenKol++;
            }
        }
        System.out.print("\n Count of numbers containing only even digits: " + evenKol);
        System.out.print("\n Count of numbers containing the same count of even and odd digits: " + kol);
    }
}

