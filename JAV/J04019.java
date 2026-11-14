import java.util.*;

public class J04019{

    public static class Point{
         double x,y;

        public static Point nextPoint(Scanner sc){
            Point A=new Point();
            A.x=sc.nextDouble();
            A.y=sc.nextDouble();
            return A;
        }
        public static double egde(Point A,Point B){
            return Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y,2));
        }
    }

    public static class Triangle{
        Point A,B,C;
        double perimeter;
        public Triangle(Point a,Point b,Point c){
            A=a;
            B=b;
            C=c;
        }

        public boolean valid(){
            double a=Point.egde(B,C);
            double b=Point.egde(A,C);
            double c=Point.egde(B,A);
            if(a+b>c&&a+c>b&&b+c>a){
                perimeter=a+b+c;
                return true;
            }
            return false;
        }

        public double getPerimeter(){
            return Math.round(perimeter * 1000) / 1000.0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
