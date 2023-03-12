import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soru: Girilen n sayıdan en büyük olanını ekrana yazdır");
        Scanner sc = new Scanner(System.in);
        System.out.println("Karşılaştırılmak istene sayı adedi: ");
        int aded = sc.nextByte();
        int[] list = new int[aded];
        System.out.println("1. sayınızı girin: ");
        int number = sc.nextInt();
        list[0] = number;
        int enb = number;
        for (int i = 1; i < aded; i++) {
            System.out.println(i + 1 + ". sayınızı girin: ");
            number = sc.nextInt();
            list[i] = number;
            if (list[i] >= enb) {
                enb = list[i];
            } else {
                list[i] = enb;
            }
        }
        System.out.println("Enbüyük sayı: " + enb);
    }
}