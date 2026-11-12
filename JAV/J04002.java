import java.util.*;

public class J04002{
    public static Scanner sc=new Scanner(System.in);

    public static class Rectange{
        double width,height;
        String color;
        public  Rectange(){
            this.width=1;
            this.height=1;
            this.color="";
        }
        public Rectange(double width, double height,String color){
            this.width=width;
            this.height=height;
            this.color=color;
        }


        public double getWidth(){
            return this.width;
        }
        public double getHeight(){
            return this.height;
        }
        public String getColor(){
            String s=this.color.toLowerCase();
            return Character.toUpperCase(s.charAt(0))+s.substring(1);

        }


        public void setWidth(double width){
            this.width=width;
        }
        public void setHeight(double height){
            this.height=height;
        }
        public void setColor(String color){
            this.color=color;
        }


        public long findArea(){
            return (long)(this.width*this.height);
        }
        public int findPerimeter(){
            return (int)(2*(this.width+this.height));
        }

    }


    public static boolean check(Rectange a){
        return a.width>0 && a.height>0 && a.width==Math.floor(a.width) && a.height==Math.floor(a.height);
    }

    public static void main(String[] args){
        Rectange a=new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(check(a)){
            System.out.println("" + a.findPerimeter()+" "+a.findArea() +" "+ a.getColor());
        }
        else System.out.println("INVALID");
    }
}
