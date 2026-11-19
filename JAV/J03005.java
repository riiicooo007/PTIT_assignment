import java.util.*;

public class J03005{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine().trim();
            s=s.toLowerCase();
            String ho="";
            String ten="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    ho=s.substring(0,i).toUpperCase();
                    s=s.substring(i).trim();
                    break;
                }
            }
            for(int i=0;i<s.length();i++){
                int j=i;
                while(j<s.length()&&s.charAt(j)==' '){
                    j++;
                }
                i=j;
                while(j<s.length()&&s.charAt(j)!=' '){
                    j++;
                }
                if(ten!="")
                    ten+=" ";
                ten+=Character.toUpperCase(s.charAt(i))+s.substring(i+1,j);
                i=j;
            }

            System.out.println(ten+", "+ho);

        }
    }


}
