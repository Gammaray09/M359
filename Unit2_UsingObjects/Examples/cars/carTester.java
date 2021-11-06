package Unit2_UsingObjects.Examples.cars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class carTester extends JFrame implements ActionListener {
    JButton button;
    JTextField yearInput;
    JTextField carInput;

    carTester(){
        this.setTitle("Basketball Tester");
        this.setForeground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        button = new JButton("Submit");
        button.addActionListener(this);

        carInput = new JTextField();
        carInput.setPreferredSize(new Dimension(250,40));
        carInput.setFont(new Font("Consolas", Font.BOLD,35));
        carInput.setForeground(new Color(0xA9E9F6));
        carInput.setCaretColor(Color.BLACK);

        yearInput = new JTextField();
        yearInput.setPreferredSize(new Dimension(250,40));
        yearInput.setFont(new Font("Consolas", Font.BOLD,35));
        yearInput.setForeground(new Color(0xA9E9F6));
        yearInput.setCaretColor(Color.BLACK);

        this.add(carInput);
        this.add(yearInput);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String car = "";
        String year = "";

        if(e.getSource() == button){
            car = carInput.getText();
            year = yearInput.getText();
        }
        Car car1 = new Car(car, Integer.parseInt(year));
        car1.printInfo();
    }

    public static void main(String[] args) {
        carTester frame = new carTester();
        frame.setSize(420,420);
    }

}







/*
Scanner input = new Scanner(System.in);

        //prompt user for car name
        System.out.println("Enter Car Name:");
        String carName = input.nextLine();

        System.out.println("Enter Model Year Name:");
        int modelYear = input.nextInt();

        // create a car 2018 Honda Accord
        Car car1 = new Car(carName, modelYear);
        car1.printInfo();

 */