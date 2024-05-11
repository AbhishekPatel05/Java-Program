
public class StringMethod {
    public static void main(String[] args) {
      
//----------isEmpty Method            
    
String myStr3 = "Hello";
String myStr4 = "";
System.out.println(myStr3.isEmpty());
System.out.println(myStr4.isEmpty());


//---------getchars Method

char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
System.out.println(myArray);

String myStr = "Hello, World!";
myStr.getChars(0, 5, myArray, 2);
System.out.println(myArray);



char[] A = {'0', '1', '2', '3', '4', '5', '6', '7' };
System.out.println(A);

String S = "Abhishek";
S.getChars(0, 4 , A, 2);
System.out.println(A);


//-------charAt-------

String a = "Abhishek";
System.out.println(a.charAt(4));



}
}

  