/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */
import javax.swing.JTextArea;
import javax.swing.*;
import java.io.IOException;
import java.io.FileReader;

public class DisplayPanel extends JPanel {
        private JTextArea textarea;
        
        public DisplayPanel(){
            textarea = new JTextArea(30, 20);
            add(textarea);
            textarea.setEditable(false);

            try{
            FileReader reader = new FileReader("savedpass.txt");
            textarea.read(reader, "savedpass.txt"); 
            }catch(IOException ioe){
                System.err.println(ioe);
            }       
        }
}
