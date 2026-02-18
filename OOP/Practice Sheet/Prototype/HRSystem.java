interface EmployeePrototype {
    EmployeePrototype clone();
}

class Employee implements EmployeePrototype {
    private String name, role, dept;
    private int id, salary;

    public Employee(String name, String role, String dept, int id, int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.role = role;
        this.salary = salary;
    }

    public EmployeePrototype clone() {
        return new Employee(this.name, this.role, this.dept, this.id, this.salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showDetails() {
        System.out.println("Name : " + name + "ID : " + id + "Role : " + role
                + "Depertment : " + dept + "Salary : " + salary);
    }
}

public class HRSystem {
    public static void main(String[] args) {

        EmployeePrototype protoEMP = new Employee("Name", "Software Eng.", "IT",
                000, 5000);

        Employee emp1 = (Employee) protoEMP.clone();
        emp1.setName("KArim");
        emp1.setId(111);

        Employee emp2 = (Employee) protoEMP.clone();
        emp2.setName("Arim");
        emp2.setId(11);

        ((Employee) protoEMP).showDetails();

        emp1.showDetails();
    }
}
