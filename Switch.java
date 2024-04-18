import java.util.* ;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int button = sc . nextInt();
        String fruit = sc.next();

        switch (button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bongour");
            break;
            default : System.out.println("Invalid Button");

        }

        switch (fruit){
            case "Apple"-> System.out.println("Red sweet fruit");
            case "Mango"-> System.out.println("Fruit king");
            case "Grapes"-> System.out.println("small fruit");

                    
        }
        sc.close();
    }   
}
