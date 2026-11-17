 import java.util.*;

public class J05006 {

    public static class NhanVien{
        String maNV,hoTen,genDer,bDay,addRess,taxID,timeDay;

        public void inPut(int id,Scanner sc){
            maNV=String.format("%05d",id);
            hoTen=sc.nextLine().trim();
            genDer=sc.nextLine().trim();
            bDay=sc.nextLine().trim();
            addRess=sc.nextLine().trim();
            taxID=sc.nextLine().trim();
            timeDay=sc.nextLine().trim();
        }

        public void chuanHoa(){

        }

        public void outPut(){
            System.out.printf("%s %s %s %s %s %s %s\n",maNV,hoTen,genDer,bDay,addRess,taxID,timeDay);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        NhanVien[] NV=new NhanVien[n];
        for(int i=0;i<n;i++){
            NV[i]=new NhanVien();
            NV[i].inPut(i+1,sc);
            NV[i].outPut();
        }
    }
}
