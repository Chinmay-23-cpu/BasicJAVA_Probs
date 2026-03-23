//CHECK WHETHER THE NUMBER IS PRIME OR NOT

/*import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int flag = 1;
        if(a==0 || a==1)
            {
                System.out.println(a+" is not a prime number.");
                flag = 0;
            }
        else
        {
        for(int i = 2 ; i <= Math.sqrt(a) ; i++)
        {   
            if(a%i==0)
            {
                flag = 0;
                System.out.println(a+" is not a prime number.\n");
                break;
            }
        }
        } 
        if(flag == 1)
        {
           System.out.println(a+" is a prime number.\n");
        }
        
    }
}*/

// PRINT ALL THE PRIME NUMBERS
public class primeno
{
   public static void main(String[] args)
   {
    int a = 25;
    int flag ;
    System.out.println(2);
    for (int i = 3 ; i<a ; i++)
    {
        flag = 1;
        for(int j = 2 ; j<i ; j++)
        {
            if (i%j==0 )
            {
               flag = 0;
               break;
            }
            
        }
        if(flag == 1)
        {
            System.out.println(i);
        }
           
    }
   }
}