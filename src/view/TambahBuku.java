package view;


import entity.BukuEntity;
import entity.PerpusEntity;
import model.PerpusModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahBuku extends JFrame {

    TambahBuku(){
        super("TambahBuku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(662,304);

        JLabel labelMenu = new JLabel("Tambah Buku");
        labelMenu.setFont(new Font("Serif",Font.BOLD,27));
        labelMenu.setBounds(251,24,203,30);

        JLabel judul = new JLabel("Judul");
        judul.setFont(new Font("Serif",Font.BOLD,20));
        judul.setBounds(20,66,116,24);

        JLabel pengarang = new JLabel("Pengarang");
        pengarang.setFont(new Font("Serif",Font.BOLD,20));
        pengarang.setBounds(20,102,116,24);

        JLabel kode = new JLabel("Kode");
        kode.setFont(new Font("Serif",Font.BOLD,20));
        kode.setBounds(20,138,151,24);

        JLabel tahun = new JLabel("Terbit");
        tahun.setFont(new Font("Serif",Font.BOLD,20));
        tahun.setBounds(20,174,151,24);

        JTextField judulTF = new JTextField();
        judulTF.setFont(new Font("Serif",Font.PLAIN,18));
        judulTF.setBounds(184,69,438,24);

        JTextField pengarangTF = new JTextField();
        pengarangTF.setFont(new Font("Serif",Font.PLAIN,18));
        pengarangTF.setBounds(184,104,438,24);

        JTextField kodeTF = new JTextField();
        kodeTF.setFont(new Font("Serif",Font.PLAIN,18));
        kodeTF.setBounds(184,140,438,24);

        JTextField tahunTF = new JTextField();
        tahunTF.setFont(new Font("Serif",Font.PLAIN,18));
        tahunTF.setBounds(184,176,438,24);

        JButton back = new JButton("BACK");
        back.setFont(new Font("Serif",Font.PLAIN,15));
        back.setBounds(20,215,79,35);

        JButton confirm = new JButton("CONFIRM");
        confirm.setFont(new Font("Serif",Font.PLAIN,15));
        confirm.setBounds(502,215,120,35);

        add(labelMenu);
        add(kode);
        add(judul);
        add(pengarang);
        add(tahun);
        add(kodeTF);
        add(judulTF);
        add(pengarangTF);
        add(tahunTF);
        add(confirm);
        add(back);

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
                String pengarang = pengarangTF.getText();
                int kode = Integer.parseInt(kodeTF.getText());
                int tahun = Integer.parseInt(tahunTF.getText());
                BukuEntity cariBuku = PerpusModel.cariBuku(judul);
                if(cariBuku!=null){
                    JOptionPane.showMessageDialog(null,"Buku <"+judul+"> Sudah Pernah Ditambahkan!!","Warning",JOptionPane.WARNING_MESSAGE);
                    dispose();
                    new TambahBuku();
                }
                else{
                    BukuEntity buku = new BukuEntity(judul,pengarang,kode,tahun);
                    PerpusModel.tambahBuku(buku);
                    JOptionPane.showMessageDialog(null,"Buku <"+judul+"> berhasil ditambahkan","Success",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new TambahBuku();
                }

            }
        });

    }
}