
import java.util.Random;

/**
 *Programmer: John Ritter
 *Assignment Chapter: Final Phase 1
 *Purpose: Final
 *Date Modified: 02/23/2021
 *IDE Used: NetBeans 8.2
 */
public class PasswordMain {

    public static void main(String[] args){
//        new GUI();

//        System.out.println(generatePassword(14));  Tests generate line 1 of 1

          String s = "asDA123%@z!scv "; //Tests stringCompare   line 1 of 2
          stringCompare(s); //Tests stringCompare:              line 2 of 2
        
    }
//    private static char[] generatePassword(int length){
//        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
//        String specialCharacters = "!@#$";
//        String numbers = "1234567890";
//        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
//        Random random = new Random();
//        char[] password = new char[length];
//
//        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//        password[3] = numbers.charAt(random.nextInt(numbers.length()));
//   
//        for(int i = 4; i< length ; i++){
//            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//      }        
//        return password;
//   }
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
