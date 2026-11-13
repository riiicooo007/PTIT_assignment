import java.util.*;

public class J04013{
    public static Scanner sc=new Scanner(System.in);

    public static class SinhVien{
        String maTS, hoTen;
        double toan,ly,hoa;

        public void inPut(){
            maTS=sc.nextLine().trim();
            hoTen=sc.nextLine().trim();
            toan=sc.nextDouble();
            ly=sc.nextDouble();
            hoa=sc.nextDouble();
        }

        public void indiem(double a){
            if (a==Math.floor(a)) System.out.printf("%d ",(int)a);
            else System.out.printf("%.1f ",a);
        }

        public void outPut(){
            System.out.printf("%s %s ",maTS,hoTen);

            double uuTien=0;
            char kv=maTS.charAt(2);
            if(kv=='1') uuTien=0.5;
            else if(kv=='2') uuTien=1.0;
            else if(kv=='3') uuTien=2.5;

            this.indiem(uuTien);

            double tong=toan*2+ly+hoa;
            this.indiem(tong);

            if(tong+uuTien>=24) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
    }

    public static void main(String[] args){
        SinhVien a=new SinhVien();
        a.inPut();
        a.outPut();
    }
}
