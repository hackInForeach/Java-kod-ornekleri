public class Main {
    public static void main(String[] args) {

//        ForLoop();
//        WhileLoop();
//        DoWhileLoop();



    }

    private static void DoWhileLoop() {
        int a=0;
        do {
            System.out.println(a);
            a=a+1;
        }while (a<=10);
        System.out.println("Do While Döngüsü Bitti");
    }

    private static void WhileLoop() {
        int i=0;
        while (i<10){
            i=i+1;
            System.out.println(i);
        }
        System.out.println("While Döngüsü Bitti");
    }

    private static void ForLoop() {
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For Dögüsü Bitti.");
    }

}