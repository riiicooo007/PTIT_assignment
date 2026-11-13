import java.util.*;

public class J04010{
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



    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            Point A=new Point(sc.nextDouble(),sc.nextDouble());
            Point B=new Point(sc.nextDouble(),sc.nextDouble());
            Point C=new Point(sc.nextDouble(),sc.nextDouble());
            double a=Point.distance(B,C);
            double b=Point.distance(A,C);
            double c=Point.distance(B,A);
            if(a+b>c&&b+c>a&&c+a>b){
                double S=Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
                double R=a*b*c/(4*S);
                System.out.printf("%.3f\n",Math.PI*R*R);
            }
            else System.out.println("INVALID");
        }
    }
}
