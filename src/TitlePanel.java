/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.*;
public class TitlePanel extends JPanel
{   
    private JTextField player;
    private JTextField hacker;
    private int playpoints;
    private int hackpoints;
    private JLabel LPlayer;
    private JLabel Lhack;
    
    public int getPlayPoints(){
        return playpoints;
    }
    public void setPlayPoints(int pPoints){
        playpoints = pPoints;
    }
    public int getHackPoints(){
        return hackpoints;
    }
    public void setHackPoints(int hPoints){
        hackpoints = hPoints;
    }
    
    public TitlePanel(){ //builds the North panel
        //creation of the scoreboard
        JLabel greeting = new JLabel("                               ");
        JLabel LPlayer = new JLabel("Player: ");
        JLabel Lhack = new JLabel("Hacker: ");
        
        player = new JTextField();
        player.setText("" + playpoints);
        player.setEditable(false);
        
        hacker = new JTextField();
        hacker.setText("" + hackpoints);
        hacker.setEditable(false);
                
        add(LPlayer);
        add(player);
        add(greeting);
        add(Lhack);
        add(hacker);

        
        
    }
    
//    --Score Updaters--
    public void PlayerScore(){
        playpoints++;
        player.setText("" + playpoints);
    }
    public void HackerScore(){
        hackpoints++;
        hacker.setText("" + hackpoints);
    }

//  --------Label modification only causes errors---- 3-2-21
//    public void PlayerScore(){
//        playpoints++;
//        LPlayer.setText("Player Score: " + playpoints);
//    }
//    public void HackerScore(){
//        hackpoints++;
//        Lhack.setText("Hack Score: " + hackpoints);
//    }


}
