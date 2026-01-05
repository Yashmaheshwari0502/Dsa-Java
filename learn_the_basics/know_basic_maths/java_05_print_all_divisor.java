public class java_05_print_all_divisor {
    public static void main(String[] args) {
        int n=435465;

        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
