import java.util.*;

public class J04022{

    public static class WordSet{
        Set<String> SSet=new TreeSet<>();

        public WordSet(String s){
            s=s.toLowerCase().trim();

            for(int j=0;j<s.length();j++){
                int i=j;

                    while(i<s.length()&&s.charAt(i)==' '){
                        i++;
                    }
                    while(i<s.length()&&s.charAt(i)!=' '){
                        i++;
                    }
                    SSet.add(s.substring(j,i));
                    j=i;

            }

        }

        public WordSet union(WordSet s2){
            WordSet s=new WordSet("");
            s.SSet.addAll(s2.SSet);
            s.SSet.addAll(SSet);
            return s;
        }

        public WordSet intersection(WordSet s2){
            WordSet s=new WordSet("");
            s.SSet.addAll(SSet);
            s.SSet.retainAll(s2.SSet);
            return s;
        }

        public String toString(){
            String s="";
            for(String ss:SSet){
                s+=ss+" ";
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
