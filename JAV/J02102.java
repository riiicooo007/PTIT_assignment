import java.util.*;

public class J02102{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        List<Integer> x=new ArrayList<>();
        int n=sc.nextInt();
        int[][] a=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
                x.add(a[i][j]);
            }
        }

        Collections.sort(x);

        int st=1;
        int end=n;

        int ind=0;
        int[][] b=new int[n+1][n+1];
        while(ind<x.size()){
            for(int i=st;i<=end;i++){
                b[st][i]=x.get(ind++);
            }
            st++;
            for(int i=st;i<=end;i++){
                b[i][end]=x.get(ind++);
            }
            end--;
            for(int i=end;i>=st-1;i--){
                b[end+1][i]=x.get(ind++);
            }

            for(int i=end;i>=st;i--){
                b[i][st-1]=x.get(ind++);
            }

        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println();
        }



    }
}
