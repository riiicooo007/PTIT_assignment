import java.util.*;

public class J01013{
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt(); 
    static int[] A=new int[2000001];
    static int[] B=new int[2000001];
    public static void TimUocNhoNhat(){
        for(int i=2;i<=2000000;i++){
            if(B[i]==0){
                for(int j=i;j<=2000000;j+=i){
                    
                    if(B[j]==0) B[j]=i;
                }
            }
        }
    }
    public static void Sinh(){
        A[0]=0;
        A[1]=0;
        A[2]=2;
        A[3]=3;
        for(int i=4;i<=2*1e6;i++){
            if(B[i]==i) A[i]=i;
            else A[i]=A[B[i]]+A[i/B[i]];
        } 
    }
    public static void main(String[] args){
        JavaProject.TimUocNhoNhat();
        JavaProject.Sinh();
        long tong=0;
        for(int i=1;i<=n;i++){
            int k=sc.nextInt();
            tong+=A[k];
            //System.out.println(A[k]);
            
        }
        System.out.print(tong);
    }
}
