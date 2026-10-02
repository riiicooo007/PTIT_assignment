import java.util.*;

public class J01014{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long uoc=0;
            long N=sc.nextLong();
            for(long i=2;i*i<=N;i++){
                while(N%i==0){
                    N/=i;
                    uoc=i;
                    //System.out.println(i);
                }
                
            }
            if(N>uoc) uoc=N;
            System.out.println(uoc);
        }
    }
}
