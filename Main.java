import java.util.Scanner;
public class Main {
    public static void main (String [] Args) {

        Scanner inp = new Scanner(System.in);
        int number,n=1;

        System.out.print("Enter a number: ");
        number = inp.nextInt();

        do {
            System.out.println(n);
            n*=4;
        } while (n <= number);

        System.out.println();
        n=1;

        do {
            System.out.println(n);
            n*=5;
        } while (n <= number);
    }
}
