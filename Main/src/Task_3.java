import java.util.Scanner;
import java.util.Random;

public class Task_3{
    public static void main (String[] args){
        Scanner kol = new Scanner(System.in);
        System.out.print("Enter count:");
        int count = kol.nextInt();

        Random random = new Random();
        final int n = 100;
        for (int i = 0; i <= count-1; i++)
            System.out.print(random.nextInt(n)+"\t");
        System.out.println();
        for (int i = 0; i <= count-1; i++)
            System.out.println(random.nextInt(n));
    }
}
