import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bu program girilen sayının mükemmel sayı olupolmadığını söyler.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int number = scan.nextInt();

        int total=0;

        for (int i=1;i<number;i++){
            if (number%i==0){
                total=total+i;
            }
        }
        if (number==total){
            System.out.println("Girilen sayı mükemmel sayıdır.");
        }else {
            System.out.println("Girilen sayı mükemmel değildir.");
        }

    }
}