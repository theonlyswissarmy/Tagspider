package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        firstopen("hi there");
    }

    private static void firstopen(String text) {
        final JDialog openup = new JDialog();
        JLabel hithere = new JLabel(text);
        JButton selectafile = new JButton("OK");
        final JFileChooser select = new JFileChooser();
        selectafile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openup.setVisible(false);
                select.showDialog(openup, "choose");
                File song = select.getSelectedFile();
                openup.dispose();
            }
        });
        openup.setSize(100, 100);
        openup.add(hithere, "First");
        openup.add(selectafile);
        openup.setVisible(true);
    }
}
