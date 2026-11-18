import java.util.*;

public class J05044{

    static Scanner sc=new Scanner(System.in);

    public static class NhanVien{
        String maNV, chucVu, hoTen;
        double luongCB,soNC,phuCap,tamUng;

        public void inPut(int id){
            sc.nextLine().trim();
            maNV=String.format("NV%02d",id);
            hoTen=sc.nextLine().trim();
            chucVu=sc.nextLine().trim();
            luongCB=sc.nextDouble();
            soNC=sc.nextDouble();
        }

        public void xuLy(){
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
                default:
                    phuCap=100;
            }

            double thuNhap=(phuCap+luongCB*soNC)*2/3;
            if(thuNhap<25000) tamUng=Math.round(thuNhap/1000)*1000;
            else tamUng=25000;
        }

        public void outPut(){
            System.out.printf("%s %s %d %d %d %d\n",maNV,hoTen,Math.round(phuCap),Math.round(luongCB*soNC),Math.round(tamUng),Math.round(luongCB*soNC+phuCap-tamUng));
        }

    }


    public static void main(String[] args){
        int n=sc.nextInt();
        NhanVien[] a=new NhanVien[n+1];
        for(int i=1;i<=n;i++){
            a[i]=new NhanVien();
            a[i].inPut(i);
            a[i].xuLy();
        }

        String chuc=sc.next();

        for(int i=1;i<=n;i++){
            if(a[i].chucVu.equals(chuc)){
                a[i].outPut();
            }
        }


    }
}
