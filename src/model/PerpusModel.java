package model;

import entity.BukuEntity;
import java.util.ArrayList;

public class PerpusModel {
    private static ArrayList<BukuEntity> arrayBuku = new ArrayList<>();

    public static ArrayList<BukuEntity> all(){
        return arrayBuku;
    }

    public static void bukuYangAda(){
        arrayBuku.add(new BukuEntity("pemimpi", "agam", 9, 2002));
        arrayBuku.add(new BukuEntity("pemimpin", "budi", 10, 2003));
    }

    public static void tambahBuku(BukuEntity buku){
        arrayBuku.add(buku);
    }

    public static BukuEntity cariBuku(String judul){
        for(BukuEntity objek : arrayBuku){
            if(objek.getJudul().equals(judul)){
                return objek;
            }
        }
        return null;
    }

    public static int indexData(String judul) {
        BukuEntity Cari = cariBuku(judul);
        return arrayBuku.indexOf(Cari);
    }

    public static void update(BukuEntity buku) {
        int index = indexData(buku.getJudul());

        if (index != -1) {
            arrayBuku.set(index, buku);
        }
    }

    public static void remove(String judul) {
        int index = indexData(judul);

        if (index != -1) {
            arrayBuku.remove(index);
        }
    }
}