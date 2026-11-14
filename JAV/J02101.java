import java.util.*;

public class J02101{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] a=new int[n+1][n+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    a[i][j]=sc.nextInt();
                }
            }

            for(int i=1;i<=n;i++){
                int st=1,end=n;
                if(i%2==1){
                    for(int j=st;j<=end;j++){
                        System.out.printf("%d ",a[i][j] );
                    }
                }
                else {
                    for(int j=end;j>=st;j--){
                        System.out.printf("%d ",a[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
