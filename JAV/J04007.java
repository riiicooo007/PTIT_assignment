import java.util.*;

public class J04007{
    public static Scanner sc=new Scanner(System.in);


    public static String xulyNgay(String s){
        if(s.charAt(2)!='/') s="0"+s;
        if(s.charAt(5)!='/') s=s.substring(0,3)+"/"+s.substring(3);
        return s;
    }

    public static class NhanVien{
        String maNV,hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKHD;

        public void inPut(){
            this.maNV="00001";
            this.hoTen=sc.nextLine().trim();
            this.gioiTinh=sc.nextLine().trim();
            this.ngaySinh=sc.nextLine().trim();
            this.diaChi=sc.nextLine().trim();
            this.maSoThue=sc.nextLine().trim();
            this.ngayKHD=sc.nextLine().trim();

        }
        public void outPut(){
            System.out.printf("%s %s %s %s %s %s %s",this.maNV,this.hoTen,this.gioiTinh,xulyNgay(this.ngaySinh),this.diaChi,this.maSoThue,xulyNgay(this.ngayKHD));
        }
    }

    public static void main(String[] args){
        NhanVien a=new NhanVien();
        a.inPut();
        a.outPut();
    }
}
