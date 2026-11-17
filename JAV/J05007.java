 import java.util.*;

public class J05007 {

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

        public boolean compare(NhanVien b){
            if(bDay.substring(6).compareTo(b.bDay.substring(6))>0)  return false;
            else if(bDay.substring(6).compareTo(b.bDay.substring(6))==0){
                if(bDay.substring(3,5).compareTo(b.bDay.substring(3,5))>0) return false;
                else if(bDay.substring(3,5).compareTo(b.bDay.substring(3,5))==0){
                    if(bDay.substring(0,2).compareTo(b.bDay.substring(0,2))>0) return false;
                }
            }
            return true;
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
        }
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++) {
                if(!NV[i].compare(NV[j])){
                    NhanVien tmp=NV[i];
                    NV[i]=NV[j];
                    NV[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            NV[i].outPut();
        }
    }
}
