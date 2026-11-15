import java.util.*;

public class J02103{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n+1][m+1];
            int[][] b=new int[n+1][n+1];

            for(int r=1;r<=n;r++){
                for(int c=1;c<=m;c++){
                    a[r][c]=sc.nextInt();
                }
            }
            System.out.println("Test "+i+":");

            for(int r=1;r<=n;r++){
                for(int c=1;c<=n;c++){
                    if(b[c][r]!=0) b[r][c]=b[c][r];
                    else{
                        for(int j=1;j<=m;j++){
                            b[r][c]+=a[r][j]*a[c][j];
                        }
                    }
                    System.out.printf("%d ",b[r][c]);
                }
                System.out.println();
            }

        }
    }
}



//2 2       2 1 3 5
//1 1       2 1 4 6
//3 4
//5 6

//
//
//
//
