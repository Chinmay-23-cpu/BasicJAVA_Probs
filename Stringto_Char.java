import java.util.*;
public class Stringto_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char[] charArray = new char[str.length()]; 
        for(int i = 0; i<str.length(); i++)
        {
            charArray[i] = str.charAt(i);  //string is converted to a character array.
        } 
        System.out.println("The string as array of characters:");
        System.out.print(Arrays.toString(charArray)); //this method is only applicable of arrays. 
        sc.close();
    }
}
