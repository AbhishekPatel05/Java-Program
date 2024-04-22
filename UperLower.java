
public class UperLower{
    public static void main(String[] args) {
        String str1 = "HeLLo";

        // Check if the first letter is uppercase
        if (Character.isUpperCase(str1.charAt(0))) {
            System.out.println(str1.toUpperCase()); // Convert the whole string to uppercase
        } else {
            System.out.println(str1.toLowerCase()); // Convert the whole string to lowercase
        }
    }
}




