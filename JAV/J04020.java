import java.util.*;

public class J04020{


    public static boolean prime(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return a>=2;
    }

    public static class Pair<F extends Integer,S extends Integer>{
        F Fuck;
        S Sex;

        public Pair(F Fuck,S Sex){
            this.Fuck=Fuck;
            this.Sex=Sex;
        }

        public boolean isPrime(){
            return prime((int)Fuck) && prime((int)Sex);
        }

        public String toString(){
            return ""+Fuck+" "+Sex;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
