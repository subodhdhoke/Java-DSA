public class compare {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        if(str1==str2){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        if(str1 == str3){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        if(str1.equals(str3)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }
    }
}
