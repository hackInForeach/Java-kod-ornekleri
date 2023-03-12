public class Main {
    public static void main(String[] args) {
        String[][] citys = new String[3][3];
        citys[0][0] = " İstanbul ";
        citys[0][1] = " Burdur";
        citys[0][2] = " Isparta";
        citys[1][0] = " Mersin";
        citys[1][1] = " Adana";
        citys[1][2] = " Hatay";
        citys[2][0] = " Osmaniye";
        citys[2][1] = " Kahraman Maraş";
        citys[2][2] = " Antalya";

        for (int i = 0; i <= 2; i++) {
            System.out.println("-----------");
            for (int k = 0; k <= 2; k++) {
                System.out.println(citys[i][k]);
            }
        }
    }
}