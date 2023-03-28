 class Pen{
    //Properties or State
    String color;
    String type;
    // Functionality or Behavior
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
 }

 //Main Class
 public class OOPS{
    public static void main(String[] args){
        Pen pen1 = new Pen();  //Pen() is a Constructor
        pen1.color = "Blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();
    }
 }