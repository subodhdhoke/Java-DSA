import java.util.*;
public class strings{
    public static float stringshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0 ; i<path.length() ; i++){
            //north y++
            if(path.charAt(i)=='n'){
                y++;
            }
            //south
            else if(path.charAt(i)=='s'){
                y--;
            }
            //west x--
            else if(path.charAt(i)=='w'){
                x--;
            }
            //east x++
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        float sp = (float)Math.sqrt(x2+y2);
        System.out.println("Shortest path from origin is "+sp);
        return sp;
    }
    public static void main(String args[]){
        Scanner sch = new Scanner(System.in);
        System.out.print("Enter your path from origin : ");
        String str = sch.nextLine();
        stringshortestpath(str);
    }
}