package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
    private static int ogrenciSayisi = 0;
    private String ad;
    private int sinif;
    private List<Ders> dersler;

    public Ogrenci() {
        this.ad = "Bilinmiyor";
        this.sinif = 1;
        this.dersler = new ArrayList<>();
        ogrenciSayisi++;
    }

    public Ogrenci(String ad, int sinif) {
        this.ad = ad;
        this.sinif = sinif;
        this.dersler = new ArrayList<>();
        ogrenciSayisi++;
    }

    public Ogrenci(String ad, int sinif, List<Ders> dersler) {
        this.ad = ad;
        this.sinif = sinif;
        this.dersler = dersler;
        ogrenciSayisi++;
    }

    public void OgrenciBilgisiYaz() {
        System.out.println("Ad: " + ad + ", Sınıf: " + sinif + ", Öğrenci Sayısı: " + ogrenciSayisi + ", Ders Sayısı: " + dersler.size());
    }

    public void OgrenciDersBilgiYaz() {
        System.out.println("Dersler:");
        for (Ders ders : dersler) {
            ders.DersBilgisiYaz();
        }
    }

    public void dersEkle(Ders ders) {
        dersler.add(ders);
    }
}
