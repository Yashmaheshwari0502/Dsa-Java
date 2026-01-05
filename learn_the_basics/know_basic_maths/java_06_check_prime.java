public class java_06_check_prime {
    public static void main(String[] args) {
        int n=13;
        boolean value=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                value=false;
            }
        }
        if(value){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
