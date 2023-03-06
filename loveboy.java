import java.util.Scanner;

public class loveboy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора");
        int boy = sc.nextInt();
        if (boy > 0) {
            if (boy <= 346) {
                System.out.println("Надпись мальчика поместиться на заборе");
            }
            else System.out.println("Надпись мальчика не поместиться на заборе");
        }
        else System.out.println("Введите число больше нуля");

    }
}
