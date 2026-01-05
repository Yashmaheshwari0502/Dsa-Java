public class java_03_print_n_to_1 {
    public static void printsn(int value,int n){
        if(n<value){
            return ;
        }
        System.out.println(n);
        printsn(value,--n);
    }

    public static void main(String[] args) {
        int n=10;
        printsn(1,n);
    }
}