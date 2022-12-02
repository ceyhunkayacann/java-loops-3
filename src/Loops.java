import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i*=4) {
            System.out.println("4'ün kuvveti : " + i);
        }

        System.out.println("--------------");

        for (int i = 1; i <= number; i*=5) {
            System.out.println("5'in kuvveti : " + i);
        }
    }
}
