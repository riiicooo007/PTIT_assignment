import java.util.*;

public class J02009 {

    public static class Mapp {
        int Key, Value;

        public Mapp(int k, int v) {
            Key = k;
            Value = v;
        }

        public void setMapp(Mapp a) {
            Key = a.Key;
            Value = a.Value;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mapp[] a = new Mapp[n + 1];

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();
            a[i] = new Mapp(t, d);
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (a[i].Key > a[j].Key) {
                    Mapp tmp = new Mapp(a[j].Key, a[j].Value);
                    a[j].setMapp(a[i]);
                    a[i].setMapp(tmp);
                }
            }
        }

        int time = 0;
        for(int i = 1; i <= n; i++) {
            if (time < a[i].Key) time = a[i].Key + a[i].Value;
            else time += a[i].Value;
        }
        System.out.printf("%d", time);

    }
}
