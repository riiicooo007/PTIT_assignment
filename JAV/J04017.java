import java.util.*;

public class J04017{

    public static class Matrix{
        int n,m;
        int[][] M;

        public Matrix(int a,int b) {
            n = a;
            m = b;
            M=new int[a+1][b+1];
        }

        public void nextMatrix(Scanner sc){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    M[i][j]=sc.nextInt();
                }
            }
        }

        public Matrix trans(){
            Matrix a=new Matrix(m,n);
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    a.M[i][j]=this.M[j][i];
                }
            }
            return a;
        }

        public Matrix mul(Matrix b){
            Matrix c=new Matrix(n,b.m);
            for(int i=1;i<=n;i++){
                for(int j=1;j<=b.m;j++){
                    if(c.M[j][i]!=0) c.M[i][j]=c.M[j][i];
                    else{
                        for(int k=1;k<=m;k++){
                            c.M[i][j]+=M[i][k]*b.M[k][j];
                        }
                    }
                }
            }
            return c;
        }

        public String toString(){
            String s="";
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    s+=M[i][j]+" ";
                }
                s+="\n";
            }
            return s;
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
