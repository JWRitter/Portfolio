/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 02/23/2021
 *IDE Used: NetBeans 8.2
 */
import javax.swing.*;
import javax.swing.JTextField;

public class passTest extends JPanel{
    private JTextField passwordField;
    private JButton submit2;
    private JLabel headder1;
    
    private ButtonGroup bg;
    
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
    }
    public static void stringCompare(String x){
        
        String s = "asDA123%@z!scv ";
        
        char[] ch = s.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        int playerPoints = 0;
        int hackerPoints = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(ch[i])){
                    letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                    num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                    space ++ ;
            }
            else{
                    other ++;
            }
        }
        if (letter > 0 && space > 0 && num > 0 && other > 0){
            playerPoints ++;
        }
        else if(letter == 0 || space == 0 || num == 0 || other == 0){
            hackerPoints++;
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
        System.out.println("player points" + playerPoints);
        System.out.println("Hacker Points" + hackerPoints);
    }
}