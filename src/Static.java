class Student1{
    String name;
    static String school;
}
//static makes sure a function, data is common(is same)
public class Static {
    public static void main(String[] args) {
        Student1.school = "SHCS";
        Student1 student1 = new Student1();
        student1.name = "Mridul";
        System.out.println(student1.school);
    }
}
