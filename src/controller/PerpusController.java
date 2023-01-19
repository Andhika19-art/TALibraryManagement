package controller;

import entity.BukuEntity;
import model.PerpusModel;

public class PerpusController {
    
    public void tambahBuku(String judul, String pengarang, int kode, int tahunTerbit){
        BukuEntity buku = new BukuEntity(judul, pengarang, kode, tahunTerbit);
        PerpusModel.tambahBuku(buku);
    }

    public BukuEntity cari(String Judul){
        return PerpusModel.cariBuku(Judul);
    }

    public void hapus(String judul){
        PerpusModel.remove(judul);
    }

    public void edit(String judul, String pengarang, int kode, int tahunTerbit){
        BukuEntity buku = new BukuEntity(judul, pengarang, kode, tahunTerbit);
        PerpusModel.update(buku);
    }
}