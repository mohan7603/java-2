/* write a java program create a class called Animal with a method called MakeSound()
   create a subclass called cat that override the MakeSound() method to bark */

   
class Animal{
     void MakeSound(){
        System.out.println("Animal MakeSound...");
        
    }
}
// Subclass of Animal
class Cat extends Animal{
     void MakeSound(){
        System.out.println("Mewo Mewo...");
    } 
}
// Main class
public class TestAnimal{
    public static void main(String[] args){
       Animal Mycat = new Cat();
        Mycat.MakeSound();
    }
}