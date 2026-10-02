import java.util.*;

public class J02004{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            long[] A=new long[n];
            int m=n/2;
            boolean have=false;
            for(int i=1;i<=n;i++) A[i-1]=sc.nextLong();
            for(int i=1;i<=m;i++){
                if(A[i-1]!=A[n-i]){
                    System.out.println("NO");
                    have=true;
                    break;
                }
            }
            if(!have) System.out.println("YES");
        }
        
    }
}
