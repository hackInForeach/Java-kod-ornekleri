import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String not = sc.next();
        switch (not) {
            case "A":
                System.out.println("Mükemmel Geçtiniz");
                break;
            case "B":
            case "C":
                System.out.println("Normal Geçtiniz");
                break;
            case "D":
                System.out.println("Sorumlu Geçtiniz");
                break;
            case "F":
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Lütfen A B C D veya F giriniz!");
        }
    }
}