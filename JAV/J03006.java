import java.util.*;

public class J03006{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n=sc.nextLine().trim();
            boolean bo=true;
            for(int i=0;i<n.length()/2;i++){
                if((n.charAt(i)-'0')%2!=0||(n.charAt(i)!=n.charAt(n.length()-i-1))){
                    bo=false;
                    break;
                }
            }
            System.out.println(bo?"YES":"NO");
        }
    }
}
