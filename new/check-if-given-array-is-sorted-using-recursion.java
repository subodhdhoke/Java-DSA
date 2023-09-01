public class main{
    public static boolean issorted(int a[]){
        if(a==null || a.length < 1){
            return true;
        }
        for(int i=0 ; i<a.length-1 ; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean issortedrecursion(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return issortedrecursion(a, i+1);
    }
    public static void main(String args[]){
        int a[] = {1,2,4,6,8,15};
        System.out.println(issortedrecursion(a,0));
    }
}