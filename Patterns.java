public class Patterns {
    public static void main(String[] args) {
        for(int i=5; i >=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    
        System.out.println();
    
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }System.out.println();
        }
        
System.out.println();


        for(int i = 1; i<=5; i++){
            for (int j =i; j<=5; j++){
                System.out.print(i);
            } System.out.println();
        }
 
        for(int i = 5; i>=1; i--){
            for(int j = i; j<=5; j++){
                System.out.print(i);
            }System.out.println();
        }
        
        for(int i = 5; i>=1; i--){
            for(int  j = 1; j<=i; j++){
                System.out.print(i);
            }System.out.println();
        }

          
        int[] a = {1, 2, 3, 4, 5};
        int max = a[0]; // Assume the first element is the maximum

        // Iterate through the array to find the maximum
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
    }
}
}