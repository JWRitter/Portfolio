/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import java.util.Random;

public class QuizPanel extends JPanel{
   private JRadioButton copy;      //memorize pass
   private JRadioButton written; // write down pass
   private JTextField suggestion;
   private String passwordconvert;
   private char password;
   TitlePanel Title = new TitlePanel();
   
   private ButtonGroup bg;
   
     private static char[] generatePassword(int length){
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
        for(int i = 4; i< length ; i++){
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }  
        return password;        
   }
   public QuizPanel(){
        
       
        copy = new JRadioButton("<html>Copy/Paste it to your real<br>"
                + "password box of an online account</html>");
        written = new JRadioButton("I write it down");
        suggestion = new JTextField();
        suggestion.setText("                             ");
        suggestion.setEditable(false);
        
        bg = new ButtonGroup();
        bg.add(copy);
        bg.add(written);
        
        setBorder(BorderFactory.createTitledBorder("Password Mini Quiz"));
        
        add(copy);
        add(written);
        add(suggestion);  
        
        copy.addActionListener(new RadioButtonListener());
        written.addActionListener(new RadioButtonListener());
   }   
   private class RadioButtonListener implements ActionListener{
       String passwordconvert = String.valueOf(generatePassword(12));
       @Override
       public void actionPerformed(ActionEvent e){           

           if (e.getSource() == copy){
               int pp = Title.getPlayPoints();
               suggestion.setText(passwordconvert);                  
               pp++;
               Title.setPlayPoints(pp);
               System.out.println("player points: " + Title.getPlayPoints());
               System.out.println("Hacker Points: " + Title.getHackPoints());
           }
           else if (e.getSource() == written){
               int hp = Title.getHackPoints();
               suggestion.setText(passwordconvert);
               hp++;
               Title.setHackPoints(hp);
               System.out.println("player points: " + Title.getPlayPoints());
               System.out.println("Hacker Points: " + Title.getHackPoints());
           }
       }
   }
}
