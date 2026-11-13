import java.util.*;

public class J04011{


    public static class Point3D{
        double x,y,z;

        public Point3D(double x,double y,double z){
            this.x=x;
            this.y=y;
            this.z=z;
        }

        private static Point3D vector_u(Point3D p1,Point3D p2){
            Point3D p=new Point3D(p1.x-p2.x,p1.y-p2.y,p1.z-p2.z);
            return p;
        }


        //cross product tiếng anh nghĩa là tích có hướng
        private static Point3D vectorCrossProduct(Point3D p1,Point3D p2){
            Point3D p=new Point3D(p1.y*p2.z-p1.z*p2.y,p1.z*p2.x-p1.x*p2.z,p1.x*p2.y-p2.x*p1.y);
            return p;
        }

        public static boolean check(Point3D A,Point3D B, Point3D C, Point3D D){
            Point3D AB=Point3D.vector_u(A,B);
            Point3D CD=Point3D.vector_u(C,D);
            Point3D n=Point3D.vectorCrossProduct(AB,CD);
            if(n.x==0&&n.y==0&&n.z==0) return true;
            Point3D AC=Point3D.vector_u(A,C);
            return AC.x*n.x+AC.y*n.y+AC.z*n.z==0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
