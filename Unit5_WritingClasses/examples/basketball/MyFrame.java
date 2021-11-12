package Unit5_WritingClasses.examples.basketball;


// Stephen Thomas and Aashman Sharma
// Mr. Moon, 6th period

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {
    // Creates skill objects for user to apply to players
    Skills skillProfile1 = new Skills("skillProfile1", 8, 5, 1, 2, 4);
    Skills skillProfile2 = new Skills("skillProfile2",3, 9, 7, 6, 3);
    Skills skillProfile3 = new Skills("skillProfile3",5, 1, 7, 3, 8);
    Skills skillProfile4 = new Skills("skillProfile4",1, 4, 5, 6, 2);
    Skills finalSkillProfile = skillProfile1;

    // creates empty player and team objects
    Players p1;
    Players p2;
    Players p3;
    Players p4;
    Teams team1;
    Teams team2;

    // static variable to track amount of players made
    public static int numPlayers = 0;
    // static  variable to track amount of time players have been training
    public static int numTrain = 0;
    // variable for skill if/else statement
    int curSkill = 0;

    // create global variables for gui text input, radio buttons, and regular buttons
    JTextField nameInput;
    JTextField HeightInput;
    JTextField WeightInput;
    JRadioButton skillProfile1Button;
    JRadioButton skillProfile2Button;
    JRadioButton skillProfile3Button;
    JRadioButton skillProfile4Button;
    JButton submitButton;
    JButton matchButton;
    JButton trainButton;

    // constructor for gui
    MyFrame() {
        // sets up base of gui
        this.setTitle("Basketball Tester");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450, 260);
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(0x3679ad));

        // create panels to add into gui
        JPanel panel0 = new JPanel();
        panel0.setBackground(new Color(0x3679ad));
        panel0.setBounds(0, 0, 450, 35);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0x3679ad));
        panel1.setBounds(0, 35, 450, 25);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0x3679ad));
        panel2.setBounds(0, 60, 450, 25);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0x3679ad));
        panel3.setBounds(0, 85, 450, 50);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(0x3679ad));
        panel4.setBounds(0, 120, 450, 50);



        // create text labels to add into gui
        JLabel title = new JLabel("Player Creation");
        title.setFont(new Font("Rockwell", Font.BOLD, 25));

        JLabel playerTitle = new JLabel("Player Name");
        playerTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));
        playerTitle.setHorizontalAlignment(JLabel.LEFT);

        JLabel heightTitle = new JLabel("Height:   ");
        heightTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));

        JLabel weightTitle = new JLabel("Weight:   ");
        weightTitle.setFont(new Font("Rockwell", Font.PLAIN, 15));
        weightTitle.setBounds(0, 95, 200, 25);



        // create text input, radio buttons, and regular buttons to add to GUI
        nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(250, 20));
        nameInput.setFont(new Font("Rockwell", Font.PLAIN, 15));
        nameInput.setForeground(Color.BLACK);
        nameInput.setCaretColor(Color.BLACK);

        HeightInput = new JTextField();
        HeightInput.setPreferredSize(new Dimension(250, 20));
        HeightInput.setFont(new Font("Rockwell", Font.PLAIN, 15));
        HeightInput.setForeground(Color.BLACK);
        HeightInput.setCaretColor(Color.BLACK);
        HeightInput.setHorizontalAlignment(JTextField.LEFT);

        WeightInput = new JTextField();
        WeightInput.setPreferredSize(new Dimension(250, 20));
        WeightInput.setFont(new Font("Rockwell", Font.PLAIN, 15));

        WeightInput.setForeground(Color.BLACK);
        WeightInput.setCaretColor(Color.BLACK);
        WeightInput.setHorizontalAlignment(JTextField.LEFT);

        submitButton = new JButton();
        submitButton.setBounds(350, 175, 75, 35);
        submitButton.addActionListener(this);
        submitButton.setText("Submit");

        matchButton = new JButton();
        matchButton.setBounds(265, 175, 75, 35);
        matchButton.addActionListener(this);
        matchButton.setText("Match");

        trainButton = new JButton();
        trainButton.setBounds(180, 175, 75, 35);
        trainButton.addActionListener(this);
        trainButton.setText("Train");

        skillProfile1Button = new JRadioButton("skillProfile1");
        skillProfile2Button = new JRadioButton("skillProfile2");
        skillProfile3Button = new JRadioButton("skillProfile3");
        skillProfile4Button = new JRadioButton("skillProfile4");
        ButtonGroup group = new ButtonGroup();
        group.add(skillProfile1Button);
        group.add(skillProfile2Button);
        group.add(skillProfile3Button);
        group.add(skillProfile4Button);
        skillProfile1Button.addActionListener(this);
        skillProfile2Button.addActionListener(this);
        skillProfile3Button.addActionListener(this);
        skillProfile4Button.addActionListener(this);


        // adds all objects created to gui
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
        this.add(trainButton);
        this.setVisible(true);
        System.out.println(skillProfile1);
        System.out.println(skillProfile2);
        System.out.println(skillProfile3);
        System.out.println(skillProfile4);

    }

    /**
     * This method listens if there is any button clicked and sends the button info as e
     * There will be an if statement to execute and action if the button is clicked
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // if statement for train button
        // if button is pressed then it trains player depending on how many players have been trained
        if (e.getSource() == trainButton) {
            if (numTrain == 0) {
                String output = Basketball_Tester.training(p1);
                JOptionPane.showMessageDialog(null, output, "Updated Stats",
                        JOptionPane.INFORMATION_MESSAGE);
                numTrain++;
            } else if (numTrain == 1) {
                String output = Basketball_Tester.training(p2);
                JOptionPane.showMessageDialog(null, output, "Updated Stats",
                        JOptionPane.INFORMATION_MESSAGE);
                numTrain++;
            } else if (numTrain == 2) {
                String output = Basketball_Tester.training(p3);
                JOptionPane.showMessageDialog(null, output, "Updated Stats",
                        JOptionPane.INFORMATION_MESSAGE);
                numTrain++;
            } else if (numTrain == 3) {
                String output = Basketball_Tester.training(p4);
                JOptionPane.showMessageDialog(null, output, "Updated Stats",
                        JOptionPane.INFORMATION_MESSAGE);
                numTrain++;
            } else {
                numTrain = 0;
                JOptionPane.showMessageDialog(null, "All Players have been trained", "Update",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // if/else statement for setting current skill profile
        if (e.getSource() == skillProfile1Button) {
            curSkill = 1;
        }
        if (e.getSource() == skillProfile2Button) {
            curSkill = 2;
        }
        if (e.getSource() == skillProfile3Button) {
            curSkill = 3;
        }
        if (e.getSource() == skillProfile4Button) {
            curSkill = 4;
        }

        // if/else statement creates new player if button pressed
        // if no info present then display error message
        if (e.getSource() == submitButton) {
            if (nameInput.getText().equals("") || HeightInput.getText().equals("") ||
                    WeightInput.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Info", "Error",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                if (curSkill == 1) {
                    finalSkillProfile = skillProfile1;
                } else if (curSkill == 2) {
                    finalSkillProfile = skillProfile2;
                } else if (curSkill == 3) {
                    finalSkillProfile = skillProfile3;
                } else {
                    finalSkillProfile = skillProfile4;
                }


                // creates a new player depending on how players have already been made
                // uses input from the text fields to set instance variables
                // if four player made then a warning message pops up to tell too many players made
                if (numPlayers == 0) {
                    p1 = new Players(nameInput.getText(), HeightInput.getText(),
                            Integer.parseInt(WeightInput.getText()), finalSkillProfile);
                    numPlayers++;
                    System.out.println(p1);
                } else if (numPlayers == 1) {
                    p2 = new Players(nameInput.getText(), HeightInput.getText(),
                            Integer.parseInt(WeightInput.getText()), finalSkillProfile);
                    numPlayers++;
                    System.out.println(p2);
                } else if (numPlayers == 2) {
                    p3 = new Players(nameInput.getText(), HeightInput.getText(),
                            Integer.parseInt(WeightInput.getText()), finalSkillProfile);
                    numPlayers++;
                    System.out.println(p3);
                } else if (numPlayers == 3) {
                    p4 = new Players(nameInput.getText(), HeightInput.getText(),
                            Integer.parseInt(WeightInput.getText()), finalSkillProfile);
                    numPlayers++;
                    System.out.println(p4);
                    ;
                } else {
                    JOptionPane.showMessageDialog(null, "Too Many Players Created", "Error",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        // if match button pressed then two teams a created
        // the match method is ran using the two teams
        if (e.getSource() == matchButton) {
            team1 = new Teams("Lakers", p1, p2);
            team2 = new Teams("Bulls", p3, p4);
            String output = Basketball_Tester.match(team1, team2);
            JOptionPane.showMessageDialog(null, output, "Winner!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}




