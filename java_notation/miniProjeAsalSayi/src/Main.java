import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bu program girilen sayının asal olup olmadığını söyler.");

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        boolean sayac= true;

        if (number>=2){
            for (int i=2;i<number;i++){
                if (number%i==0){
                    sayac = false;
                    break;
                }
            }
            if (sayac){
                System.out.println("Girilen sayı asaldır");
            }else {
                System.out.println("Girilen sayı asal değildir");
            }

        }else {
            System.out.println("Lütfen 2 veya daha büyük bir pozitif sayı giriniz!");
        }
    }
}