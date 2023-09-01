public class OOPS3{
    public static void main(String args[]){
        //interfaces
        queen q = new queen();
        q.moves();
        //multiple inheriance using interfaces
        Omnivore O1 = new Omnivore();
        O1.eats();
        //static keyword
        student s1 = new student();
        s1.schoolname = "AECS 4";
        System.out.println(s1.schoolname);
        student s2 = new student();
        System.out.println(s2.schoolname);//here we have not defined the value of schoolname but it will print the value of s1 schoolname because schoolname is static
        s1.setschoolname("DYPSOE");      //this function can change the name of schoolname
        System.out.println(s1.getschoolname());
        student s3 = new student();
        System.out.println(s3.schoolname);
        System.out.println(s1.schoolname);
        //super keyword
        horse h1 = new horse();
        animals a1 = new animals();
        System.out.println(a1.legs);
        System.out.println(h1.legs);
    }
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}

//multiple inheritance using interfaces
interface carnivore{
    void eats();
}
interface herbivore{
    void eats();
}
class Omnivore implements herbivore,carnivore{
    public void eats(){
        System.out.println("Eats veggies and meat both");
    }
}

//static keyword
class student{
    String name;
    int rollnum;
    static String schoolname;
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return name;
    }
    void marks(){
        System.out.println("Marks obtained");
    }
    int percentage(int maths,int phy,int chem){
        return (maths+chem+phy)/3;
    }
    void setschoolname(String schoolname){
        this.schoolname = schoolname;
    }
    String getschoolname(){
        return schoolname;
    }
}

//super keyword
class animals{
    int legs;
    animals(){
        System.out.println("animal constructor called");
    }
}
class horse extends animals{
    horse(){
        super.legs = 4;   //here horse class is a different class and the leg property is defined in class animals class which is the parent class of horse by using super keyword we are refering to property of parent class
        System.out.println("horse constructor called");
    }
}
