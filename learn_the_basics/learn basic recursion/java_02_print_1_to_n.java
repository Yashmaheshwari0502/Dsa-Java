

public class java_02_print_1_to_n {

    public static void printn(int value,int n){
        if(value>n){
            return;
        }
        System.out.println(value++);
        printn(value,n);
        
        
        
    }
    public static void main(String[] args) {
        int n=10;
        printn(1,n);
    }
}
