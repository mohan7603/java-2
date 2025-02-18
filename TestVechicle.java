/*  write a java program to create a class called Vechicle with a method called drive()
   create subclass called car that override the drive() method to printing "repairing a car"*/


class Vechicle{
    void Drive(){
        System.out.println("Driving a Vechicle...");
    }
}
// SubClass of Vechicle
class Car extends Vechicle{
    void Drive(){
        System.out.println("Repairing a Car");
    }
}
// Main class 
public class TestVechicle{
    public static void main(String[]args){
        Vechicle c1 = new Car();
        c1.Drive();
    } 
}