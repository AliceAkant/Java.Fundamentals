import java.util.Scanner;

public class Task_1 {
    public static void main (String[] arg)
    {
        Scanner Name = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = Name.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
