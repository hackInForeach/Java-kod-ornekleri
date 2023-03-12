public class Main {
    public static void main(String[] args) {
        //NOT: DEĞİŞİME DİRENMEYEN KODLAR YAZ HER ZAMAN!!!!!!!!!!!!!!

    KrediUI krediUI = new KrediUI();

    krediUI.KrediHesapla(new OgretmenKrediManager());
    krediUI.KrediHesapla(new TarimKrediManager());
    krediUI.KrediHesapla(new AskerKrediManager());

    }
}