import java.util.*;

public class J01026{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        double a;
        while(t-->0){
            a=sc.nextInt();
            if(Math.sqrt(a)==Math.round(Math.sqrt(a))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
