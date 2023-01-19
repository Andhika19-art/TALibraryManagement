package model;

import entity.AdminEntity;
import java.util.ArrayList;

public class AdminModel {
    static ArrayList<AdminEntity> arrayAdmin = new ArrayList<>();

    public static void initialData(){
        arrayAdmin.add(new AdminEntity("andika", "dika", "diks"));
        arrayAdmin.add(new AdminEntity("sialan", "sueb", "anang"));
    }

    public static ArrayList<AdminEntity> all(){
        return arrayAdmin;
    }

    public static AdminEntity login(String id,String password){
        for(AdminEntity objek : arrayAdmin){
            if(objek.getId().equals(id) && objek.getPassword().equals(password)){
                return objek;
            }
        }
        return null;
    }
}