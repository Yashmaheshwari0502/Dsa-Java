

public class java_04_sum_of_number {
    public static int printsum(int n){
        if(n==1){
            return 1;
        }
        return n+printsum(n-1);
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(printsum(n));
    }
}
