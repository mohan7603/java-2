/* To create an Abstract class Animal With an Abstract method called Sound() 
   create Subclasses Lion and Tiger that extends the Animal class and implement
   the Sound() method to make specific sound for each animal */  


//Abstract class
abstract class Animal{
    // Abstract Method
    abstract void Sound();
}
//Subclass of Animal
class Lion extends Animal{
    void Sound(){
        System.out.println("Lion roars :Roarrrr!");
    }
}

//Subclass of Animal
class Tiger extends Animal{
    void Sound(){
        System.out.println("Tiger growls : Grrrrr!");
    }
}

public class TestAnimal{
    public static void main(String args[]){
        //Create object of Subclasses
        Animal L1 = new Lion();
        Animal T1 = new Tiger();

        L1.Sound();
        T1.Sound();
    } 
}
