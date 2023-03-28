class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(Students s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Students(){

    }
}

public class OOPS2 {
    public static void main(String[] args){
        Students s1 = new Students();//Students() is Non- Parametrised Constructor
        s1.name = "Mridul";
        s1.age = 24;

        Students s2 = new Students(s1); //Students() is Parameterized Constructor
        s2.printInfo();
    }
}
