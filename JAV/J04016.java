import java.util.*;

public class jav{
    static Scanner sc=new Scanner(System.in);

    public static class Matrix{
        int row,col;
        int[][] a;


        public Matrix(int n,int m){
            row=n;
            col=m;
            a=new int[n+1][m+1];
        }

        public void nextMatrix(Scanner sc){
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    a[i][j]=sc.nextInt();
                }
            }
        }

        public Matrix mul(Matrix B){
            Matrix m=new Matrix(this.row,B.col);
            for(int i=1;i<=m.row;i++){
                for(int j=1;j<=m.col;j++){
                    m.a[i][j]=0;
                    for(int k=1;k<=this.col;k++){
                        m.a[i][j]+=this.a[i][k]*B.a[k][j];
                    }
                }
            }
            return m;
        }

        public String toString(){
            String m="";
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    m+=this.a[i][j]+" ";
                }
                m+="\n";
            }
            return m;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
