class java_01_selection_sort{
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int min_index=0;
        for(int i=0;i<arr.length;i++){
            int min_value=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min_value){
                    min_value=arr[j];
                    min_index=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

}