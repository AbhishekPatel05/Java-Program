import java.util.Scanner;

public class For {
    public static void main (String args[]){
      Scanner in = new Scanner(System.in);

    //    for (int i = 0; i < 10; i = i + 1){
     //       System.out.println("Abhishek");
      //  }
      for (int i = 0; i <= 10; i++){
        System.out.println(i);
      }
 System.out.println("   ");
      int num = in.nextInt();
      for(int a = 1; a <= num; a++){
        System.out.println(a);
      }
      in.close();
    }
    
}
