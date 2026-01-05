
public class java_07_palidrome_string {
    public static boolean  checkpalin(int l,int r,String n){
        if(l>r){
            return true;
        }
        
        if(n.charAt(l)!=n.charAt(r)){
            return false;
        }
        return checkpalin(++l, --r, n);
        
    }
    public static void main(String[] args) {
        String n="ABCDCBA";
        int l=n.length();
        System.out.println(checkpalin(0,l-1,n));
    }
}
