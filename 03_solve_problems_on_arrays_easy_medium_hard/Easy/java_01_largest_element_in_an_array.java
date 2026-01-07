
public class java_01_largest_element_in_an_array {
    public static void main(String[] args) {
        int arr[]={2, 5, 1, 3, 0}  ;
        int max_value=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        System.out.println(max_value);
    }
}
