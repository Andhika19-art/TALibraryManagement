package view;

import entity.BukuEntity;
import model.PerpusModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayBuku extends JFrame {


    DisplayBuku(){
        super("Display Buku Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(1104,488);

        JLabel label = new JLabel("List Buku");
        label.setFont(new Font("Serif",Font.BOLD,40));
        label.setBounds(414,45,262,48);

        JTable dataBuku = new JTable();
        TableModel model = createTableModel();
        dataBuku.setModel(model);

        JScrollPane scroll = new JScrollPane(dataBuku);
        scroll.setBounds(32,114,1026,297);

        JButton back = new JButton("BACK");
        back.setBounds(28,24,98,43);

        add(scroll);
        add(label);
        add(back);
        setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuBuku();
            }
        });
    }

    private TableModel createTableModel(){
        DefaultTableModel dataBuku = new DefaultTableModel();
        Object[] kolom = {"NO","Judul","Pengarang","Kode","Terbit"};
        dataBuku.setColumnIdentifiers(kolom);
        int i =0;
        for (BukuEntity buku : PerpusModel.all()) {
            Object[] data = new String[] {
                    String.valueOf(i+1),
                    buku.getJudul(),
                    buku.getPengarang(),
                    String.valueOf(buku.getKode()),
                    String.valueOf(buku.getTahunTerbit()),
            };
            i++;
            dataBuku.addRow(data);
        }
        return dataBuku;
    }

}