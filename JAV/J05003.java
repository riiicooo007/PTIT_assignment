import java.util.*;

public class J05003{
    static Scanner sc=new Scanner(System.in);
    public static class SinhVien{
        static int id=0;
        String maSV,hoTen,bDay,lopSV;
        Double gPA;

        public void inPut(){
            id++;
            maSV=String.format("B20DCCN%03d",id);
            hoTen=sc.nextLine().trim();
            lopSV=sc.nextLine().trim();
            bDay=sc.nextLine().trim();
            gPA=sc.nextDouble();
            sc.nextLine();
        }

        public void chuanHoa(){
            if(bDay.charAt(2)!='/') bDay="0"+bDay;
            if(bDay.charAt(5)!='/') bDay=bDay.substring(0,3)+"0"+bDay.substring(3);

        }

        public void outPut(){
            System.out.printf("%s %s %s %s %.2f\n",maSV,hoTen,lopSV,bDay,gPA);
        }
    }

    public  static void main(String[] args){
        int n=sc.nextInt();
        sc.nextLine();
        SinhVien[] SV=new SinhVien[n];
        for(int i=0;i<n;i++){
            SV[i]=new SinhVien();
            SV[i].inPut();
            SV[i].chuanHoa();
            SV[i].outPut();
        }
    }
}
