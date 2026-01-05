
import java.util.*;


public class count_higest_and_lowest {
    public static void main(String[] args) {
        int arr[]={10,5,10,15,10,5,15,15,15,15};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minkey=0;
        int maxkey=0;
        Map<Integer,Integer> mu=new HashMap<Integer,Integer>();


        for(int i=0;i<arr.length;i++){
            if(mu.containsKey(arr[i])){
                mu.put(arr[i], mu.get(arr[i])+1);
            }
            else{
                mu.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:mu.entrySet()){
            int fre=entry.getValue();
            if(fre<min){
                min=fre;
                minkey=entry.getKey();
            }
            if(fre>max){
                max=fre;
                maxkey=entry.getKey();
            }
        }
        System.out.printf("%d--> %d\n",maxkey,max);
        System.out.printf("%d--> %d",minkey,min);
        
    

    }
}
