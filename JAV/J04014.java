import java.util.*;

public class J04014{
    public static long gcd(long a,long b){
        if(a==0) return b;
        while(b!=0){
            long tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    public static class PhanSo{
        long tu,mau;
        public PhanSo(long tu,long mau){
            long g=gcd(tu,mau);
            this.tu=tu/g;
            this.mau=mau/g;
        }
        public static PhanSo cong(PhanSo A,PhanSo B){
            long tu=A.tu*B.mau+A.mau*B.tu;
            long mau=A.mau*B.mau;
            return new PhanSo(tu*tu,mau*mau);
        }

        public static PhanSo nhan(PhanSo A,PhanSo B){
            long tu=A.tu*B.tu;
            long mau=A.mau*B.mau;

            return  new PhanSo(tu,mau);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            PhanSo A=new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo B=new PhanSo(sc.nextLong(),sc.nextLong());

            PhanSo C=PhanSo.cong(A,B);
            System.out.printf("%d/%d ",C.tu,C.mau);

            PhanSo D=PhanSo.nhan(A,PhanSo.nhan(B,C));
            System.out.printf("%d/%d\n",D.tu,D.mau);
        }
    }
}
