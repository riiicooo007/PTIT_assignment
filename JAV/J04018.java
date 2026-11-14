import java.util.*;

public class J04018{

    public static class Complex{
        int imag,real;

        public Complex(int a, int b){
            real=a;
            imag=b;
        }

        public static Complex plus(Complex A,Complex B){
            return new Complex(A.real+B.real,A.imag+B.imag);
        }
        public static Complex product(Complex A, Complex B){
            return new Complex (A.real*B.real-A.imag*B.imag,A.real*B.imag+A.imag*B.real);
        }

        public String toString(){
            String s=""+real+" ";
            if(imag<0) s+="- "+(-imag)+"i";
            else s+="+ "+imag+"i";
            return s;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Complex A=new Complex(sc.nextInt(),sc.nextInt());
            Complex B=new Complex(sc.nextInt(),sc.nextInt());
            Complex tmp=Complex.plus(A,B);
            Complex C=Complex.product(tmp,A);
            Complex D=Complex.product(tmp,tmp);
            System.out.println(C+", "+D);
        }
    }
}
