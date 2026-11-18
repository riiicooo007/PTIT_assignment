import java.util.*;

public class J01018{
    
    public static boolean check(long a){
        long truoc,tong=0;

        while(a/10>0){

            truoc=a%10;
            tong+=truoc;
            a/=10;
            //System.out.println(a);
            if(Math.abs(truoc-a%10)!=2){
                return false;
            }
        }
        tong+=a;
        return (tong%10==0);

    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a;
        
        while(t-->0){
            a=sc.nextLong();
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
