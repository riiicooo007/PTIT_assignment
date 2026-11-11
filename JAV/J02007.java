import java.util.*;

public class J02007{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=1;test<=t;test++){
            int n=sc.nextInt();
            Set<Integer> a=new HashSet<>();
            List<Integer> b=new ArrayList<>(100000);
            List<Integer> c=new ArrayList<>(100000);

            for(int i=1;i<100000;i++){
                b.add(0);
            }
            for(int i=1;i<=n;i++){
                int tmp=sc.nextInt();
                if(!a.contains(tmp)){
                    a.add(tmp);
                    b.set(tmp,b.get(tmp)+1);
                    c.add(tmp);
                }
                else{
                    b.set(tmp,b.get(tmp)+1);
                }
            }
            System.out.println("Test " +test+":");
            for(int x:c){
                System.out.println(x + " xuat hien "+ b.get(x) +" lan");
            }
        }

    }
}
