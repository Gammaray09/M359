package Unit5_WritingClasses.examples.basketball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {
    JTextField nameInput;

    MyFrame(){
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        panel1.setBounds(0,0,400,250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(400,0,400,250);

        JLabel label1 = new JLabel("Player Name:");
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);

        nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(150,30));
        nameInput.setFont(new Font("Ariel", Font.PLAIN,25));
        nameInput.setForeground(Color.BLACK);
        nameInput.setCaretColor(Color.BLACK);

        this.setTitle("Basketball Tester");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,800);
        this.setResizable(false);
        this.add(panel1);
        panel1.add(label1);
        panel1.add(nameInput);
        this.add(panel2);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
