
public class java_02_reverse_a_number {
    public static void main(String[] args) {
        int n=5678;
        int temp=n;
        int ans=0;
        while(n>0){
            int v=n%10;
        ans=(ans*10)+v;
        n=n/10;
        }
        System.out.println(ans);
    }
}
