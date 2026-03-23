public class NumToDigits {
    public static void  main(String[] args)
    {
        int n = 123;
        int num = n;
        int[] arr = new int[100];
        int cal = 0;
        while(n!=0)
        {
            arr[cal] = n%10;
            n = n/10;
            cal++;
        }

        for(int i = cal-1; i>=0; i--)
        {
           if(i > 0)
           {
           System.out.print(arr[i]+",");
           }
           else
           {
            System.out.print(arr[i]);
           }
        }
        System.out.println();
        System.out.println("the value of 'n':"+n);
        System.out.println("the value of 'num':"+num);
    }
}
