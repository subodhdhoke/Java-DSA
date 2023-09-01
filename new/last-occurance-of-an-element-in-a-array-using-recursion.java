public class main{
    public static void main(String args[]){
        int a[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurancerecursion(a, 5, a.length-1));
    }
    public static int lastOccurance(int a[], int key){
        for(int i=a.length-1 ; i>=0 ; i--){
            if(a[i]==key){
                return i;
            }
        }
        return 1;
    }
    public static int lastOccurancerecursion(int a[],int key,int i){
        if(i==-1){
            System.out.print("Not present in the array");
            return -1;
        }
        if(a[i] == key){
            return i;
        }
        return lastOccurancerecursion(a, key, i-1);
    }
}