public class Employee {
    int emp_no;
    String emp_name;

    Employee(int emp_no, String emp_name) {
        this.emp_name = emp_name;
        this.emp_no = emp_no;
    }

    public void display() {
        System.out.println(emp_no +" "+emp_name);
    }
}
