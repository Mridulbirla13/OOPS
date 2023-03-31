// Inheritance is of 4 types in JAVA
//1) Single Level Inheritance

class Shape{
    String color;
     public void area(){
        System.out.println("displays area");
    }
}
   //derived class   //base class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//2)Hence it is multilevel inheritance

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//3)Hence it is Hierarchical Inheritance
//
//4)Now Combining all inheritances there exists Hybrid Inheritance
//5) Now there is a 5th type of inheritance which is Multiple inheritance which is
//   in C language which in java is implemented using interfaces
public class Inheritance {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.color= "Red";
    }
}
