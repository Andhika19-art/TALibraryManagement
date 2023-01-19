package view;

import controller.PerpusController;
import entity.BukuEntity;
import model.PerpusModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBuku extends JFrame{

    UpdateBuku(){
        super("Update Buku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(662,370);

        JLabel label = new JLabel("Update Buku");
        label.setFont(new Font("Serif",Font.BOLD,30));
        label.setBounds(281,16,204,36);

        JLabel judulLama = new JLabel("Judul Lama");
        judulLama.setFont(new Font("Serif",Font.BOLD,20));
        judulLama.setBounds(20,66,172,24);

        JLabel judulBaru = new JLabel("Judul Baru");
        judulBaru.setFont(new Font("Serif",Font.BOLD,20));
        judulBaru.setBounds(20,102,98,24);

        JLabel pengarangBaru = new JLabel("Pengarang Baru");
        pengarangBaru.setFont(new Font("Serif",Font.BOLD,20));
        pengarangBaru.setBounds(20,138,140,24);

        JLabel kodeBaru = new JLabel("Kode Baru");
        kodeBaru.setFont(new Font("Serif",Font.BOLD,20));
        kodeBaru.setBounds(20,174,106,24);

        JLabel terbitBaru = new JLabel("Terbit Baru");
        terbitBaru.setFont(new Font("Serif",Font.BOLD,20));
        terbitBaru.setBounds(20,214,106,24);

        JTextField judulLamaTF = new JTextField();
        judulLamaTF.setFont(new Font("Serif",Font.PLAIN,18));
        judulLamaTF.setBounds(204,66,418,24);

        JTextField judulBaruTF = new JTextField();
        judulBaruTF.setFont(new Font("Serif",Font.PLAIN,18));
        judulBaruTF.setBounds(204,102,418,24);

        JTextField pengarangBaruTF = new JTextField();
        pengarangBaruTF.setFont(new Font("Serif",Font.PLAIN,18));
        pengarangBaruTF.setBounds(204,138,418,24);

        JTextField kodeBaruTF = new JTextField();
        kodeBaruTF.setFont(new Font("Serif",Font.PLAIN,18));
        kodeBaruTF.setBounds(204,174,418,24);

        JTextField terbitBaruTF = new JTextField();
        terbitBaruTF.setFont(new Font("Serif",Font.PLAIN,18));
        terbitBaruTF.setBounds(204,214,418,24);

        JButton back = new JButton("BACK");
        back.setFont(new Font("Serif",Font.BOLD,16));
        back.setBounds(17,269,79,35);

        JButton confirm = new JButton("CONFIRM");
        confirm.setFont(new Font("Serif",Font.BOLD,16));
        confirm.setBounds(502,269,120,35);

        add(label);
        add(judulLama);
        add(judulBaru);
        add(pengarangBaru);
        add(kodeBaru);
        add(terbitBaru);
        add(judulLamaTF);
        add(judulBaruTF);
        add(pengarangBaruTF);
        add(kodeBaruTF);
        add(terbitBaruTF);
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
                String judulLama = judulLamaTF.getText();
                String judulBaru = judulBaruTF.getText();
                String pengarangBaru = pengarangBaruTF.getText();
                int kode = Integer.parseInt(kodeBaruTF.getText());
                int terbit = Integer.parseInt(terbitBaruTF.getText());
                BukuEntity buku = PerpusModel.cariBuku(judulLama);
                if(buku!=null){
                    buku.setJudul(judulBaru);
                    buku.setPengarang(pengarangBaru);
                    buku.setKode(kode);
                    buku.setTahunTerbit(terbit);
                    JOptionPane.showMessageDialog(null,"Buku <"+judulLama+"> berhasil diedit menjadi <"+judulBaru+">","Success",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new UpdateBuku();
                }else{
                    JOptionPane.showMessageDialog(null,"Buku <"+judulLama+"> tidak ditemukan!!!","Warning",JOptionPane.WARNING_MESSAGE);
                    dispose();
                    new UpdateBuku();
                }
            }
        });
    }

}