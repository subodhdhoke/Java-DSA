public class recursion{
    public static void main(String args[]){
        int a[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(FirstOccurancerecusion(a, 15, 0));
    }
    public static int firtOccurance(int a[],int key){
        for(int i=0 ; i<a.length ; i++){
            if(a[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static int FirstOccurancerecusion(int a[],int key,int i){

        if(i==a.length){
            System.out.print("Not present in the array");
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return FirstOccurancerecusion(a, key, i+1);
    }
}