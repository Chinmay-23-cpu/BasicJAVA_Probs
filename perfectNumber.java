/*PERFECT NUMBER: A perfect number is a positive integer that equals the sum of its proper divisors (all its factors excluding the number itself). */

/*Method 1(Noob): storing the factors in an array and then adding it */
// import java.util.*;
// public class perfectNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();
//         int[] arr = new int[100];
//         int k = 0,count=0;
//         int sum = 0;
//         for(int i = 1 ; i <= num ; i++ )
//         {
//             if(num%i==0)
//             {
//                 arr[k] = i;
//                 k++;
//                 count++;
//             }
//         } 
    
//         for(k = 0; k<count-1 ; k++)
//         {
//            sum += arr[k];
//         }
//         if(sum == num)
//         {
//             System.out.println("It is a perfect number.");
//         }
//         else
//         {
//             System.out.println("It is not a perfect number.");
//         }

//     }
// }


/*Method 2(pro):adding simultaneously while finding the factors */
import java.util.*;
public class perfectNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i < num ; i++ )
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println(num+" is a perfect number.");
        }
        else
        {
            System.out.println(num+" is not a perfect number.");
        }
    }
}

