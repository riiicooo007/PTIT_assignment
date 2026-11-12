import java.util.*;


public class J04006{
    public static Scanner sc=new Scanner(System.in);


    public static class SinhVien{
        String maSV;
        String tenSV;
        String lopSV;
        String ngaySinh;
        double gpa;

        public void inPut(){
            this.maSV="B20DCCN001";
            this.tenSV=sc.nextLine();
            this.lopSV=sc.next();
            this.ngaySinh=sc.next();
            this.gpa=sc.nextDouble();
        }
        public void outPut(){
            //xuly ngay sinh
            int a=this.ngaySinh.length();
            if(a==8) this.ngaySinh="0"+this.ngaySinh.substring(0,2)+"0"+
                    this.ngaySinh.substring(2,8);
            if(a==9){
                if(this.ngaySinh.charAt(3)!='/') this.ngaySinh="0"+this.ngaySinh;
                else this.ngaySinh=this.ngaySinh.substring(0,2)+"0"+this.ngaySinh.substring(2,9);
            }
            System.out.printf("%s %s %s %s %.2f",this.maSV,this.tenSV,this.lopSV,this.ngaySinh,this.gpa);
        }
    }


    public static void main(String[] args){
        SinhVien a=new SinhVien();
        a.inPut();
        a.outPut();
    }
}
