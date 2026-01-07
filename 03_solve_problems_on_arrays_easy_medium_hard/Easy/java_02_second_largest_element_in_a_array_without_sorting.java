

public class java_02_second_largest_element_in_a_array_without_sorting {
    public static void main(String[] args) {
        int arr[]={1, 2, 4,8, 7, 7, 5};
        int max_value=Integer.MIN_VALUE;
        int min_value=Integer.MIN_VALUE-1;

        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max_value){
                min_value=max_value;
                max_value=arr[i];
            }
            else if (arr[i]>min_value && arr[i]!=max_value) {
                min_value=arr[i];
            }
        }
        System.out.println("the max value is: "+max_value);
        System.out.println("the min value is: "+min_value);
    }
}
