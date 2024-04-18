import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(num);

        // Calculate the second largest
        int secondLargest = num[num.length - 2];

        System.out.println("The second largest number is " + secondLargest);

        sc.close();
    }
}


