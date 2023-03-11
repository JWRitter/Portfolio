/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 03/20/2021
 *IDE Used: NetBeans 8.2
 */
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.JTextField;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
import java.awt.event.ActionListener;

public class passTest extends JPanel{
    private JTextField passwordField;
    private JButton submit2;
    private JLabel headder1;
    private ButtonGroup bg;
    TitlePanel Title = new TitlePanel();
      
    public String shuffling(){ //create randoms

        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        
        String combinedChars = specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[4];
        

        password[0] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[1] = numbers.charAt(random.nextInt(numbers.length()));
        
        for(int i = 0; i< 4 ; i++){
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        } 
        char[] characters = passwordField.getText().toCharArray();        
        char[] comboChar = new char[characters.length + password.length];
        System.arraycopy(characters, 0, comboChar, 0, characters.length);
        System.arraycopy(password, 0, comboChar, characters.length, password.length);
        
        for (int i = 0; i < characters.length; i++){
            int randoIndex = (int)(Math.random()*comboChar.length);
            char temp = comboChar[i];
            comboChar[i] = comboChar[randoIndex];
            comboChar[randoIndex] = temp;
        }
        System.out.println(comboChar);
        System.out.println("checkpoint 4");
        String comboCharStr2 = String.valueOf(comboChar);
        try{
                comboCharStr2.toString();
                BufferedWriter bw = new BufferedWriter(new FileWriter("savedpass.txt", true));
                bw.write(System.getProperty( "line.separator" ));
                bw.write(comboCharStr2.toString());
                bw.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }        
       return new String(comboCharStr2);
    }
    public passTest(){
        passwordField = new JTextField("                         ");
        submit2 = new JButton("Submit");
        headder1 = new JLabel("Enter a Password");
        bg= new ButtonGroup();
        bg.add(submit2);
        
        setBorder(BorderFactory.createTitledBorder("Password Test"));
        add(headder1);
        add(passwordField);
        add(submit2);
        
        submit2.addActionListener(e1->{         
            int I = 0;
            while (I < 3){
                shuffling();
                I++;
            }           

            try{
                stringCompare(passwordField.getText());
                BufferedWriter bw = new BufferedWriter(new FileWriter("savedpass.txt", true));
                bw.write(System.getProperty( "line.separator" ));
                bw.write(passwordField.getText());
                bw.close();
                new SecondWindow();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        });         
    }
    public void setS(){
        String s = passwordField.getText();
    }
    public void stringCompare(String s){
        
        char[] ch = s.toCharArray();
        int letter = 0;
        int num = 0;
        int other = 0;
        int playerPoints = Title.getPlayPoints();
        int hackerPoints = Title.getHackPoints();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(ch[i])){
                    letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                    num ++ ;
            }
            else{
                    other ++;
            }
        }
        if (letter > 0 && num > 0 && other > 0){
            playerPoints ++;
            Title.setPlayPoints(playerPoints);
        }
        else if(letter == 0 || num == 0 || other == 0){
            hackerPoints++;
            Title.setHackPoints(hackerPoints);
        }
        //These are used for console based confirmation
        System.out.println("letter: " + letter);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
        System.out.println("player points: " + Title.getPlayPoints());
        System.out.println("Hacker Points: " + Title.getHackPoints());
    }
}