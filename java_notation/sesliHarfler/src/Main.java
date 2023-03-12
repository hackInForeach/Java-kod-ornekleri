import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] kalinSesli = new String[]{"A","I","O","U","a","ı","o","u"};
        String[] inceSesli= new String[]{"E","İ","Ö","Ü","e","i","ö","ü"};

        String message = "İnce Sesli";
        String message2 = "Kalın Sesli";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bi harf girin: ");
        String harf = scanner.next();

        for (String ince:inceSesli){
            if (harf.equals(ince)){
                System.out.println(message);
                break;
            }
        }
        for (String kalin:kalinSesli){
            if (harf.equals(kalin)){
                System.out.println(message2);
                break;
            }
        }

        //VEYA ŞU ŞEKİLDE:

        char harf1='I';
        switch (harf1){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen harf kalın sesli.");
                break;
            default:
                System.out.println("Girilen harf ince sesli");
        }

    }
}