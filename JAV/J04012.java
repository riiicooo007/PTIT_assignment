import java.util.*;

public class J04012{
    static Scanner sc=new Scanner(System.in);
    public static class NhanVien{
        String maNV, hoTen;
        long luongCoBan;
        int ngayCong;
        String chucVu;

        public void inPut(){
            this.maNV="NV01";
            this.hoTen=sc.nextLine().trim();
            this.luongCoBan=sc.nextLong();
            this.ngayCong=sc.nextInt();
            this.chucVu=sc.next().trim();
        }
        public void outPut(){
            System.out.printf("%s %s ",maNV,hoTen);

            long luong=luongCoBan*ngayCong;
            System.out.printf("%d ",luong);

            long thuong=0;
            if(ngayCong>=25) thuong=luong*20/100;
            else if(ngayCong>=22&&ngayCong<25) thuong=luong*10/100;
            System.out.printf("%d ",thuong);

            long phuCap=0;
            if(chucVu.equals("GD")) phuCap=250000;
            else if(chucVu.equals("PGD")) phuCap=200000;
            else if(chucVu.equals("TP")) phuCap=180000;
            else if(chucVu.equals("NV")) phuCap=150000;
            System.out.printf("%d ",phuCap);

            System.out.printf("%d", luong+thuong+phuCap);

        }
    }


    public static void main(String[] args){
        NhanVien a=new NhanVien();
        a.inPut();
        a.outPut();
    }
}
