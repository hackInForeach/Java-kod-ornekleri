import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birsayı girin: ");
        int sayi = sc.nextInt();

        if (sayi<20){
            System.out.println("Sayı 20 den küçüktür.");
        }
        else if(sayi==20)  {
            System.out.println("Sayı 20 ye eşittir.");
        }else {
            System.out.println("Sayı 20 den büyüktür.");
        }

    }
}