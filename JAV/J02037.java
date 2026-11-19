import java.util.*;

public class J02037{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int chan=0,le=0;
            String xau=sc.nextLine().trim();
            xau=xau+" ";
            for(int i=1;i<xau.length();i++){
                if(xau.charAt(i)==' '&&xau.charAt(i-1)!=' '){
                    int k=xau.charAt(i-1)-'0';
                    //System.out.printf("%d ",k);
                    if(k%2==0) chan++;
                    else le++;
                }
            }
            if ((chan > le && (chan + le) % 2 == 0) || (le > chan && (chan + le) % 2 == 1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }


}
