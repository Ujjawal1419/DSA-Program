package arrayProject;

public class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(){

    }

    Employee(int id,String name,int age,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+age+" "+salary);
    }
}
