/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */

import java.lang.*;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.*;

public class GUI extends JFrame{
    private TitlePanel Title;   //Title Panel
    private QuizPanel Quiz;     //Quiz Panel
    private passTest pTest; //passTest Panel
    private infoPanel Info; //info Panel

    public GUI(){
        super("Password Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        Title = new TitlePanel();
        Quiz = new QuizPanel();
        pTest = new passTest();
        Info = new infoPanel();
               
        add(Title, BorderLayout.NORTH);
        add(pTest, BorderLayout.CENTER);
        add(Quiz, BorderLayout.SOUTH); 
        add(Info, BorderLayout.EAST);
        
        pack();
        setVisible(true);
        
    }
    
}
