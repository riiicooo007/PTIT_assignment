import java.util.*;

public class J05046{
    static Scanner sc=new Scanner(System.in);
    public static class LoHang{
        String tenHang, maHang;
        long id,soLuong, donGia, trietKhau, tiLeTKhau;
        static Map<String,Integer> a=new HashMap<>();

        public void inPut(int index){
            sc.nextLine();
            id=index;
            tenHang=sc.nextLine().trim();
            soLuong=sc.nextLong();
            donGia=sc.nextLong();
        }

        public void xuLy(){
            String s="";
            s+=Character.toUpperCase(tenHang.charAt(0));
            for(int i=1;i<tenHang.length();i++){
                if(tenHang.charAt(i)==' '&&tenHang.charAt(i+1)!=' '){
                    s+=Character.toUpperCase(tenHang.charAt(i+1));
                    break;
                }
            }
            if(a.get(s)==null) a.put(s,1);
            else a.put(s,a.get(s)+1);
            maHang=String.format("%s%02d",s,a.get(s));

            if(soLuong<5) tiLeTKhau=0;
            else if(soLuong<8) tiLeTKhau=1;
            else if(soLuong<=10) tiLeTKhau=2;
            else tiLeTKhau=5;

            trietKhau=donGia*soLuong*tiLeTKhau/100;
        }

        public void outPut(){
            System.out.printf("%s %s %d %d\n",maHang,tenHang,trietKhau,soLuong*donGia-trietKhau);
        }

    }

    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            LoHang a=new LoHang();
            a.inPut(i);
            a.xuLy();
            a.outPut();
        }
    }
}
