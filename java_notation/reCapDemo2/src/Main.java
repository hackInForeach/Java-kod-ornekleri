public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 5.4, 2.3, 0.5};
        double total = 0;
        double enb = myList[0];
        double enk = myList[0];
        for (double number : myList) {
            total = total + number;
            System.out.println(number);

            if (enb < number) {
                enb = number;
            }
            if (enk > number) {
                enk = number;
            }
        }
        System.out.println("En büyük sayı = " + enb);
        System.out.println("en küçük sayı = " + enk);
        System.out.println("Toplam = " + total);

    }
}