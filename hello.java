import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name  ");
        String name = input.next(); 
        
        System.out.println("hello " + name );
        input.close();
        
    }
    
}