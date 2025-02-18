/* write a java program to create a class called employee with methods called work()
   and getSalary . create a subclass called HRmanager that override the work()
   method and adds a new method called addEmployee(). */ 


class Employee{
    void Work()
    {
        System.out.println("Employee is Working");
    }

    double getSalary(){
        return 50000;
    }
}
class HRmanager extends Employee{
    void Work(){
        System.out.println("HR Manager hiring a employee");
    }

    void addEmployee(){
        System.out.println("Adding a new employee to the Company");
    }
}
class TestEmployee{
    public static void main(String args[]){
        HRmanager hr =new HRmanager();
        hr.Work();
        hr.addEmployee();
        System.out.println("Salary : "+hr.getSalary());


    }
}