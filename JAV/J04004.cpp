import java.util.*;

public class J04004{
    public static Scanner sc=new Scanner(System.in);


    public static long gcd(long a,long b){
        while(b>0){
            long tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }



    public static class PhanSo {
        public long tu, mau;


        public PhanSo(long tu, long mau) {

                long g = gcd(tu, mau);

                this.tu = tu / g;
                this.mau = mau / g;


        }
    }


     public static void main(String[] args){
        PhanSo a=new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo b=new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo c=new PhanSo(a.tu*b.mau+a.mau*b.tu,a.mau*b.mau);

        System.out.println(""+c.tu+"/"+c.mau);
    }
}
