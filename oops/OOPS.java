public class OOPS {    //this is the main public class
    public static void main(String args[]){    //inside public class we have main function , inside this main functions  we cerate differnt objects
        Pen p1 = new Pen();    //we have created a pen  object called p1
        
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
        p1.setColor("blue");
        System.out.println(p1.color);
        bankaccount b1 = new bankaccount();
        //b1.password = "subodh12";
        //System.out.println(b1.password);   
        //in the above line in main function we can not call the password or set the password beacuse the password is private and can be accesed only within the class
        bankaccount myacc = new bankaccount();
        myacc.username = "SubodhDhoke";
        System.out.println(myacc.username);
        myacc.setpass("xyz123");   //password has been changed using the funcion but still we cant acces the password directly we can only change
        System.out.println(myacc.getpass());   //using a getter function
        //student s1 = new student("karma");
        //System.out.println(s1.name);
        student s1 = new student();
        s1.name = "Subodh";
        s1.rollnum = 68;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        student s2 = new student("aniket");
        System.out.println(s2.name);
        student s3 = new student(26);
        System.out.println(s3.rollnum);
        student s4 = new student(s1);
        System.out.println(s4.name);
        s4.password = "xyz";
        s1.marks[2] = 50;
        for(int i = 0 ; i<3 ; i++){
            System.out.println(s4.marks[i]);
        }
        //inheritance
        //single level
        Mamals monkey = new Mamals();
        monkey.eat();
        monkey.warmblood();
        //multi level
        humans human1 = new humans();
        human1.eat();
        human1.warmblood();
        System.out.println(human1.iq);
        //hierarchial level
        Fish pirana = new Fish();
        pirana.eat();
        System.out.println(pirana.fins);
        pirana.swims();
        Bird eagle = new Bird();
        eagle.eat();
        eagle.fly();
        System.out.println(eagle.wings);
    }
}
//below are all different classes
class Pen{              //class
    //prop + functions
    //properties
    String color;
    int tip;

    //functions
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class student{           //class
    //properties
    String name;
    int age;
    int rollnum;
    String password;
    int marks[];
    //student(String stw){                       //this is an costructor
    //    name = stw;
    //    System.out.println("constructor is called...."); 
    //}
    //this is an non parameterized constructor
    student(){
        marks = new int[3];                 
    }
    //this is an parameterized constructor
    student(String name){
        marks = new int[3];                
        this.name = name;
    }
    student(int rollnum){
        marks = new int[3];
        this.rollnum = rollnum;
    }
    // shallow copy constructor
    //student(student s1){
    //    marks = new int[3];
    //    this.name = s1.name;
    //    this.age = s1.age;
    //    this.marks = s1.marks;
    //}
    //deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0 ; i<marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    //functions
    void updatename(String newname){
        name = newname;
    }
    void updateage(int newage){
        age = newage;
    }

}
class bankaccount{
    public String passw;
    private String password;
    int accnum;
    public String username;
    int cardnumber;
    public String getpass(){    //this is an getter function as it is returning the value of password
        return this.password;
    }
    public void setpass(String password){           //this is a setter function as it is only setting the value of password
        this.password = password;
    }
    
}
//inheriance
class Animals{                   //base class
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mamals extends Animals{     //derived class    //single level inheritance
    int legs;   
    void warmblood(){
        System.out.println("warmblood");
    }
}
class humans extends Mamals{                        //multi level inheritance
    int iq = 100;
    void walk(){
        System.out.println("walk");
    }
}
//hierarchial level inheritance
class Fish extends Animals{
    int fins = 2;
    void swims(){
        System.out.println("Swims");
    }
}
class Bird extends Animals{
    int wings = 2;
    void fly(){
        System.out.println("flys");
    }
}
//hybrid is the mixture of all these types of inheritance