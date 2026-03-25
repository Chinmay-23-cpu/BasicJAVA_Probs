public class countingBinary
{
    public static void main(String[] args) {
        int n = 13; // binary form of 13 is 1101. 
        int num = n;
        int count = 0;
        while(n>0)
        {
            n = n/2;
            count++;
        }
        System.out.println("Total number of digits in binary form of "+num+" is:"+ count);
    }
}