import java.util.*;
 public class Vowel { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int vowels = 0;
        str = str.toLowerCase();
                    for(int i=0;i <str.length();i++){
                        char ch = str.charAt(i);
                               
                        // Check if the character is a vowel
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                            System.out.println(" The String contains " + ch);
                           vowels++; 
                        }    
                    }System.out.println(vowels++);
                    in.close();
                }
                }




    //input by user

     class Main {
     public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        String str = line.nextLine();
        int vowels = 0, consonants = 0 ;
    
    // Convert the string to lowercase for consistent checks
        str = str.toLowerCase();
                
                        for (int i = 0; i < str.length(); i++) {
                            char ch = str.charAt(i);
                
                            // Check if the character is a vowel
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            }
                            // Check if the character is a consonant
                            else if (ch >= 'a' && ch <= 'z') {
                                consonants++;
                            }
                           
                        }
                
                        System.out.println("Vowels: " + vowels);
                        System.out.println("Consonants: " + consonants);
                       
                        line.close();
                    }
                }



               