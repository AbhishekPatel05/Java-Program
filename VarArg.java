import java.util.*;

public class VarArg {
    public static void main(String[] args) {
        fun( 2, 3, 4, 5, 6);
    }
    static void fun (int ...v){

        System.out.println(Arrays.toString(v));
    }
}
