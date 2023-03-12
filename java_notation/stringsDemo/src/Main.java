public class Main {
    public static void main(String[] args) {

        String message = "Bugün hava çok güzel";
        System.out.println(message);
        //MetinselMetodlar(message);

        String message2 = message.replace(" ","_");
        System.out.println(message2);
        //.replace(eski metin,yeni metin) ilgili ifadeyi değiştirmeye yarar eyer yeni ifade kullanılmak isteniyorsa bir değişkene atanmalı!

        System.out.println(message.substring(2,5));
        //.substring(şurdan başla şurayakadar kes/al)

        for (String kelime:message.split(" ")){
            //.split(şuna göre parçala) bir dizi dööndürür
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        //.toLowerCase() metodu tüm ifadeyi küçük harf yapar

        System.out.println(message.toUpperCase());
        //.toUpperCase() metodu tüm ifadeyi büyük harf yapar

        //.toUpperCase() ve .toLowerCase() metodları data aramalarında sıklıkla kullanılır

        String message3 = "    Bugün hava çok güzel   ";
        System.out.println(message3.trim());
        //.trim() metodu baş ve sonda oluşan gereksiz boşlukları siler

        



    }

    private static void MetinselMetodlar(String message) {
        System.out.println("Eleman sayısı = " + message.length());
        //.length() metodu eleman sayısını verir (boşlukta bir karakter(eleman)dır)

        System.out.println("5. eleman = " + message.charAt(4));
        //.charAt() içerideki elemanı aramak ve '0' dan başlar

        System.out.println(message.concat(" ve çok güzel"));
        //.concat() yazılan metni var olan ile birleştirir

        System.out.println(message.startsWith("B"));
        //.startsWith() ile başlıyor mu , yani ifade doğuruysa true değilse false dödürür

        System.out.println(message.endsWith("a"));
        //.endsWhith() ifade şununla bitiyor mu , yani ifade doğuruysa true değilse false dödürür

        char[] karakterler = new char[6];
        message.getChars(0,6,karakterler,0);
        System.out.println(karakterler);
        //.getChars(şurdan başla, şurayakadar al,şunun içine koy,koymaya şuradan başla)

        System.out.println(message.indexOf('a'));
        //.indexOf() ifadenin içeirisinde kaçıncı karakterde yer aldığını söyler ve ilk bulduğu yerde durur (metin de aranabilir) .indexOf("hava") gibi aramaya baştan başlar

        System.out.println(message.lastIndexOf("çok"));
        //.lastIndexOf() ifadenin içeirisinde kaçıncı karakterde yer aldığını söyler ve ilk bulduğu yerde durur (metin de aranabilir) .lastIndexOf("hava") gibi aramaya sonrdan başlar
    }
}