package Unit5_WritingClasses.examples.basketball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Basketball_Tester {
    public static void main(String[] args) {

        MyFrame GUI = new MyFrame();
        ImageIcon icon = new ImageIcon("logo.png");
        GUI.setIconImage(icon.getImage());


        Skills skillProfile1 = new Skills(3,4,5,6,0);
        Skills skillProfile2 = new Skills(4,3,7,5,4);
        Skills skillProfile3 = new Skills(5,1,7,3,8);
        Skills skillProfile4 = new Skills(1,4,5,6,2);


        Players p1 = new Players("Stephen Curry", "6'3", 190, skillProfile1);
        Players p2 = new Players("Lebron James", "6'9", 250, skillProfile2);
        Players p3 = new Players("Kyrie Irving", "6'1", 200, skillProfile3);
        Players p4 = new Players("Joel Embiid", "7'0", 270, skillProfile4);
        Players p5 = new Players("Russell Westbrook", "7'0", 270, skillProfile1);
        Players p6 = new Players("Trae Young", "7'0", 270, skillProfile2);
        Players p7 = new Players("James Harden", "7'0", 270, skillProfile3);
        Players p8 = new Players("Zach Lavine", "7'0", 270, skillProfile4);


        Teams team1 = new Teams("Lakers", p1 ,p2 ,p3 ,p4);
        Teams team2 = new Teams("Bulls", p5,p6,p7, p8);



        //createObjects();
        //System.out.println(team1);
        training(p6);
        match(team1, team2);

    }

    public static void createObjects(){
        Skills skillProfile1 = new Skills(3,4,5,6,0);
        Skills skillProfile2 = new Skills(4,3,7,5,4);
        Skills skillProfile3 = new Skills(5,1,7,3,8);
        Skills skillProfile4 = new Skills(1,4,5,6,2);

        Players p1 = new Players("Stephen Curry", "6'3", 190, skillProfile1);
        Players p2 = new Players("Lebron James", "6'9", 250, skillProfile2);
        Players p3 = new Players("Kyrie Irving", "6'1", 200, skillProfile3);
        Players p4 = new Players("Joel Embiid", "7'0", 270, skillProfile4);
        Players p5 = new Players("Russell Westbrook", "7'0", 270, skillProfile1);
        Players p6 = new Players("Trae Young", "7'0", 270, skillProfile2);
        Players p7 = new Players("James Harden", "7'0", 270, skillProfile3);
        Players p8 = new Players("Zach Lavine", "7'0", 270, skillProfile4);

        Teams team1 = new Teams("Lakers", p1 ,p2 ,p3 ,p4);
        Teams team2 = new Teams("Bulls", p5,p6,p7, p8);
    }

    /**
     *
     * @param p1
     */
    public static void training(Players p1) {
        String result;
        int coin = (int) (Math.random() * 2 + 1);
        if (coin == 1) {
            int rand = (int) (Math.random() * 9) + 1;
            p1.getSkillProfile().setShooting(p1.getSkillProfile().getShooting() + rand);
            p1.getSkillProfile().setBlocking(p1.getSkillProfile().getBlocking() + rand);
            p1.getSkillProfile().setDribbling(p1.getSkillProfile().getDribbling() + rand);
            p1.getSkillProfile().setRebounding(p1.getSkillProfile().getRebounding() + rand);
            p1.getSkillProfile().setStealing(p1.getSkillProfile().getStealing() + rand);

            result = "Success! " + p1.getName() + " stats have increased by " + rand;
        } else {
            p1.getSkillProfile().setShooting(p1.getSkillProfile().getShooting() - 1);
            p1.getSkillProfile().setBlocking(p1.getSkillProfile().getBlocking() - 1);
            p1.getSkillProfile().setDribbling(p1.getSkillProfile().getDribbling() - 1);
            p1.getSkillProfile().setRebounding(p1.getSkillProfile().getRebounding() - 1);
            p1.getSkillProfile().setStealing(p1.getSkillProfile().getStealing() - 1);

            result = "Fail " + p1.getName() + " stats have decreased by 1";
        }
        System.out.println(result);
    }

    public static void match(Teams team1, Teams team2){
        String winner = "";
        if(team1.getTotalTeamSkills() > team2.getTotalTeamSkills()){
            winner = "The winner of the match is the " + team1.getTeamName();
        } else {
            winner = "The winner of the match is the " + team2.getTeamName();
        }
        System.out.println(winner);
    }


}

