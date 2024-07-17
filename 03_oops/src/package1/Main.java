package package1;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("CSIT", "Indore");
        Department d2 = new Department("CS", "Dewas");
        Department d3 = new Department("IT", "Ujjain");

        Employee e1 = new Employee("Deependra", 20, d1, 12000);
        Employee e2 = new Employee("Aditya", 19, d2, 15000);
        Employee e3 = new Employee("Ashutosh", 21, d3, 20000);
        Employee e4 = new Employee("Aarav Singh", 20, d1, 25000);

        e1.showEmployee();
        System.out.println();
        e2.showEmployee();
        System.out.println();
        e3.showEmployee();
        System.out.println();
        e4.showEmployee();
        System.out.println();
    }
}
