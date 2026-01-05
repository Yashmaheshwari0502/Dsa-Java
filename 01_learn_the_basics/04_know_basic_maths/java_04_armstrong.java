public class java_04_armstrong {
    public static void main(String[] args) {
        int n=371;

        int temp=n;
        int sum=0;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0){
            int v=temp%10;
            sum=sum+(Math.powExact(v, count));
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        
    }
}
