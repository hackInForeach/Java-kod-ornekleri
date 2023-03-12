import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sayiBulmaca();


    }
    public static void sayiBulmaca(){
        int[] numbers = {
                1, 2, 5, 7, 9, 0
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak sayıyı gir = ");
        int toCall = scanner.nextInt();
        boolean isThere = false;
        for (int number : numbers) {
            if (toCall == number) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            giveMessage("Girilen sayı mevcuttur : "+toCall);
        } else {
            System.out.println("Girilen sayı listede mevccut değil : "+toCall);
        }
    }
    public static void giveMessage(String message){
        System.out.println(message);
    }
}