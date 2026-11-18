

import java.util.*;

public class J01020{
    static int[] a=new int[10];

    public static void them(long n) {
        while(n>0){
            a[(int)(n%10)]=1;
            n/=10;
        }
    }

    public static boolean check(){
        for(int i=0;i<=9;i++){
            if(a[i]==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println("Impossible");
                continue;
            }

            int heso=0,k=0;
            for(int j=0;j<=9;j++) a[j]=0;

            while(n<1e18){
                heso++;
                k=n*heso;
                them(k);
                if(check()) {
                    n=0;
                    break;
                }
            }
            if(n==0) System.out.println(k);
            else System.out.println("Impossible");
        }
    }
}
