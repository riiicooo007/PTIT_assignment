import java.util.*;

public class J02005{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int i=1;i<=n;i++){
            a.add(sc.nextInt());
        }
        for(int i=1;i<=m;i++){
            b.add(sc.nextInt());
        }
        a.retainAll(b);
        List<Integer> res=new ArrayList<>(a);
        Collections.sort(res);
        for(int x:res)
            System.out.print(x+" ");
    }
}
