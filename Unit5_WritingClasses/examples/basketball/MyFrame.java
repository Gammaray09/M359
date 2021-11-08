package Unit5_WritingClasses.examples.basketball;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {
    JTextField nameInput;
    JTextField HeightInput;
    JRadioButton skill1;


    MyFrame(){

        this.setTitle("Basketball Tester");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(450,300);
        this.setResizable(true);
        this.setBackground(Color.lightGray);

        JPanel panel0 = new JPanel();
        panel0.setBackground(Color.lightGray);
        panel0.setBounds(0,0,450,35);


        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(0,35,450,25);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(0,60,450,25);


        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.lightGray);
        panel3.setBounds(0,85,450,50);

        JLabel title = new JLabel("Create Player");
        title.setFont(new Font("Rockwell", Font.BOLD, 25));

        JLabel playerTitle = new JLabel("Player Name");
        playerTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));
        playerTitle.setHorizontalAlignment(JLabel.LEFT);

        JLabel heightTitle = new JLabel("Height    ");
        heightTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));


        nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(250,20));
        nameInput.setFont(new Font("Rockwell", Font.PLAIN,15));
        nameInput.setForeground(Color.GRAY);
        nameInput.setCaretColor(Color.BLACK);

        HeightInput = new JTextField();
        HeightInput.setPreferredSize(new Dimension(250,20));
        HeightInput.setFont(new Font("Ariel", Font.PLAIN,20));
        HeightInput.setForeground(Color.BLACK);
        HeightInput.setCaretColor(Color.BLACK);
        HeightInput.setHorizontalAlignment(JTextField.LEFT);


        this.add(panel0);
        panel0.add(title);

        this.add(panel1);
        panel1.add(playerTitle);
        panel1.add(nameInput);

        this.add(panel2);
        panel2.add(heightTitle);
        panel2.add(HeightInput);

        this.add(panel3);

        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
