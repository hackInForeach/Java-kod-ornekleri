public class Main {
    public static void main(String[] args) {
        //iş yapan herşey classtır
        //ilk ve temel kural: guruplama yapmak

        CustomerManager customerManager = new CustomerManager();// class çağrımı, bellekte oan customer türünde bir alan ayrılır kullanılmak için

        //classlar refeans tiptir.
        //newlemek hafızada yer kaplar ve sadece ihtiyaç duyduğunda bu nesnel yapıyı kullanmak mantıklıdır akıcıılık için
        customerManager.add();
        customerManager.deleted();
        customerManager.updated();


        int number1 = 10;
        int number2 = 20;

        number2=number1;
        number1 = 30;
        System.out.println(number2);
        //NOT DEĞER TİPLER STACKTE TUTULURKEN BİR DEĞİŞİKLİK OLDUĞUNDA TEKRAR NEWLENMESİ GEREKİR YOKSA İLK DEĞER KALICI OLUR

        int[] numbers1= new int[]{1,2,3};
        int[] numbers2= new int[]{4,5,6};
        numbers2=numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);
        // NOT REFERAS TİPLER HEAP TE TUTULUR BİR DEĞİŞİKLİK OLUĞU ANDA DİREK DEĞİŞİR



    }
}
