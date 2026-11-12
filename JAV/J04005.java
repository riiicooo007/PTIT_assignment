import java.util.*;

public class J04005{
    public static Scanner sc=new Scanner(System.in);
    public static class ThiSinh{
        String ten;
        String birthDay;
        double diemToan,diemVan,diemAnh;

        public ThiSinh(String ten,String birthDay,double diemToan,double diemVan, double diemAnh){
            this.ten=ten;
            this.birthDay=birthDay;
            this.diemToan=diemToan;
            this.diemVan=diemVan;
            this.diemAnh=diemAnh;
        }

        public double tongDiem(){
            return diemToan+diemVan+diemAnh;
        }
    }

    public static void main(String[] args){
        ThiSinh n=new ThiSinh(sc.nextLine(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println(n.ten+" "+n.birthDay+" "+n.tongDiem());
    }
}
