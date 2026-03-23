public class LCM {
    public static void main(String[] args) {
        int m=60,n=24,r;
        int x = m;
        int y = n;
        while(n!=0)
        {
            r = m%n;
            m = n;
            n = r;
        }
        System.out.println("GCD: "+m);
        int LCM = (x*y)/m;
        System.out.println("lCM:"+LCM);
        
    }
    
}
