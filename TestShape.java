/*  To create an abstarct class shape with abstract methods CalculateArea() and
    CalculatePerimeter() . create subclasses circle and triangle that extends the
    shape class and implement the respective method to calculate the area and perimeter
    of each shape */ 


// create Abstract class
abstract class Shape{
    //create Abstract method
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
// Subclass of shape : circle
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    // calculate Area : circle
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    // calculate perimeter : circle
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}

// subclass of shape : Triangle
class Triangle extends Shape{
    private double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // calculate Area : Triangle
    double calculateArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
        // calculate perimeter : Triangle
    double calculatePerimeter(){
        return a+b+c;
    }
}


public class TestShape{
    public static void main(String args[]){
         // create object of subclasses
        Shape C1 = new Circle(5);
        System.out.println("Circle Area : "+C1.calculateArea());
        System.out.println("Circle Perimeter : "+C1.calculatePerimeter());

        System.out.println(" ");

         // create object of subclasses
        Shape T1 = new Triangle(3,4,5);
        System.out.println("Triangle Area : "+T1.calculateArea());
        System.out.println("Triangle Perimeter : "+T1.calculatePerimeter());


    } 
}

