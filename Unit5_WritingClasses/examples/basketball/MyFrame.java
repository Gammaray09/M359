package Unit5_WritingClasses.examples.basketball;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {
    Skills skillProfile1 = new Skills(3,4,5,6,0);
    Skills skillProfile2 = new Skills(4,3,7,5,4);
    Skills skillProfile3 = new Skills(5,1,7,3,8);
    Skills skillProfile4 = new Skills(1,4,5,6,2);
    Skills finalSkillProfile = skillProfile1;

    Players p9;

    JTextField nameInput;
    JTextField HeightInput;
    JTextField WeightInput;

    JRadioButton skillProfile1Button;
    JRadioButton skillProfile2Button;
    JRadioButton skillProfile3Button;
    JRadioButton skillProfile4Button;

    JButton submitButton;
    JButton matchButton;


    MyFrame(){

        this.setTitle("Basketball Tester");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,260);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.lightGray);



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

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.lightGray);
        panel4.setBounds(0,120,450,50);



        JLabel title = new JLabel("Create Player 9");
        title.setFont(new Font("Rockwell", Font.BOLD, 25));

        JLabel playerTitle = new JLabel("Player Name");
        playerTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));
        playerTitle.setHorizontalAlignment(JLabel.LEFT);

        JLabel heightTitle = new JLabel("Height    ");
        heightTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));

        JLabel weightTitle = new JLabel("Weight    ");
        weightTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));
        weightTitle.setBounds(0,95,200,25);



        nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(250,20));
        nameInput.setFont(new Font("Rockwell", Font.PLAIN,15));
        nameInput.setForeground(Color.BLACK);
        nameInput.setCaretColor(Color.BLACK);

        HeightInput = new JTextField();
        HeightInput.setPreferredSize(new Dimension(250,20));
        HeightInput.setFont(new Font("Rockwell", Font.PLAIN,15));
        HeightInput.setForeground(Color.BLACK);
        HeightInput.setCaretColor(Color.BLACK);
        HeightInput.setHorizontalAlignment(JTextField.LEFT);

        WeightInput = new JTextField();
        WeightInput.setPreferredSize(new Dimension(250,20));
        WeightInput.setFont(new Font("Rockwell", Font.PLAIN,15));;
        WeightInput.setForeground(Color.BLACK);
        WeightInput.setCaretColor(Color.BLACK);
        WeightInput.setHorizontalAlignment(JTextField.LEFT);

        submitButton = new JButton();
        submitButton.setBounds(350,175,75,35);
        submitButton.addActionListener(this);
        submitButton.setText("Submit");

        matchButton = new JButton();
        matchButton.setBounds(265,175,75,35);
        matchButton.addActionListener(this);
        matchButton.setText("Match");


        skillProfile1Button = new JRadioButton("skillProfile1");
        skillProfile2Button = new JRadioButton("skillProfile2");
        skillProfile3Button = new JRadioButton("skillProfile3");
        skillProfile4Button = new JRadioButton("skillProfile4");

        ButtonGroup group = new ButtonGroup();
        group.add(skillProfile1Button);
        group.add(skillProfile2Button);
        group.add(skillProfile3Button);
        group.add(skillProfile4Button);

        this.add(panel4);
        panel4.add(skillProfile1Button);
        panel4.add(skillProfile2Button);
        panel4.add(skillProfile3Button);
        panel4.add(skillProfile4Button);


        this.add(panel0);
        panel0.add(title);

        this.add(panel1);
        panel1.add(playerTitle);
        panel1.add(nameInput);

        this.add(panel2);
        panel2.add(heightTitle);
        panel2.add(HeightInput);

        this.add(panel3);
        panel3.add(weightTitle);
        panel3.add(WeightInput);

        this.add(submitButton);
        this.add(matchButton);

        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // if/else statement for skill profile
        if(e.getSource() == skillProfile1Button){
            finalSkillProfile = skillProfile1;
        } else if(e.getSource() == skillProfile2Button){
            finalSkillProfile = skillProfile2;
        }else if(e.getSource() == skillProfile3Button){
            finalSkillProfile = skillProfile3;
        }else{
            finalSkillProfile = skillProfile4;
        }

        // if/else statement creates new player if button pressed
        // if no info present then display error message
        if (e.getSource() == submitButton){
            if(nameInput.getText().equals("") || HeightInput.getText().equals("") ||
                    WeightInput.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Info", "Error",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                p9 = new Players(nameInput.getText(), HeightInput.getText(),
                        Integer.parseInt(WeightInput.getText()), skillProfile1);
                System.out.println(p9);
            }
        }


        if (e.getSource() == matchButton){
            //Basketball_Tester.match();
        }

    }


}


