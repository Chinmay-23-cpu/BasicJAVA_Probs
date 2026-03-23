// public class Mystring {
//     public static void main(String[] args) {
//         String name1 = "chinmay bhat";  //existing string object is immutable (it is in POOL)
//         String name2 = name1.toUpperCase();  //new object is created IN HEAP.
//         System.out.println(name1 == name2);  //False, cuz 'name1' and 'name2' are refernces of two different object
//     }
    
// }

/*REGULAR EXPRESSION */
// import java.util.*;
// public class Mystring {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please Enter your gmail ID:");
        
        
//             String str = sc.nextLine();
//             if(str.matches(".*@(gmail|hotmail).com")==true)
//             {
//                 int i = str.indexOf('@');
//                 System.out.println("It matches.");
//                 System.out.println("username: "+ str.substring(0,i));
//                 System.out.println("Domain:" + str.substring(i+1, str.length()));
//             }
//             else
//             {
//                 System.out.println("back off!!");
//             }
    
        
//         sc.close();
//     }

// }


/*Excetional Case */
// public class Mystring
// {
//     public static void main(String[] args) {
//         String str1 = "hello";
//         String str2 = str1.toLowerCase();  //no alteration...returns the same value hence no new object is created (neither in heap nor in pool)
//         System.out.println(str1 == str2);  //Hence both the refernce point to same object (object in pool)
//     }
// }

/*Here Object is not created inside string pool */
// public class Mystring
// {
//     public static void main(String[] args) {
//         String name1 = new String("Chinmay");
//         String name2 = new String("Chinmay");
//         System.out.println(name1==name2);
//     }
// }

/*REVISIT THIS AFTER COMPLETING OOPS */
// import java.util.*;
// public class Mystring
// {
//     public static void main(String[] args) {
//         // System.out.println("Chinmay"+ new ArrayList<>());
//         // System.out.println("Chinmay"+ new int[]{2,3,4,5});
//         System.out.println(new int[]{2,3,4,4,4,4});
//         System.out.println(new ArrayList<>());
//     }
// }

/*STRING BUILDERS IN JAVA */
//(WITHOUT STRING BUILDERS)
// public class Mystring
// {
//   public static void main(String[] args) {
//     String words = "";
//     for(int i = 0 ; i < 26 ; i++)
//     {
//         words = words + (char)('a' + i);  //For every iteration a new object is created .
//     }
//     System.out.println(words);
//   }
// }

//(WITH STRING BUILDERS)
//WHY TO USE STRINGBUILDERS?//
// public class Mystring {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0 ; i < 26 ; i++)
//         {
//             sb.append((char)('a'+ i));   // in each iteration the changes are made in the same object only, no new object is created.
//         }
//         System.out.println(sb); 
//     }
// }


// public class Mystring {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         System.out.println("Enter the String");
//         String Original = sb.toString();
//         StringBuilder bs = sb.reverse();
//         String Reversed = bs.toString();

//         if(Reversed.equals(Original))
//         {
//             System.out.println("It is Palindrome");
//         }
//         else
//         {
//             System.out.println("It is not a palindrome");
//         }

//     }
// }

// public class Mystring
// {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("BIET");
//         sb.reverse().append("123");
//         System.out.println(sb);

//     }
// }

// import java.util.Arrays;

// public class Mystring {

//     public static void main(String[] args) {
//         String s = "Chinmay";
//         char[] str = s.toCharArray();
//         System.out.println(str);
//         System.out.println(Arrays.toString(str));
//     }
// }