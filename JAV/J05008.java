import java.util.*;

public class J05008{
    public static Scanner sc=new Scanner(System.in);

    public static class Point{

        double x,y;

        public Point(){
            this.x=0;
            this.y=0;
        }
        public Point(double x,double y){
            this.x=x;
            this.y=y;
        }
        public Point(Point P){
            this.x=P.x;
            this.y=P.y;
        }


        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }

        public double distance(Point P){
            return Math.sqrt(Math.pow(this.x-P.x,2)+Math.pow(this.y-P.y,2));
        }
        public static double distance(Point P1,Point P2){
            return Math.sqrt(Math.pow(P1.x-P2.x,2)+Math.pow(P1.y-P2.y,2));
        }

    }

    public static class DaGiac{
        int n;
        Point[] A;

        public void nhap(int n){
            this.n=n;
            A=new Point[n+1];
            for(int i=1;i<=n;i++){
                A[i]=new Point(sc.nextDouble(),sc.nextDouble());
            }
        }

        public double dienTich(){
            double s=0;
            s+=A[n].x*A[1].y-A[n].y*A[1].x;
            for(int i=1;i<=n-1;i++){
                s+=A[i].x*A[i+1].y-A[i].y*A[i+1].x;
            }
            s=Math.abs(s)/2;
            return s;
        }
    }



    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            DaGiac k=new DaGiac();
            k.nhap(n);
            System.out.printf("%.3f\n",k.dienTich());
        }
    }
}
