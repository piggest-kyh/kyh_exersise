class Scratch {
    public static void main(String[] args) {

        Employee employee = new Employee("Denis", 10000);
        Manager manager = new Manager("Bob", 1000000, "IT");
        Executive executive = new Executive("Diana", 50000000, "Chair of the Board");

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());

    }
}

class Employee {
    String name;
    Integer salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return  ("Employee name is " + name + "\n Salary is " + salary);
    }
}

class Manager extends Employee{

    String department;

    public Manager(String name , int salary, String department) {
        super(name , salary);
        this.department = department;
    }

    @Override public String toString(){
        return  (super.toString() + "\n Person is a manager from " + department +" department");
    }
}


class Executive extends Manager{

    public Executive(String name , int salary, String department) {
        super(name , salary, department);

    }

    @Override public String toString(){
        return  (super.toString() + " and have position of Executive");
    }
}
