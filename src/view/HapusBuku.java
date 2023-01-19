package view;

import entity.BukuEntity;
import model.PerpusModel;
import view.MenuBuku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HapusBuku extends JFrame {

    HapusBuku(){
        super("Hapus Buku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(662,239);

        JLabel label = new JLabel("Hapus Buku");
        label.setFont(new Font("Serif",Font.BOLD,30));
        label.setBounds(281,13,222,42);

        JLabel judul = new JLabel("Judul Buku ");
        judul.setFont(new Font("Serif",Font.BOLD,20));
        judul.setBounds(20,63,142,30);

        JTextField judulTF = new JTextField();
        judulTF.setFont(new Font("Serif",Font.BOLD,18));
        judulTF.setBounds(204,66,418,30);

        JButton back = new JButton("BACK");
        back.setFont(new Font("Serif",Font.BOLD,16));
        back.setBounds(17,113,79,35);

        JButton confirm = new JButton("CONFIRM");
        confirm.setFont(new Font("Serif",Font.BOLD,16));
        confirm.setBounds(502,113,120,35);

        add(label);
        add(judul);
        add(judulTF);
        add(back);
        add(confirm);

        setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuBuku();
            }
        });

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = judulTF.getText();
                BukuEntity buku = PerpusModel.cariBuku(judul);
                if(buku!=null){
                    PerpusModel.remove(judul);
                    JOptionPane.showMessageDialog(null,"Buku <"+judul+"> berhasil dihapus","Success",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new HapusBuku();
                }else{
                    JOptionPane.showMessageDialog(null,"Buku <"+judul+"> tidak ditemukan","Warning",JOptionPane.WARNING_MESSAGE);
                    dispose();
                    new HapusBuku();
                }
            }
        });
    }


}
