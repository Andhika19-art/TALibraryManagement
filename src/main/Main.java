package main;

import javax.swing.JOptionPane;
import model.AdminModel;
import view.LoginGUI;
import model.PerpusModel;


//import model.AdminModel;
//import model.PerpusModel;
//import controller.AdminController;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        AdminModel.initialData();
//        PerpusModel.bukuYangAda();
//        new AdminController().loginToMain();
//    }
//}
        
//public class Main {
//
//public static void main(String arg[])
//    {
//        try
//        {
//            //create instance of the CreateLoginForm
//            LoginGUI form = new LoginGUI();
//            AdminModel.initialData();
//            form.setSize(400,300);  //set size of the frame
//            form.setVisible(true);  //make form visible to the user
//        }
//        catch(Exception e)
//        {
//            //handle exception
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//}
public class Main {

public static void main(String arg[])
    {
        AdminModel.initialData();
        PerpusModel.bukuYangAda();

            
            LoginGUI form = new LoginGUI();
        }

}




