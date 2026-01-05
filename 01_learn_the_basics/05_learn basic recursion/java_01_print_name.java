
public class java_01_print_name {
    public static void printName(int n){
        if(n<1){
            return ;
        }
        System.out.println("yash");
        n--;
        printName(n);
    }
    public static void main(String[] args) {
        int n=1;
        printName(n);
    }
}
