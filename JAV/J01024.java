
import java.util.*;

public class J01024{
    
    public static void main(String[] args)  {
//        Scanner sc=new Scanner(new FileReader("Hello.txt"));
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String s=sc.next();
            boolean have = false;
            for(char c:s.toCharArray()){
                
                if(c!='0'&&c!='1'&&c!='2'){
                    have=true;
                    break;
                }
            }
            if(have==true) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
