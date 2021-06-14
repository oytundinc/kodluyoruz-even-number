import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double divisibleNumber = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz : ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i ++) {
            if (i % 3 == 0 && i % 4 == 0) {
                divisibleNumber = divisibleNumber + i;
                counter++;
            }
        }
        double averageNumber = divisibleNumber / counter;
        System.out.println(averageNumber);
    }
}
