import java.util.*;
public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         if (a==b){
            System.out.println("equal");
         }else if (a > b){
            System.out.println("a is greater than b");
         }else {
            System.out.println("b is greater than a");

         }

         int sal = 20000;
         if(sal >= 20000){
            System.out.println(sal + 2000);
         }else{
            System.out.println(sal + 1000);

         }

        sc.close();
    }
}
