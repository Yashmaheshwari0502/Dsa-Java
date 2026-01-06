public class java_03_recursive_insertion_sort {

    public static void recursive(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        int j=i;

        while(j>0 && arr[j-1]>arr[j]){
            int temp;
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
        }
        recursive(arr, i+1, n);
    }

    public static void main(String[] args) {

        int arr[] = { 10, 4, 7, 42, 754, 2, 45 };

        
        recursive(arr, 0, arr.length);
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
