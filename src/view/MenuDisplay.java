//package view;
//
//import controller.AdminController;
//import java.util.Scanner;
//
//public class LoginAdmin {
//    Scanner input = new Scanner(System.in);
//    AdminController admin = new AdminController();
//
//    public void login(){
//        try{
//            System.out.print("Masukkan Id       = ");
//            int id = input.nextInt();
//            input.nextLine();
//            System.out.print("Masukkan Password = ");
//            String password = input.nextLine();
//            boolean status = admin.login(id, password);
//            if(status){
//                new BukuMenuView().menu();
//            }else{
//                System.out.println("Salah");
//            }
//
//        }catch(Exception e){
//            System.out.println("Id Harus Angka");
//        }
//    }
//}