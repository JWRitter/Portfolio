/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 02/23/2021
 *IDE Used: NetBeans 8.2
 */
import javax.swing.*;
import java.awt.*;
public class infoPanel extends JPanel{
    public infoPanel(){
        
        JLabel information = new JLabel ("<html>Try adding numbers, letters, <br>and symbols for better security.</html>");
        
        add(information);
    }
}
