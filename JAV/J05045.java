import java.util.*;

public class J05045{
    static Scanner sc=new Scanner(System.in);

    public static class NhanVien{
        String maNV,hoTen, chucVu;
        double luongCB,soNC,phuCap,tamUng,thuNhap;

        public void inPut(int id){
            maNV=String.format("NV%02d",id);
            sc.nextLine();
            hoTen=sc.nextLine().trim();
            chucVu=sc.nextLine().trim();
            luongCB=sc.nextDouble();
            soNC=sc.nextDouble();
        }

        public void xuLy(){
            switch (chucVu){
                case "GD":
                    phuCap=500;
                    break;
                case "PGD":
                    phuCap=400;
                    break;
                case "TP" :
                    phuCap=300;
                    break;
                case "KT":
                    phuCap=250;
                    break;
                default: phuCap= 100;
            };

            thuNhap = (phuCap + luongCB*soNC);
            double tmp=thuNhap*2/3;

            tamUng=(tmp<25000?Math.round(tmp/1000)*1000:25000);

        }

        public void outPut(){
            System.out.printf("%s %s %d %d %d %d\n",maNV,hoTen,Math.round(phuCap),Math.round(thuNhap-phuCap),Math.round(tamUng),Math.round(thuNhap-tamUng));
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

        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                if(a[i].thuNhap<a[j].thuNhap){
                    NhanVien tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=1;i<=n;i++){
            a[i].outPut();
        }

    }
}
