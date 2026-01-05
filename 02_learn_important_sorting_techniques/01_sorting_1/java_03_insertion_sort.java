public class java_03_insertion_sort {

    public static void main(String[] args) {
        int arr[]={12,11,13,5,6};
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp;
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}