package org.example;


    import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

    public class Applicationmain extends JFrame {

        private void run() {
            var window = new JPanel();
            window.setLayout(new BoxLayout(window, BoxLayout.X_AXIS));
            window.setBorder(new EmptyBorder(new Insets(15, 15, 15, 15)));

            JButton btn_hello = new JButton("Hello");
            btn_hello.setSize(new Dimension(80, 20));
            window.add(btn_hello);

            window.add(Box.createRigidArea(new Dimension(10, 15)));

            JRadioButton rad_world = new JRadioButton("World");
            rad_world.setSize(new Dimension(80, 20));
            window.add(rad_world);

            add(window);
            pack();

            setTitle("Hello world");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }
        public void getfile(File oursong) {

        }

        public static void main(String[] args) {

            EventQueue.invokeLater(() -> {
                var app = new Applicationmain();
                app.run();
                app.setVisible(true);
            });
        }
    }
}
