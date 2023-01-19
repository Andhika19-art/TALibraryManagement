package view;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBuku extends JFrame {
    private JPanel PanelMain;
    private JLabel MenuLabel;
    private JButton ButtonDisplay;
    private JButton ButtonTambah;
    private JButton ButtonUpdate;
    private JButton ButtonClear;
    private JButton ButtonBackLogin;


    public MenuBuku() {
        setTitle("coba");
        setSize(350, 300);
        setLayout(null);
        createUIComponents();
        setVisible(true);
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        MenuLabel = new JLabel ("MENU");
        MenuLabel.setBounds(160, 20, 200, 30);
        ButtonDisplay = new JButton("Display Buku");
        ButtonDisplay.setBounds(75, 60, 200, 30);
        ButtonTambah = new JButton("Tambah Buku");
        ButtonTambah.setBounds(75, 100, 200, 30);
        ButtonUpdate = new JButton("Update Buku");
        ButtonUpdate.setBounds(75, 140, 200, 30);
        ButtonClear = new JButton("Delete Buku");
        ButtonClear.setBounds(75, 180, 200, 30);
        ButtonBackLogin = new JButton("Back To Login");
        ButtonBackLogin.setBounds(75, 220, 200, 30);


        add(PanelMain);
        add(MenuLabel);
        add(ButtonClear);
        add(ButtonDisplay);
        add(ButtonTambah);
        add(ButtonUpdate);
        add(ButtonBackLogin);

        ButtonBackLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginGUI();
            }
        });

        ButtonDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DisplayBuku();
            }
        });

        ButtonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TambahBuku();
            }
        });

        ButtonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new UpdateBuku();
            }
        });

        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HapusBuku();
            }
        });
    }
}