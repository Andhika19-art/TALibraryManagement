//package view;
//
//import java.util.Scanner;
//
//public class BukuMenuView {
//    Scanner input = new Scanner(System.in);
//    BukuView buku = new BukuView();
//
//    public void menu(){
//        String pilih;
//        do{
//            System.out.println("""
//                    1. Display Buku
//                    2. Tambah Buku
//                    3. Edit Buku
//                    4. Hapus Buku
//                    5. keluar
//                    """);
//            System.out.print("Masukkan Pilihan = ");
//            pilih = input.nextLine();
//            switch(pilih){
//                case "1" -> buku.display();
//                case "2" -> buku.tambahBuku();
//                case "3" -> buku.edit();
//                case "4" -> buku.hapus();
//                case "5" -> System.out.println();
//                default -> System.out.println("Pilihan Tidak ada");
//            }
//        }while(!pilih.equals("5"));
//    }
//}
