package controller;

import entity.AdminEntity;
import model.AdminModel;
//import view.AdminView;

public class AdminController {

//    public void loginToMain(){
//        AdminView adminview = new AdminView();
//        new AdminView().menu();
//    }

    public boolean login(String id,String password){
//        for(AdminEntity admin : AdminModel.all()){
//            if (admin.getId().equals(id) && admin.getPassword().equals(password)){
//                return true;
//            }
//        }
//        return false;
//
        AdminEntity admin =  AdminModel.login(id, password);
        if(admin!=null){
            return true;
        }else{
            return false;
        }
    }
}