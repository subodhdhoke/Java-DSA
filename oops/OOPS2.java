import java.util.Scanner;
import java.nio.channels.NonWritableChannelException;
import java.util.*;
public class OOPS2{
    public static void main(String args[]){
        //overloading
        calculator c1 = new calculator();
        System.out.println(c1.sum(25, 67));
        System.out.println(c1.sum(34, 65, 45));
        System.out.println(c1.sum((float)9.3, (float)2.5));
        //overridig
        Animals a1 = new Animals();
        deer d1 = new deer();
        a1.eat();
        d1.eat();
        //abstraction
        horse h1 = new horse();
        h1.eat();
        h1.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
        //Animals1 a = new Animals1();        //this line gives an error because Animals1 is an abstract class and we cannot create instance of an abstract class
        //abstract class
        chicken ch2 = new chicken();
        System.out.println(ch2.color);
        ch2.changecolor();
        System.out.println(ch2.color);
        horse h2 = new horse();
        System.out.println(h2.color);
        h2.changecolor();
        System.out.println(h2.color);
        //Animals1 -> horse -> Mustang (constructor)
        Mustang mh1 = new Mustang();  //when constructor of Mustang class will be called then all the constructors of all parent classes will be called and executed 1st
        System.out.println(h1.color);
        h1.changecolor();
        System.out.println(h1.color);
    }
}
class calculator{                       //method/function overloading : same functions different parameters
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//function overriding
class Animals{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}
//abstaction
abstract class Animals1{
    String color;
    Animals1(){            //constructor of Animals1 class
        color = "brown";
        System.out.println("Animals1 constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends Animals1{
    horse(){                                                       //constructor of horse class
        System.out.println("horse constructor called");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends horse{      
    Mustang(){                                                   //constructor of Mustang class
        System.out.println("Mustang constructor called");
    }
}
class chicken extends Animals1{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}