public class java_06_left_rotate_array_by_d_elements {
    static void reverseArray(int[] nums, int start, int end) {
        // Swap elements until start meets end
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        reverseArray(arr,0,n-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, k-1);

        for(int a:arr){
            System.out.println(a);
        }

        
    }
}
