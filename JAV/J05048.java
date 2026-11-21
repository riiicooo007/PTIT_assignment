import java.util.*;

public class J05048{
    static Scanner sc=new Scanner(System.in);

    public static class HangHoa{
        String maHang;
        long donGia,tienHang,tienThue,luongNhap,luongXuat;

        public void inPut(){
            maHang=sc.next();
            luongNhap=sc.nextLong();
        }

        public void xuLy(){

            Character c1=maHang.charAt(0);
            Character c2=maHang.charAt(4);


            if(c1=='A') luongXuat=Math.round((double)luongNhap*60/100);
            else if(c1=='B') luongXuat=Math.round((double)luongNhap*70/100);

            switch(c2){
                case 'Y':
                    donGia=110000;
                    break;
                case 'N':
                    donGia=135000;
                    break;
                default: ;
            }

            tienHang=luongXuat*donGia;

            if(c1=='A'&&c2=='Y') tienThue=tienHang*8/100;
            else if(c1=='A'&&c2=='N') tienThue=tienHang*11/100;
            else if(c1=='B'&&c2=='Y') tienThue=tienHang*17/100;
            else if(c1=='B'&&c2=='N') tienThue=tienHang*22/100;


        }

        public void outPut(){
            System.out.printf("%s %d %d %d %d %d\n",maHang,luongNhap,luongXuat,donGia,tienHang,tienThue);
        }
    }

    public static void main(String[] args){
        int n=sc.nextInt();
        while(n-->0){
            HangHoa h=new HangHoa();
            h.inPut();
            h.xuLy();
            h.outPut();
        }
    }
}
