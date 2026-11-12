import java.util.*;


public class J04001{
    public static Scanner sc=new Scanner(System.in);

    public static class Point{
        double x,y;

        public Point(double x, double y){
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

        public double distance(Point secondPoint){
            return Math.sqrt(Math.pow(this.x-secondPoint.x,2)+Math.pow(this.y-secondPoint.y,2));
        }

        public static double distance(Point p1, Point p2){
            return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
        }

        public String toString(){
            return "("+this.x+","+this.y+")";
        }
    }

    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            Point p1=new Point(sc.nextDouble(),sc.nextDouble());
            Point p2=new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f%n",Point.distance(p1,p2));
        }
    }

}
