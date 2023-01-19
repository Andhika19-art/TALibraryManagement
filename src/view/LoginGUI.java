package view;

import controller.AdminController;
import model.AdminModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel PanelMain;
    private JTextField TextFieldUssername;
    private JTextField TextFieldPassword;
    private JButton ButtonLogin;
    private JButton ButtonExit;
    private JLabel LOGINLabel;
    JLabel userLabel;
    JLabel passLabel;
    AdminController admin = new AdminController();

    public LoginGUI() {
        setTitle("coba");
        setSize(400, 300);
        setLayout(null);
        setResizable(false);
        createUIComponents();
        setVisible(true);
    }

    private void createUIComponents() {
        PanelMain = new JPanel();
        LOGINLabel = new JLabel ("LOGIN");
        LOGINLabel.setBounds(200, 20, 200, 30);
        userLabel = new JLabel("ussername");
        userLabel.setBounds(50, 50, 200, 30);
        passLabel = new JLabel("password");
        passLabel.setBounds(50, 100, 200, 30);


        TextFieldUssername = new JTextField();
        TextFieldUssername.setBounds(120, 50, 200, 30);
        TextFieldPassword = new JTextField();
        TextFieldPassword.setBounds(120, 100, 200, 30);
        ButtonLogin = new JButton("Login");
        ButtonLogin.setBounds(140, 180, 100, 30);
        ButtonExit = new JButton("Exit");
        ButtonExit.setBounds(140, 220, 100, 30);

        add(PanelMain);
        add(LOGINLabel);
        add(userLabel);
        add(passLabel);
        add(TextFieldUssername);
        add(TextFieldPassword);
        add(ButtonLogin);
        add(ButtonExit);
        
        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        {
        }
    ButtonLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userValue = TextFieldUssername.getText();        //get user entered username from the textField1
            String passValue = TextFieldPassword.getText();        //get user entered pasword from the textField2

            boolean status = admin.login(userValue,passValue);
            if (status) {  
                
                dispose();
                MenuBuku page = new MenuBuku();
                JOptionPane.showMessageDialog(null,"LoginSukses",
                        "Success",JOptionPane.INFORMATION_MESSAGE);

                //create a welcome label and set it to the new page

            } else {
                //show error message

                JOptionPane.showMessageDialog(null,"Username Atau Password Salah",
                        "login gagal",JOptionPane.ERROR_MESSAGE);
            }
        }

    })
        ;}
    }
