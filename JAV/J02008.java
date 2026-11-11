import java.util.*;

public class J02008{

    public static long gcd(long res,long i){
        while(i!=0){
            res=res%i;
            long tmp=res;
            res=i;
            i=tmp;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long res=1;
            for(int i=n;i>=2;i--){
                if(res%i!=0){
                    res=(res*i)/gcd(res,i);
                }
            }
            System.out.println(res);
        }
    }
}
