import java.util.Scanner;

public class Funtion {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter num 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.print(sum);
        in.close();
    }
    
    
    
}
