// public class largestDigit {
//     public static void main(String[] args) {
//         int num = 52941;
//         int max = 0;
//         int digit;
//         while(num>0)
//         {
//             digit = num%10;
//             if(digit>max)
//             {
//                 max = digit;
//             }
//         }
//         System.out.println("The maximum digit in "+num+" is: "+max);
//     }
// }

public class largestDigit
{
    public static void main(String[] args) {
        int num = 52041;
        int number = num;
        int[] nums = new int[100];
        int cal = 0;
        while(num>0)
        {
            nums[cal] = num%10;
            num = num/10;
            cal++;
        }
        int max = nums[0];
        for(int i = 0 ; i<cal; i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
        }
        System.out.println("The maximum digit in "+number+" is: "+max);

    }
}