import java.util.*;

public class J03004{

    public static String Chuanhoa(String s){
        String t="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            //System.out.println(t);
            int j=i;
            while(j<s.length()&&s.charAt(j)==' '){
                j++;
            }
            i=j;

            //System.out.println(i + " "+j);
            while(j<s.length()&&s.charAt(j)!=' '){
                j++;
            }
            t+=Character.toUpperCase(s.charAt(i))+s.substring(i+1,j)+" ";
            i=j;
        }
        return t;
    }


    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine().trim();
            System.out.println(Chuanhoa(s));
        }
    }
}
