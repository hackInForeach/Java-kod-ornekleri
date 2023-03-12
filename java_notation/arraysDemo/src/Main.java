public class Main {
    public static void main(String[] args) {

        String ogrenci1="Doğukan";
        String ogrenci2="Volkan";
        String ogrenci3="Batıkan";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("\n");

        String[] students= new String[1];
        students[0]="Doğukan";
        students[1]="Volkan";
        students[2]="Batıkan";
        students[3]="Ali";
        students[4]="Ahmet";

        for (int i=0;i<students.length;i++){
            System.out.println(i);
        }

        System.out.println("\n");

        for (String student:students) {
            System.out.println(student);
        }


    }
}