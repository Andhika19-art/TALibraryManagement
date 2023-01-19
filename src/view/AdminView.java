//package view;
//
//import java.util.Scanner;
//
//public class AdminView {
//    Scanner input = new Scanner(System.in);
//
//    public void menu(){
//        String pilih;
//        do{
//            System.out.println("""
//                    1. Login
//                    2. Keluar
//                    """);
//            System.out.print("Masukkan Pilihan = ");
//            pilih = input.nextLine();
//            switch(pilih){
//                case "1" -> new LoginAdmin().login();
//                case "2" -> System.out.println("Keluar");
//                default -> System.out.println("Pilihan Tidak ada");
//            }
//        }while(!pilih.equals("2"));
//    }
//}
