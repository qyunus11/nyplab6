package org.example;

public class Ders {
    private static int dersSayisi = 0;
    private String dersAdi;

    public Ders(String dersAdi) {
        this.dersAdi = dersAdi;
        dersSayisi++;
    }

    public void DersBilgisiYaz() {
        System.out.println("Ders Adı: " + dersAdi);
    }

    public static void DersSayiBilgisiYaz() {
        System.out.println("Toplam Ders Sayısı: " + dersSayisi);
    }
}
