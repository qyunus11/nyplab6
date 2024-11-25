package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.OgrenciBilgisiYaz();

        Ogrenci ogr2 = new Ogrenci("Ali", 2);
        ogr2.OgrenciBilgisiYaz();

        List<Ders> dersListesi = new ArrayList<>();
        dersListesi.add(new Ders("Matematik"));
        dersListesi.add(new Ders("Fizik"));
        Ogrenci ogr3 = new Ogrenci("Ayşe", 3, dersListesi);
        ogr3.OgrenciBilgisiYaz();

        Ders ders1 = new Ders("Kimya");
        ogr1.dersEkle(ders1);
        ogr1.OgrenciDersBilgiYaz();

        Ders ders2 = new Ders("Biyoloji");
        ogr2.dersEkle(ders2);
        ogr2.OgrenciDersBilgiYaz();

        Ders.DersSayiBilgisiYaz();
    }
}
