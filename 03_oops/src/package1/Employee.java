package package1;

public class Employee {
    private String name;
    private int age;
    private Department department;
    private int salary;

    public Employee(String name, int age, Department department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showEmployee(){
        System.out.println("Name of the employee: " + this.name);
        System.out.println("Age of the employee: " + this.age);
        System.out.println("Salary of the employee: " + this.salary);
        this.department.showDepartment();
    }
}


// Relationships between objects
/*
    1. Use-A: I am sitting on this chair which is basically a Use-A relationship. This type of relationship doesn't have a hard-connection between the entities.
    2. Has-A: I am having a pen. My pen has an ink riffle. My pen has a cap. This is basically a has-a relationship.
       2.1 OneToOne: My pen has a cap.
       2.2 OneToMany: The packet has 20 pens.
    3. Is-A: Basically Inheritance in multiple classes. Inheritance is done only for the common features between the related classes.
             In order to get rid of the overhead of repeating things in their classes, we use inheritance.
* */