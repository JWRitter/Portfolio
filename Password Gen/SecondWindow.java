/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */
import java.awt.*;
import javax.swing.*;

public class SecondWindow extends JFrame{
   
    private DisplayPanel Display;
    
    public SecondWindow(){
        super("Previous Passwords");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setLayout(new BorderLayout());
        Display = new DisplayPanel();
        
        add(Display, BorderLayout.CENTER);
        
        pack();
        setVisible(true);
    }
}