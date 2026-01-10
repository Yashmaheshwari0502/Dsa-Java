public class java_04_remove_duplicates_from_sorted_array {

    public static void main(String[] args) {
        int arr[]={1,1,2 };
        int n=arr.length-1;

        int l=0;
        int r=0;
        while(r<n){
            if(arr[r]!=arr[r+1]){
                l++;
                arr[l]=arr[r+1];
            }
            r++;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}