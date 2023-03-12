public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        String newMessage = message.substring(0,2); // oluşan yeni değeri bir başka değere atılmazzsa kullanılamaz doğal olarak .substring metodu bir değer döndürür return eder ama void bunu yapmaz
        System.out.println(newMessage);

        String newMessage2 = giveCity();
        System.out.println(newMessage2);

        int number = topla(2,3);// işlemi metoda yaptırdık
        System.out.println(number);

        int number1= topla2(1,2,3,2);//variable argumant denir yani bağımsız değişken kullanımı da azdır ne geldiği belirsiz olduundan
        System.out.println(number1);

    }
    // metodlar reusability tekrar kullanılabilirlik ve don't repaet your self kendini tekrar etme yi uygulamak için kullanılır


    //void : void olan bir operasyonu başka bir değşkene atayamazsın
    // ve void opersayonlar bir şeyler yapar ama değer döndürmezler
    public static void added(){
        System.out.println("Added");
    }
    public static void deleted(){
        System.out.println("Deleted");
    }
    public static void updated(){
        System.out.println("Updated");
    }
    public static int topla(int number1,int number2) {
        return number1+number2;
        //burası voidden farklı olarak bir değer döndürür return eder.
        //burası int türünde bir değer döndürür
    }
    public static int topla2(int... numbers){// bir integer arry gibi çalışır
         int plus = 0;
         for (int numbre:numbers ) {
             plus=plus+numbre;
         }
         return plus;
    }
    public static String giveCity(){
        return "Ankara";
    }

}