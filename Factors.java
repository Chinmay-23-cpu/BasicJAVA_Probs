import java.util.*;
public class Factors {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       int num = sc.nextInt();
       System.out.println("The Factors of "+num+" are:");
       for(int i = 1 ; i <= num ; i++ )
        {
            if(num%i==0)
            {
                if(i!=num)
                System.out.print(i+",");
                else
                System.out.print(i+".");
            }
        } 
        sc.close();
    }
}
