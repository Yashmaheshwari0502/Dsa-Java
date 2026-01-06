public class java_04_quick_sort {

    public static int f(int arr[],int low,int high){
        int i=low;
        int j=high;
        int pivot=arr[i];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        
        int temp=arr[low];
                arr[low]=arr[j];
                arr[j]=temp;
        return j;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int p=f(arr,low,high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);

        }
    }
    public static void main(String[] args) {
        int []arr={4,1,7,9,3};
        quicksort(arr,0,arr.length-1);

        for(int x: arr){
            System.out.println(x);
        }
    }
}
