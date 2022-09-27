package methods;

public class Methods {
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranicakSayi = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranicakSayi) {
                varMi = true;
                break;
            }
        }
        if (varMi)
            mesajVer("sayi mevcuttur");
        else
            System.out.println("Sayi mevcut degildir: " + aranicakSayi);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    //variable arguments
    public static int topla2(int... sayilar){
        int toplam=0;
        for (int i=0;i<sayilar.length;i++){
            toplam+=sayilar[i];
        }
        return toplam;
    }

    public static String sehirVer(){
        return "mesaj";
    }
}
