public class demo{
    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(sumofn(5));
        System.out.println(fibonacci(5));
        System.out.println(power(2, 5));
        System.out.println(power1(2, 5));
        pattern();
        int n=10;
        xyz(n);
        System.out.println();
        int arr[]=new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
        String str = "abc";
        System.out.println(str.length());

                     
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        return n+sumofn(n-1);
    }
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return (fibonacci(n-1)+fibonacci(n-2));
    }
    public static int power(int a ,int n){
        if(n==0){
            return 1;
        }
        return a*power(a, n-1);
    }
    public static int power1(int a , int n){
        if(n==0){
            return 1;
        }
        int halfpower = power1(a, n/2);
        if(n%2 != 0){
            return (halfpower*halfpower)*a;
        }
        return halfpower*halfpower;
    }
    public static void pattern(){
        for(int i =1 ; i<=5 ; i++){
            for(int j=1 ; j<=5 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void xyz(int n){
            //base case
            if(n==0){
                return;
            }
        System.out.print(n+" ");
        xyz(n-1);
    }
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return; 
        }
        //recursion
        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;

    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}