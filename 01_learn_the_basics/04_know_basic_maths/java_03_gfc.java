
public class java_03_gfc {

    public static void main(String[] args) {
        // int n = 20;
        // int m = 15;
        // int max = 0;
        // int i = 2;
        // while (i < n || i < m) {
        // if (n % i == 0 && m % i == 0) {
        // max = i;
        // }
        // i++;
        // }
        // System.out.println(max);

        int n = 20;
        int m = 15;
        while (n > 0 && m > 0) {
            if (n > m) {
                n = n % m;

            } else {
                m = m % n;
            }

        }
        if (m == 0) {
            System.out.println(n);

        } else {
            System.out.println(m);

        }
    }
}