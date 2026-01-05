
public class java_06_reverse_a_array {
    public static void reverse(int[] n, int l) {
        int v = l - 1;
        int i = 0;
        while (i < ((l - 1) / 2)) {
            int temp = n[i];
            n[i] = n[v];
            n[v] = temp;
            i++;
            v--;
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 6 ,3,2,2,2,2,1};
        int l = n.length;
        reverse(n, l);
        for(int x:n){
            System.out.println(x);
        }
    }
}
