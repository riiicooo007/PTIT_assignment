import java.util.*;

public class J04015{
    static Scanner sc=new Scanner(System.in);

    public static class GiaoVien{
        String maGV;
        String ten;
        long luongCB;
        public void inPut(){
            this.maGV=sc.nextLine().trim();
            this.ten=sc.nextLine().trim();
            this.luongCB=sc.nextLong();
        }
        public void outPut(){
            System.out.printf("%s %s ",maGV,ten);
            int heSo=Integer.parseInt(maGV.substring(2));

            //System.out.println(maGV.substring(0,2));
            long phuCap=(maGV.substring(0,2).equals("HT")?2000000:(maGV.substring(0,2).equals("HP")?900000:500000));
            System.out.printf("%d %d %d",heSo,phuCap,luongCB*heSo+phuCap);
        }
    }

    public static void main(String[] args){
        GiaoVien a=new GiaoVien();
        a.inPut();
        a.outPut();
    }
}
