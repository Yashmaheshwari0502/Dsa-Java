
public class java_03_check_if_array_is_sorted {
    public static void main(String[] args) {
        int arr[] = { 5,4,6,7,8 };
        boolean value = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                value = false;
                break;
            }
        }
        if(value){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
