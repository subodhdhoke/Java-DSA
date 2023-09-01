public class bit{
    public static void oddoreven(int n){
        if((n & 1) == 0){
            System.out.println(n+" is Even.");
        }
        else{
            System.out.println(n+" is odd.");
        }
    }
    public static void main(String args[]){
        oddoreven(10);
    }
}