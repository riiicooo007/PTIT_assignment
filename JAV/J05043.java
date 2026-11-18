import java.util.*;

public class J05043{
    static Scanner sc=new Scanner(System.in);
    public static class NhanVien{
        String maNV,hoTen,chucVu;
        double luongCB,soNC,phuCap,tamUng,conLai;

        public void inPut(int id){
            sc.nextLine();
            maNV=String.format("NV%02d",id);
            hoTen=sc.nextLine().trim();
            chucVu=sc.nextLine().trim();
            luongCB=sc.nextDouble();
            soNC=sc.nextDouble();
        }

        public void xuly(){
            switch(chucVu){
                case "GD":
                    phuCap=500;
                    break;
                case "PGD":
                    phuCap=400;
                    break;
                case "TP":
                    phuCap=300;
                    break;
                case "KT":
                    phuCap=250;
                    break;
                default: phuCap=100;
            }

            double thuNhap=(phuCap+luongCB*soNC)*2/3;
            if(thuNhap<25000) tamUng=Math.round(thuNhap/1000)*1000;
            else tamUng=25000;


        }

        public void outPut(){
            System.out.printf("%s %s %d %d %d %d\n",maNV,hoTen,Math.round(phuCap),Math.round(soNC*luongCB),Math.round(tamUng),Math.round(soNC*luongCB+phuCap-tamUng));
        }
    }

    public static void main(String[] args){
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            NhanVien a=new NhanVien();
            a.inPut(i);
            a.xuly();
            a.outPut();
        }
    }
}
