import java.util.*;

public class J04021{

    public static class IntSet{
        Set<Integer> ISet=new TreeSet<>();

        public IntSet(int[] a){
            for(int i=0;i<a.length;i++){
                ISet.add(a[i]);
            }
        }

        public IntSet(){
            ISet=new TreeSet<>();
        }

        public IntSet union(IntSet b){
            IntSet c = new IntSet();
            c.ISet.addAll(ISet);
            c.ISet.addAll(b.ISet);
            return c;
        }

        public String toString(){
            String s="";
            for(int x:ISet){
                s+=x+" ";
            }
            return s;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
