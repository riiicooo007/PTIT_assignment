
import java.util.*;

public class J01016{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4'||s.charAt(i)=='7') x++;
        }
        System.out.print((x==4||x==7)?"YES":"NO");
        
        
    }
}
