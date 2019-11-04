import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args){
        Scanner Line = new Scanner(System.in);
        System.out.print("Enter line :");
        String line = Line.nextLine();

        int k = line.length()-1;
        char text[] = line.toCharArray();

        for (int i = k; i >= 0; i--)
            System.out.print(text[i]);
        /*or like this

        String text_reverse = new StringBuffer(line).reverse().toString();

        System.out.print(text_reverse);*/
    }
}
