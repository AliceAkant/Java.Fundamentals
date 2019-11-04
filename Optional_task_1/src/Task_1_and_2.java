import java.util.Scanner;

public class Task_1_and_2 {
    public static void main (String[] arg) {
        int mas[];
        mas = new int[100];
        Scanner Numbers = new Scanner(System.in);
        Scanner Count = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = Count.nextInt();

        for (int i = 0; i <= count-1; i++) {
            System.out.print("Enter number " + (i+1) + ") ");
            int number = Numbers.nextInt();
                mas[i] = number;
        }


        //short and long
        int min = 1000, minNum = 0;
        int max = 0, maxNum = 0;
        String strInt;
        for (int i = 0; i <= count-1; i++) {
            strInt = Integer.toString (mas[i]);
            if (strInt.length() < min){
                min = strInt.length();
                minNum = mas[i];
            }
            if (strInt.length() > max) {
                max = strInt.length();
                maxNum = mas[i];
            }
        }
        System.out.print("The shortest num " + minNum  + "; ");
        System.out.print("length: " + min + "\n");
        System.out.print("The longest num " + maxNum + "; ");
        System.out.print("length: " + max + "\n");

        //sorting in ascending (descending) order (the length of the number)
        int k;
        int mas1[] = mas;
        String strInt1;
        String strInt2;
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 0; i <= count - 2; i++) {
                strInt1 = Integer.toString (mas1[i]);
                strInt2 = Integer.toString (mas1[i + 1]);
                if (strInt1.length() > strInt2.length()) {
                    k = mas1[i + 1];
                    mas1[i + 1] = mas1[i];
                    mas1[i] = k;
                    needIteration = true;
                }
            }
        }
        System.out.print("Sorting in ascending order (length of the number): ");
        for (int i = 0; i <= count-1; i++)
            System.out.print(mas1[i] + " ");

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i <= count - 2; i++) {
                strInt1 = Integer.toString (mas1[i]);
                strInt2 = Integer.toString (mas1[i + 1]);
                if (strInt1.length() < strInt2.length()) {
                    k = mas1[i + 1];
                    mas1[i + 1] = mas1[i];
                    mas1[i] = k;
                    needIteration = true;
                }
            }
        }
        System.out.print("\nSorting in descending order (length of the number): ");
        for (int i = 0; i <= count-1; i++)
            System.out.print(mas1[i] + " ");
    }
}
