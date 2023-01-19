//package view;
//
//import controller.PerpusController;
//import entity.BukuEntity;
//import model.PerpusModel;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BukuView {
//    Scanner input = new Scanner(System.in);
//    PerpusController perpus = new PerpusController();
//
//    public void tambahBuku(){
//        try{
//            System.out.print("Masukkan Judul        = ");
//            String judul = input.nextLine();
//            System.out.print("Masukkan Pengarang    = ");
//            String pengarang = input.nextLine();
//            System.out.print("Masukkan Kode         = ");
//            int kode = input.nextInt();
//            System.out.print("Masukkan Tahun Terbit = ");
//            int Tahun = input.nextInt();
//            input.nextLine();
//            perpus.tambahBuku(judul, pengarang, kode, Tahun);
//            System.out.println("Berhasil Ditambah");
//        }catch(Exception e){
//            System.out.println("Kode Dan Tahun Terbit Harus Angka");
//            input.nextLine();
//        }
//        
//    }
//
//    public void hapus(){
//        System.out.print("Masukkan Judul Buku Yang akan Dihapus = ");
//        String judul = input.nextLine();
//        BukuEntity buku = perpus.cari(judul);
//        if(buku!=null){
//            perpus.hapus(judul);
//        }else{
//            System.out.println("Data Tidak ada");
//        }
//    }
//
//    public void edit(){
//        System.out.print("Masukkan Judul Buku Yang akan DiEdit = ");
//        String judul = input.nextLine();
//        BukuEntity buku = perpus.cari(judul);
//        if(buku!=null){
//            System.out.print("Masukkan Judul Yang Baru      = ");
//            String judulBaru = input.nextLine();
//            System.out.print("Masukkan Pengarang Yang Baru  = ");
//            String pengarang = input.nextLine();
//            System.out.print("Masukkan Kode Yang Baru        = ");
//            int kode = input.nextInt();
//            System.out.print("Masukkan Tahun Terbit Yang Baru = ");
//            int Tahun = input.nextInt();
//            input.nextLine();
//            buku.setJudul(judulBaru);
//            buku.setPengarang(pengarang);
//            buku.setKode(kode);
//            buku.setTahunTerbit(Tahun);
//        }else{
//            System.out.println("Data Tidak Ada");
//        }
//    }
//
//    public void display(){
//        ArrayList<BukuEntity> array = PerpusModel.all();
//        for(BukuEntity objek : array){
//            System.out.println("Judul        = " + objek.getJudul());
//            System.out.println("Pengarang    = " + objek.getPengarang());
//            System.out.println("Kode         = " + objek.getKode());
//            System.out.println("Tahun Terbit = " + objek.getTahunTerbit());
//        }
//    }
//}
