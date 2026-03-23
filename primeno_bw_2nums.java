public class primeno_bw_2nums {
    public static void main(String[] args)
    {
        int First_num = 30;
        int Second_num = 100;
        boolean HavePrimes;
        System.out.println("Printing all the prime numbers between"+ First_num+" and"+Second_num+":\n");
        for(int i = First_num ; i<=Second_num ; i++)
        {
            HavePrimes = true;
            for(int j = 2; j<=Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    HavePrimes = false;
                    break;
                }
            }
            if(HavePrimes == true)
            {
                System.out.println(i);
            }
        }
    }
}
