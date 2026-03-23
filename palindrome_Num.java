import java.util.*;
public class palindrome_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;
        int cal = 0;
        int[] arr = new int[100];
        Boolean palindrome = true;
        while(num!=0)
        {
            arr[cal] = num%10;
            num = num/10;
            cal++;
        }
        for(int i = 0 ; i < cal ; i++)
        {
            if(arr[i] != arr[cal-i-1])  // cal varies from 0 to n (not n-1).
            {
                palindrome = false;
            }
        }
        if(palindrome==true)
        {
            System.out.println(n+" is a palindrome number.");
        }
        else
        {
            System.out.println(n+" is not a palindrome");
        }
        sc.close();
    }
}
