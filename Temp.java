import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temp in C : ");

        float tempC = in.nextFloat();

        float tempf = (tempC * 9/5) + 32;
        
        System.out.println("Temp in F : " + tempf );
    
        in.close();
    }

}
