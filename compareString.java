import java.util.*;
public class compareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:"); 
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        char[] charArray1 = new char[str1.length()];   //initialize the character array.
        char[] charArray2 = new char[str2.length()];
        int i,flag = 1;         
        int m = str1.length();  // calculate string length
        int n = str2.length();
        for( i = 0 ; i < m; i++ )
        {
            charArray1[i] = str1.charAt(i);     //convert str1 into a array of characters.
        }
        for(i = 0 ; i < n; i++ )
        {
            charArray2[i] = str2.charAt(i);     //convert str2 into a array of characters.
        }
        if(m!=n)   // check if length of strings are equal. 
        {
           flag = 0;    
        }
        i = 0;
        while(m==n && i<m ) // enter the loop only if lenght both strings are equal.
        { 
            if(charArray1[i]!=charArray2[i])  // compare each characters
            {
                  flag = 0;
                  break;
            }
            i++;
        }
        if(flag == 1)
        {
            System.out.println("Strings are equal.");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        sc.close();;
    }
}
