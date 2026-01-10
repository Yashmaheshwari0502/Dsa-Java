public class java_05_left_rotate_array_by_one {
    public static void main(String[] args) {
        int arr[]={-1, 0, 3, 6};
        int n=arr.length-1;
        int temp=arr[0];
        
        for(int i=1;i<=n;i++){
arr[i-1]=arr[i];
        }
        arr[n]=temp;

        for(int x:arr){
            System.out.println(x);
        }
    }
}
