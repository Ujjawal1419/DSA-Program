package arrayProject;

public class EmployeeArray {
    public static void main(String[]args){
        Employee[] emp=new Employee[10];
        emp[0]= new Employee(101,"Ujjawal kumar",22,30000);
        emp[1]=new Employee(102,"Kartik motu",23,25000);
        emp[2]=new Employee(103,"Gyan gupta",21,22000);
        emp[3]=new Employee(104,"Shubham kumar",21,21000);
        emp[4]=new Employee(105,"Rohan Pandey",25,25000);
        emp[5]=new Employee(106,"Rahul kumar",42,22000);
        emp[6]=new Employee(107,"Ankit kumar",21,23000);
        emp[7]=new Employee(108,"Ashish kumar",35,23000);
        emp[8]=new Employee(109,"Krish kumar",41,28000);
        emp[9]=new Employee(110,"Vikas kumar",28,40000);

        System.out.println("All the employees:");
        for(Employee e:emp){
            e.display();
        }
        //b print and count employees with age<30
        System.out.println("===========================================");
        int countAge=0;
        System.out.println("\nEmployees with age<30: ");
        for(Employee e: emp){
            if(e.age<30){
                e.display();
                countAge++;
            }
        }
        System.out.println("count: "+countAge);

        //c) Highest and  lowest salary employee
        System.out.println("===============================================");
        Employee high=emp[0];
        Employee low= emp[0];


        for(Employee e:emp){
            if(e.salary>high.salary)
                high=e;

            if(e.salary<low.salary)
                low=e;
        }

        System.out.println("\n Highest salary Employee: ");
        high.display();


        System.out.println("lowest Salary Employee: ");
        low.display();

        // d) int search employee by id
        System.out.println("==================================================");
        int searchId=105;
        boolean foundId=false;

        for(Employee e:emp){
            if(e.id==searchId){
                System.out.println("\nEmployee found with ID "+searchId);
                e.display();
                foundId=true;
                break;
            }
        }
        if(!foundId)
            System.out.println("\nEmployee not found with Id "+searchId);

        // e) Search employee by name.
        System.out.println("===================================================");
        String searchName ="naha";
        boolean foundName=false;
        for (Employee e : emp) {
            if (e.name.equalsIgnoreCase(searchName)) {
                System.out.println("\nEmployee found with name " + searchName);
                e.display();
                foundName = true;
                break;
            }
        }
        if (!foundName)
            System.out.println("\nEmployee not found with name " + searchName);

        // f) Employees with salary more than average salary
        System.out.println("=======================================================");
        double totalSalary = 0;
        for (Employee e : emp) {
            totalSalary += e.salary;
        }

        double avgSalary = totalSalary / emp.length;
        int countAvg = 0;

        System.out.println("\nAverage Salary: " + avgSalary);
        System.out.println("Employees with salary more than average:");

        for (Employee e : emp) {
            if (e.salary > avgSalary) {
                e.display();
                countAvg++;
            }
        }
        System.out.println("Count: " + countAvg);
    }
}

