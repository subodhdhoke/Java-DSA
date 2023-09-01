public class bitwise{
    public static void getith(int n,int i){
        //int b = n>>i;
        //System.out.println(b);
        if((n>>i&1)==1){
            System.out.println("i'th bit is 1");
        }
        else{
            System.out.println("i'th bit is 0");
        }
    }
    public static void main(String args[]){
        //int n=15;
        getith(10, 3);

        
    }
}