public class java_02_recursive_bubble_sort {

    public static void recursive(int []arr,int n){
        if (n==1) return;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
            }
        }

        recursive(arr, n-1);


    }

    public static void main(String[] args) {
        int arr[]={1,342,53,24,563,353,56,2};
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        recursive(arr,arr.length);

        for(int x:arr){
            System.out.println(x);
        }
    }
}