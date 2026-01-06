
import java.util.ArrayList;
import java.util.Arrays;


public class java_01_mergesort {

   public static void sortit(int [] arr,int low, int high, int mid){
      int left=low;
      int right=mid+1;
      ArrayList<Integer> temp=new ArrayList<>();

      while(left<=mid && right<=high){
         if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
         }
         else{
            temp.add(arr[right]);
            right++;
         }
      }
      while(left<=mid){
         temp.add(arr[left]);
         left++;
      }
      while(right<=high){
         temp.add(arr[right]);
         right++;
      }
      for(int i=0;i<temp.size();i++){
         arr[i+low]=temp.get(i);
      }

   }


   public static void merge(int []arr,int low,int high){
      if(low==high){
         return ;
      }
      int mid=(low+high)/2;
      merge(arr,low,mid);
      merge(arr,mid+1,high);
      sortit(arr,low,high,mid);
   }
   public static void main(String[] args) {
   int arr[]={3,2,8,5,1,4,23};
   merge(arr, 0,arr.length-1);

    System.out.println(Arrays.toString(arr));
   }
}
